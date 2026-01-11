package ioAndReflection.day3;

import java.io.File;
import java.util.Scanner;

public class Demo2 {
	static boolean found = false;
	static long fileCount = 0;
	static long dirCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("D:\\");
		System.out.println("请输入要查询的文件名");
		String tFile = sc.next();
		long start = System.currentTimeMillis();

		scan(file,tFile);
		long end = System.currentTimeMillis();
		System.out.println("本次查找耗时" + (end - start) + "ms");
		System.out.println("当前已扫描:" + fileCount + "目录");
		System.out.println("已扫描:" + dirCount + "文件");

	}
	public static void scan(File dir,String tFile){
		File [] files = dir.listFiles();
		if (files == null){
			return;
		}
		for (File file:files){
			String name = file.getName();

			if (file.isDirectory()) {
				fileCount++;
			scan(file,tFile);
			}else {
				dirCount++;
				if (name.equals(tFile)) {
					System.out.println("查询成功");
					System.out.println("该文件的绝对定位");
					System.out.println(file.getAbsolutePath());
					long size = file.length();
					System.out.println("该文件大小" + size / 1024 + "KB");

				}
			}



		}
	}
}
