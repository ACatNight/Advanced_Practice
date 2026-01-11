package ioAndReflection.day4;

import java.io.FileReader;
import java.io.IOException;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("ab.txt");
		int len;
		char[] chars = new char[2];
		while ((len = fileReader.read(chars))!= -1){
			System.out.println(new String(chars, 0, len));

		}
		fileReader.close();
	}
}
