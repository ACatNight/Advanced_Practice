package ioAndReflection.day1;

import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		//删除文件 空文件
		//细节1 如果删除的是文件 则直接删除 不走回收站
		//如果删除的是空文件 则直接删除 不走回收站
		//如果删除的是有内容的文件夹 则删除失败
		File f1 = new File("D:\\aaa\\c.txt");
	    boolean b1 = f1.delete();
		System.out.println("删除成功" + b1);

		//删除文件
		File f2 = new File("D:\\aaa\\ddd");
		boolean b2 = f2.delete();
		System.out.println("删除成功" + b2);

	}
}
