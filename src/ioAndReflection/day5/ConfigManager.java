package ioAndReflection.day5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
	private Map<String,String> configMap = new HashMap<>();
	private File configFile;
	public ConfigManager(String path){
		this.configFile = new File(path);
	}
	public void load(){
		if (!configFile.exists()){
			System.out.println("配置文件不存在");
			return;
		}

		try(BufferedReader br = new BufferedReader(new FileReader(configFile))) {
			String line;
			while ((line = br.readLine()) != null){
				if (line.trim().isEmpty() || line.startsWith("#")){
					continue;
				}
				int idx = line.indexOf("=");
				if (idx == -1){
					continue;
				}
				String key = line.substring(0,idx).trim();
				String value = line.substring(idx+1).trim();
				configMap.put(key,value);
			}

		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public void set(String key,String value){
		configMap.put(key,value);
	}
	public void save(){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(configFile))) {
			for (Map.Entry<String,String> entry: configMap.entrySet()){
				bw.write(entry.getKey() + "=" + entry.getValue());
				bw.newLine();
			}

		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public String get(String key){
		return configMap.get(key);
	}
}
