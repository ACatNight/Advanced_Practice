package javaApi.day14.text2;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
	public static void main(String[] args) {
		Integer[] arr = {3,5,4,1,6,2};
		//匿名内部类
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
//		System.out.println(Arrays.toString(arr));

		//lambda表达式
		//因为第二个参数类型是一个函数接口
		Arrays.sort(arr,(Integer o1,Integer o2)->{
			return o2 - o1;
		});
//		System.out.println(Arrays.toString(arr));
		//简化
		Arrays.sort(arr,(o1,o2)->
				o2 - o1);
//		System.out.println(Arrays.toString(arr));

		//方法引用
		//1.引用处需要是函数式接口
		//2.被引用的方法需要已经存在
		//3被引用方法形参和返回值需要跟抽象方法的形参和返回值保持一致
		//4.被引用方法功能需要满足当前需求
		Arrays.sort(arr,Demo1::subtraction);
		System.out.println(Arrays.toString(arr));
	}
	public static int subtraction(int num1,int num2){
		return num2 - num1;
	}
}
