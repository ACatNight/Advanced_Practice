package ioAndReflection.day4;

import java.io.FileWriter;
import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("a.txt",true);//true续写
		char [] chars = {'\n','我','a'};
		fileWriter.write(chars);
		fileWriter.close();

	}
}
