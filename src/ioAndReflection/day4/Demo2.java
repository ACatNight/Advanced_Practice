package ioAndReflection.day4;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("ab.txt");
		int b;
		while ((b = fileInputStream.read()) != -1){
			System.out.println((char) b);
		}
       fileInputStream.close();
	}
}
