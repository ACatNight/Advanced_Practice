package ioAndReflection.day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);

		Class<?> clazz = Class.forName("ioAndReflection.day7.configManager");
		Constructor<?> collections = clazz.getDeclaredConstructor(String.class);
		collections.setAccessible(true);
		Object object = collections.newInstance("config.txt");

		Map<String,Method> commandMap = new HashMap<>();
		for (Method method : clazz.getDeclaredMethods()){
			if (method.isAnnotationPresent(Command.class)){
				Command cmd = method.getAnnotation(Command.class);
				method.setAccessible(true);
				commandMap.put(cmd.value(),method);

			}

		}

		while (true){
			System.out.println(">");
			String line = sc.nextLine();
			if (line == null || line.trim().isEmpty()) {
				continue;
			}
			String [] parts = line.split("\\s+");
			String cmdName = parts[0];
			if ("exit".equals(cmdName)){
				System.out.println("退出程序");
			}
			if ("help".equals(cmdName)){
				System.out.println("可以用命令" + commandMap.keySet());
				continue;
			}

			Method method = commandMap.get(cmdName);
			if (method == null){
				System.out.println("未知命令");
			}
			Object [] argsMethod = new Object[parts.length - 1];
			for (int i = 1;i < parts.length;i++){
				argsMethod[i - 1] = parts[i];
			}
			Object result = method.invoke(object,argsMethod);
			if (result != null){
				System.out.println(result);
			}


		}


	}
}
