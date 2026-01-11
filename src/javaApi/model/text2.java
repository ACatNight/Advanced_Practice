package javaApi.model;

import java.util.Scanner;

public class text2 {
		public static String getName() {
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入你的名字: ");
			String name = sc.nextLine();
			// 不在这里输出，返回给另一个文件
			return name;
		}
	}