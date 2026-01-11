package javaApi.day12.text;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
	public static void main(String[] args) {

		//单列集合获取Stream流
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"a","b","b","b","a","b","d");
		//获取一条流水线 并把集合的数据放在流水线
//		Stream<String> stream1 = list.stream();
//		//使用终结方法打印一下流水线上的所有数据
////		stream1.forEach(new Consumer<String>() {
////			@Override
////			public void accept(String s) {
////				//s 依次表示流水线上的每个数据
////				System.out.println(s);
////			}
////		});
		list.stream().forEach(s-> System.out.println(s));



	}
}
