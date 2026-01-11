package ioAndReflection.day5;

public class Demo2 {
	public static void main(String[] args) {
		ConfigLoader loader = new ConfigLoader("config.txt");
		loader.load();
//		System.out.println(loader.get("username"));
//		System.out.println(loader.get("timeout"));
		loader.set("timeout", "60");
		loader.set("username", "root");
		loader.save();
		System.out.println("保存完成");
	}
}
