package ioAndReflection.day1;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Demo1 {
	public static void main(String[] args) {
		//返回文件的大写(字节数量)
		//只能获取文件的大小 单位是字节
		//无法获取文件夹的大小
		File f1= new File("D:\\C#练习\\ConsoleApp1");
		long len = f1.length();
		System.out.println(len / 1024 + "KB");
		//返回文件的绝对路径
		File f2= new File("D:\\C#练习\\ConsoleApp1");
	    String path = f2.getAbsolutePath();
		System.out.println(path);
		File f4 = new File("untitled\\a.txt");
        String path1 = f4.getAbsolutePath();
		System.out.println(path1);

		System.out.println("相对路径");
		System.out.println(f2.getPath());
		System.out.println(f4.getPath());
		//获取名字
		System.out.println(f2.getName());
		//获取最后的修改时间
		long millis = f2.lastModified();
		//1 时间格式化Api    变量         时间格式化Api      创建字符串
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		             //当前时间线一个点   读取时间毫秒值 绑定应用时间   带时区的日期      格式化
		String time = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).format(formatter);
		System.out.println(time);
	}
}
