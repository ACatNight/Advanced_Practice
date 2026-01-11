package javaApi.day14.text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"aaa","bbb","ccc","ddd");
//		list.stream().map(new Function<String, String>() {
//			@Override
//			public String apply(String s) {
//				return s.toUpperCase();
//			}
//		}).forEach(s->System.out.println(s));
		//局限性
		//是跟抽象方法的第一个参数有关 这个参数是什么类型 就用什么类型的方法
		//不能引用所以类的成员方法
		list.stream().map(String::toUpperCase).forEach(s->System.out.println(s));
	}
}
