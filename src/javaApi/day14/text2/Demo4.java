package javaApi.day14.text2;

import javaApi.day11.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"老张,12","老王,15","老叶,42");
//		List<text1> newlist = list.stream().map(new Function<String, text1>() {
//			@Override
//			public text1 apply(String s) {
//				String [] arr = s.split(",");
//				String name = arr[0];
//				int age = Integer.parseInt(arr[1]);
//				return new text1(name,age);
//			}
//		}).collect(Collectors.toList());
//		System.out.println(newlist);
		//1.引用处需要是函数式接口
		//2.被引用的方法需要已经存在
		//3被引用方法形参和返回值需要跟抽象方法的形参和返回值保持一致
		//4.被引用方法功能需要满足当前需求
		List<text1> newlist = list.stream().map(text1::new).collect(Collectors.toList());
		System.out.println(newlist);


	}
}
