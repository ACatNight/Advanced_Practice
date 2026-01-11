package ioAndReflection.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\text\\1.mp4");
		FileInputStream fis = new FileInputStream("E:\\红色精神的技术力量\\1.mp4");
	    int len;
		byte [] bytes = new byte[1024 * 1024 * 5];
		long start = System.currentTimeMillis();
		while ((len = fis.read(bytes)) != -1){
			fos.write(bytes,0,len);
		}
	    long end =System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		fos.close();
		fis.close();
	}
}
