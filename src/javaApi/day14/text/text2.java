package javaApi.day14.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class text2 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list1,
				"张强,25","王伟五,30","李勇,22","刘杰,28","陈涛,35","赵磊,19"
		);
		Collections.addAll(list2,
				"杨芳,24","杨娜,27","张敏,21","刘婷,29"
		);
		List<String> list = list1.stream()
				.filter(s -> s.split(",")[0].length() == 3)
				.collect(Collectors.toList());
		List<String> list3 = list2.stream()
				.skip(1)
				.filter(s -> s.split(",")[0].startsWith("杨"))
				.collect(Collectors.toList());
		List<text3> list4 = Stream.concat(list.stream(), list3.stream())
				.map(s -> new text3(
						s.split(",")[0],
						Integer.parseInt(s.split(",")[1])
				))
				.collect(Collectors.toList());

		System.out.println(list4);


	}
}
