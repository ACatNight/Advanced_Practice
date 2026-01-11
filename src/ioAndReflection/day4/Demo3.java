package ioAndReflection.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileOutputStream fos = new FileOutputStream("ab.txt");
		FileInputStream fis = new FileInputStream("abc.txt");
		int b;
		while ((b = fis.read()) != -1){
			fos.write((char)b);
		}

		long end = System.currentTimeMillis();
		fos.close();
		fis.close();
		System.out.println((end - start) + "ms");


	}
}
