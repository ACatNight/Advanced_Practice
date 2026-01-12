package ioAndReflection.day7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class configManager {
	private File configFile;
	private Map<String,String> configMap = new HashMap<>();

	public configManager(String path){
		this.configFile = new File(path);
	}
	@Command("load")
	public void load(){
		if (!configFile.exists()){
			System.out.println("文件不存在");
			return;
		}
		try(BufferedReader br = new BufferedReader(new FileReader(configFile))) {
			String line;
			while ((line = br.readLine()) != null){
				if (line.isEmpty() || line.startsWith("#")){
					continue;
				}
				int idx = line.indexOf("=");
				if (idx == -1){
					continue;
				}
				String key = line.substring(0,idx);
				String value = line.substring(idx+1);
				configMap.put(key,value);
			}

		}catch (IOException e){
			e.printStackTrace();
		}
	}
    @Command("save")
	public void save(){
		if (!configFile.exists()){
			System.out.println("文件不存在");
			return;
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(configFile))) {
			for (Map.Entry<String,String> entry: configMap.entrySet()){
				bw.write(entry.getKey() + "=" + entry.getValue());
				bw.newLine();
			}
			System.out.println("保存完成");
		}catch (IOException e){
			e.printStackTrace();
		}
	}
    @Command("set")
	public String set(String key,String value){
		return configMap.put(key,value);
	}

	@Command("get")
	public String get(String key){
		return configMap.get(key);
	}


}
