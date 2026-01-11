package ioAndReflection.day4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("ab.txt");
//		fos.write(97);
//		byte [] text = {97,88,76,86,45,43};
//		fos.write(text,1,2);
		String txt1 = "我是真神";
		byte [] bytes = txt1.getBytes();
		String txt2 = "\r\n";
		String txt3 = "我是真神";
		byte [] bytes1 = txt2.getBytes();
		byte [] bytes2 = txt3.getBytes();
		fos.write(bytes);
		fos.write(bytes1);
		fos.write(bytes2);

		fos.close();

	}
}
