package javaApi.day13.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo1 {
	public static void main(String[] args) {
		/*

		skip 跳过前几个
		注意1：中间方法 返回新的流时 原来的流只能用一次 建议使用链式编程
		注意2: 修改流数据中 不会影响原来的集合或数组
		 */
		//	filter 筛选
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"张无忌","老二","老周","张强","张三丰","张水儿","王二","老王","老头");
//        list.stream().filter(s-> s.startsWith("张"))
//		        .filter(s ->s.length() == 3)
//		        .forEach(s -> System.out.println(s) );
//		//		limit 获取前几个
//		list.stream().limit(3).forEach(s -> System.out.println(s));
//		System.out.println("======");
//		//skip 跳过前几个
//		list.stream().skip(3).forEach(s->System.out.println(s));
		list.stream().skip(3).limit(3).forEach(s->System.out.println(s));

	}
}
