package javaApi.day14.text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"张无忌","老二","老周","张强","张三丰","张水儿","王二","老王","老头");
//        long count = list.stream().count();//统计
//		System.out.println(count);
//		//toArray收集流的数据 放到数组当中
//		Object[] arr1 = list.stream().toArray());
//		System.out.println(arr1);
		String[] arr2 = list.stream().toArray(value -> new String[value]);
		System.out.println(arr2);


	}
}
