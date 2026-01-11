package javaApi.day12.text;

import java.util.stream.Stream;

public class Demo5 {
	public static void main(String[] args) {
		//一堆杂乱数据
		Stream.of(1,2,3,4,5,6).forEach(s-> System.out.println(s));
		Stream.of("a","b","c","d","e","f").forEach(s-> System.out.println(s));
	}

}
