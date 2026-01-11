package ioAndReflection.day1;

import java.io.File;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		//1.创建一个新的空文件
		//不会创建目录
		File f1 = new File("D:\\aaa\\c.txt");
		boolean b = f1.createNewFile();
		System.out.println(b);
		//2创建一个空目录
		File f2 = new File("D:\\aaa\\ddd");
	    boolean c =f2.mkdir();
		System.out.println(c);
		//3创建多级文件
		File f3 = new File("D:\\bbb\\ggg");
		boolean d = f3.mkdirs();
		System.out.println(d);


	}
}
