package ioAndReflection.day2;

import java.io.File;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) throws IOException {
		//第一题
//		File f1 = new File("aaa//a.txt");
//		boolean flag = f1.createNewFile();
//		if (flag){
//			System.out.println("已创");
//		}else {
//			System.out.println("创建失败");
//		}
		//第二题
		File file = new File("D:\\aaa\\ccc");
		String [] files = file.list();
		for (String file1:files){
			if (file1.endsWith("avi")){
				System.out.println("已找到");
			}else  {
				System.out.println("当前没有这个文件");
			}
		}


	}
}
