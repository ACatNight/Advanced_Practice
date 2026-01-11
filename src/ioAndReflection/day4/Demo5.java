package ioAndReflection.day4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//编码
		String str = "我是神马";
		byte [] txt1 = str.getBytes();
		System.out.println(Arrays.toString(txt1));
		//解码
		String str2 = new String(txt1);
		System.out.println(str2);
	}
}
