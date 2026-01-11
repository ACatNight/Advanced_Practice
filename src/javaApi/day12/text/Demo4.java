package javaApi.day12.text;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		//数组流
		int [] arr = {1,2,3,4,5,6,7,8,9};
		String [] arr2 = {"a","b","c","d"};
		Arrays.stream(arr).forEach(s->System.out.println(s));
        Arrays.stream(arr2).forEach(s2->System.out.println(s2));
	}
}
