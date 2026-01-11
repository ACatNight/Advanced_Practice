package ioAndReflection.day3;

import java.io.File;
import java.util.Scanner;

public class Demo3 {
	static long totalCount = 0;
	static long scannedCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File root = new File("D:\\");

		System.out.println("正在统计总数...");
		countAll(root);
		System.out.println("总文件/目录数：" + totalCount);

		System.out.println("开始扫描...");
		long start = System.currentTimeMillis();
		System.out.println("请输入查找文件");
		String tTemp = sc.next();
		scan(root,tTemp);
		long end = System.currentTimeMillis();
		System.out.println("\n扫描完成！");
		System.out.println("本次查找耗时" + (end - start) + "ms");



	}
	public static void countAll(File dir){
		File [] files = dir.listFiles();
		if (files == null){
			return;
		}
		for (File file:files){
			if (file.isDirectory()){
				countAll(file);
			}else {
				totalCount++;
			}
		}
	}
	public static void scan(File dir,String tFile){
		File [] files = dir.listFiles();
		if (files == null){
			return;
		}
		for (File file:files){
			if (file.isDirectory()){
				scan(file,tFile);
			}else {
				scannedCount++;
				if (scannedCount % 200 == 0 || scannedCount == totalCount){
					showProgress();

				}else {
					if(file.getName().equals(tFile)) {
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
	public static void showProgress(){
		int barLength = 30;
		double percent = (double) scannedCount / totalCount;
		int filled = (int) (percent * barLength);

		StringBuilder bar = new StringBuilder("[");
		for (int i = 0; i < barLength; i++) {
			if (i < filled) {
				bar.append("=");
			} else {
				bar.append(" ");
			}
		}
		bar.append("]");

		System.out.printf(
				"\r%s %.2f%% (%d/%d)",
				bar,
				percent * 100,
				scannedCount,
				totalCount
		);
	}

}
