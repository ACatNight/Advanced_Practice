package ioAndReflection.day5;

public class Demo3 {
	public static void main(String[] args) {
		ConfigManager configManager = new ConfigManager("config.txt");
		configManager.load();
		System.out.println(configManager.get("username"));
		configManager.set("username","admin");
		configManager.save();


	}
}
