package javaApi.day13.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		//distinct 元素去重
		ArrayList<String> list1 = new ArrayList<>();
		Collections.addAll(list1,"张无忌","老二","老周","老周","张三丰","张三丰","王二","老王","老头");
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2,"聊多","里尔");

		list1.stream().distinct().forEach(s->System.out.println(s));

		Stream.concat(list1.stream(),list2.stream()).forEach(s->System.out.println(s));
	}
}
