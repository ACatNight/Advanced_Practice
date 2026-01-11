package ioAndReflection.day5;

import java.io.IOException;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ConfigManagerDemo configManagerDemo = new ConfigManagerDemo("config.txt");
		System.out.println("ConfigManager启动成功");
		System.out.println("请输入命令:");
		while (true){
			System.out.print(">");
			String line = sc.nextLine();
			String [] parts = line.split("\\s+");
			if (line.equals("exit")){
				System.out.println("程序退出");
				break;
			}
            else if (parts[0].equals("get")){
				if (parts.length != 2){
					System.out.println("请重新输入,用法: get key");
					continue;
				}
				String key = parts[1];
	            System.out.println("get命令,key = " + key);
				configManagerDemo.load();
	            System.out.println(configManagerDemo.get(key));
            }
			else if (parts[0].equals("set")){
				if (parts.length != 3){
					System.out.println("请重新输入,用法: set key value");
					continue;
				}
				String key = parts[1];
				String value = parts[2];
				configManagerDemo.set(key,value);
			}
			else if (parts[0].equals("save")){
				if (parts.length != 1){
					System.out.println("请重新输入,用法: save");
					continue;
				}
				configManagerDemo.save();
				System.out.println("保存成功");
			}
			else if (parts[0].equals("help")){
				if (parts.length != 1){
					System.out.println("请重新输入,用法: help");
				}
				System.out.println("指令大全" + "\n" +
						"get,set,save,exit,help");
			}else {
				System.out.println("未知命令");
			}




		}


	}
}
