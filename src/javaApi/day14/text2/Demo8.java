package javaApi.day14.text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"张三,12","老王,42","王二,15","四月,32");
		List<text3> list1 = list.stream().map(text3::new).collect(Collectors.toList());;
		System.out.println(list1);


	}
}
