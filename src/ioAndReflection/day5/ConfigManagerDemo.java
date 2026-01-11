package ioAndReflection.day5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigManagerDemo {
	private Map<String,String> configMap = new HashMap<>();
	private File configFile;

	public void load() throws IOException {
		if (!configFile.exists()){
			System.out.println("文件不存在");
			return;
		}
		try(BufferedReader br = new BufferedReader(new FileReader(configFile))) {
			String line;
			while ((line = br.readLine()) != null){
				if (line.isEmpty() || line.startsWith("#")) {
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
		}
	}
	public String get(String key){
	   return configMap.get(key);
	}
	public void set(String key,String value){
		configMap.put(key,value);
	}
	public void save(){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(configFile,true)) ) {
			for (Map.Entry<String,String> entry : configMap.entrySet()){
				bw.write(entry.getKey() + "=" + entry.getValue());
				bw.newLine();
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public ConfigManagerDemo(){

	}
	public ConfigManagerDemo(String path){
		this.configFile = new File(path);
	}
}
