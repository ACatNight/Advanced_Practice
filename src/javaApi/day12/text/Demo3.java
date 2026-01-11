package javaApi.day12.text;

import java.util.HashMap;

public class Demo3 {
	public static void main(String[] args) {
		//双列集合
		//1·创建双列集合
		HashMap<String,Integer> hn = new HashMap<>();
		hn.put("aaa",111);
		hn.put("bbb",222);
		hn.put("ccc",333);
		hn.put("ddd",444);
		//获取stream流
//		hn.keySet().stream().forEach(s-> System.out.println(s));
		//第二方法
		hn.entrySet().stream().forEach(s->System.out.println(s));




	}
}
