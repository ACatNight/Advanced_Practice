package javaApi.day13.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list,"张无忌-15","老二-12","老周-53","老周-23","张三丰-23");
		//apply方法的参数 依次表示里面每个数据
		//返回值 表示转换后的数据

		//当map方法执行完毕后 流上数据变成整数
		//所以下面foreach当中 s依次
		list.stream().map(new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				String [] arr = s.split("-");
				String ageString = arr[1];
				int agre = Integer.parseInt(ageString);
				return agre;

			}
		}).forEach(s->System.out.println(s));
		System.out.println("==============");
		list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));
		

	}
}
