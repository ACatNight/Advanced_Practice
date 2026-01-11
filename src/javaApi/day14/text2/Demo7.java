package javaApi.day14.text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"张三,12","老王,16","叶落,42");
		List<text2> list1 = list.stream().map(text2::new).collect(Collectors.toList());
		System.out.println(list1);

	}
}
