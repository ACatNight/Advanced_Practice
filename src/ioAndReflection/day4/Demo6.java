package ioAndReflection.day4;

import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("ab.txt");
		int len;
		while ((len = fileReader.read()) != -1){
			System.out.print((char) len);
		}
		fileReader.close();

	}
}
