package javaApi.day14.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"张无尽-男-15","周月-女-32","李青山-男-28","王小雨-女-19","陈远航-男-41","赵思涵-女-24","刘建国-男-55","孙晓梅-女-36","黄子轩-男-17"
		);
		List<String>newList = list.stream().filter(s->"女".equals(s.split("-")[1])).collect(Collectors.toList());
		System.out.println(newList);
		Map<String,Integer> map = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toMap(
				s->s.split("-")[0],
				s->Integer.parseInt(s.split("-")[2])
		));
		System.out.println(map);

	}
}
