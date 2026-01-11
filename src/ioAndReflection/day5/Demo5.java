package ioAndReflection.day5;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
		Scanner sc = new Scanner(System.in);
		Class<?> clazz = Class.forName("ioAndReflection.day5.ConfigManagerDemo");
		Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
		constructor.setAccessible(true);
		Object configManagerDemo = constructor.newInstance("config.txt");

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
				Method load = clazz.getDeclaredMethod("load");
				load.setAccessible(true);
				load.invoke(configManagerDemo);
                Method get = clazz.getDeclaredMethod("get", String.class);
				get.setAccessible(true);
				Object value = get.invoke(configManagerDemo,key);
				System.out.println(value);
			}
			else if (parts[0].equals("set")){
				if (parts.length != 3){
					System.out.println("请重新输入,用法: set key value");
					continue;
				}
				String key = parts[1];
				String value = parts[2];
				Method set = clazz.getDeclaredMethod("set", String.class, String.class);
				set.setAccessible(true);
				set.invoke(configManagerDemo,key,value);
			}
			else if (parts[0].equals("save")){
				if (parts.length != 1){
					System.out.println("请重新输入,用法: save");
					continue;
				}
				Method save = clazz.getDeclaredMethod("save");
				save.setAccessible(true);
				save.invoke(configManagerDemo);
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
