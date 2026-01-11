package ioAndReflection.day2;

import java.io.File;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		File f = new File("D:\\aaa");
		//listFiles方法
		//作用获取aaa文件夹的所有内容 存在数组
		File[] files = f.listFiles();
		for (File file:files){
			//file依次表示aaa文件夹里面的每一个文件 或者文件夹
			System.out.println(file);
		}
		File [] arr = File.listRoots();
		System.out.println(Arrays.toString(arr));
		//读取系统的所有硬盘


		//获取当前文件夹里面的名字
		String [] lists = f.list();
		for (String list:lists){
			System.out.println(list);
		}

	}
}
