package javaApi.day12.text;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("老王1");
		list1.add("老二");
		list1.add("老三1");
		list1.add("大王");
		list1.stream().filter(name -> name.startsWith("老")).filter(name-> name.length() == 3).forEach(name->System.out.println(name));
//		ArrayList<String> list2 = new ArrayList<>();
//		for (String name:list1){
//			//判断name开头
//			if (name.startsWith("老")){
//				list2.add(name);
//			}
//		}
//		System.out.println(list2);
//		ArrayList<String> list3 = new ArrayList<>();
//		for (String name:list2){
//			if (name.length() == 3){
//				list3.add(name);
//			}
//		}
//		System.out.println(list3);
	}
}
