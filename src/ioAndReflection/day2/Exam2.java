package ioAndReflection.day2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Exam2 {
	public static void main(String[] args) {
		File file = new File("aaa");
		Map<String,Integer> map = new HashMap<>();
		scan(file,map);
		for (Map.Entry<String,Integer> entry: map.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
	public static void scan(File dir,Map<String,Integer> map){
		File [] files = dir.listFiles();
		if (files == null){
			return;
		}//防空指针
		for (File file:files){
			String name = file.getName();
			if (file.isDirectory()){
				scan(file,map);
				//我现在手里这个是谁，递归就把谁传下去
			}else if (name.endsWith(".txt")){
             map.put("txt", map.getOrDefault("txt",0)+1);
			}else if(name.endsWith(".doc")){
				map.put("doc", map.getOrDefault("doc",0)+1);
			}else if(name.endsWith(".jpg")){
				map.put("jpg", map.getOrDefault("jpg",0)+1);
			}
		}


	}




}
