package javaApi.day14.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
//		List<Integer> list2 =  list.stream().filter(s->s % 2 == 0).collect(Collectors.toList());
//		System.out.println(list2);
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");
        list.stream().filter(s-> Integer.parseInt(s.split(",")[1]) >= 24);
		Map<String,Integer> map = list.stream().collect(Collectors.toMap(
				s->s.split(",")[0],
				s->Integer.parseInt(s.split(",")[1])
		));
		System.out.println(map);


	}
}
