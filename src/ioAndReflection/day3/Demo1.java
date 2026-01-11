package ioAndReflection.day3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) {
		File file = new File("D:\\");
		Map<String, Integer> map = new HashMap<>();
		scan(file, map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	public static void scan(File dir, Map<String, Integer> map) {
		File[] files = dir.listFiles();
		if (files == null) {
			return;
		}
		for (File file : files) {
			String name = file.getName();
			if (file.isDirectory()) {
				scan(file, map);
			} else if (name.endsWith(".avi")) {
				map.put("avi", map.getOrDefault("avi", 0) + 1);
			} else if (name.endsWith(".java")) {
				map.put("java", map.getOrDefault("java", 0) + 1);
			} else if (name.endsWith(".doc")) {
				map.put("doc", map.getOrDefault("doc", 0) + 1);
			} else if (name.endsWith(".txt")) {
				map.put("txt", map.getOrDefault("txt", 0) + 1);
			}
		}

	}
}