package javaApi.day13.text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

public class Demo4 {
	public static void main(String[] args) {
//		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		nums.stream().filter(s->s % 2== 0).forEach(s->System.out.println(s));
//		List<String> words = Arrays.asList("apple", "banana", "orange", "avocado", "grape");
//		words.stream().filter(s->s.startsWith("a")).map(s-> s.toUpperCase()).forEach(s->System.out.println(s));
//		List<Integer> nums1 = Arrays.asList(1,2,3,4,5);
//		nums1.stream().filter(s-> s>2).map(s->s * s).forEach(s->System.out.println(s));
//		words.stream().filter(s->s.length() > 4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//
//		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		nums.stream().filter(s->s % 2 == 0).map(s->s*s).filter(s-> s > 20).forEach(s->System.out.println(s));
//		List<String> words = Arrays.asList("apple", "banana", "orange", "avocado", "grape");
//		System.out.println("======");
//		words.stream().filter(s->s.length() > 5)
//				.filter(s -> s.startsWith("a"))
//				.map(s-> s.toUpperCase())
//				.forEach(s->System.out.println(s));
//		System.out.println("========");
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//		List<Integer> list2 = Arrays.asList(6,7,8,9,10);
//		Stream.concat(list1.stream(),list2.stream()).filter(s-> s % 3 == 0).forEach(s->System.out.println(s));
//		System.out.println("=========");
//		List<String> words1 = Arrays.asList("hi", "hello", "java", "stream");
//		words1.stream().filter(s->s.length() >= 4).map(s->s.length() * s.length()).forEach(s->System.out.println(s));
//		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		nums.stream().filter(s-> s % 2 == 0).map(s-> s* s).filter(s->s % 2 == 0).forEach(s->System.out.println(s));
//		List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "orange");
//        words.stream().filter(s->s.length() >= 5).map(s-> s.toUpperCase()).forEach(s->System.out.println(s.length() + ":" + s));
//		List<Integer> list1 = Arrays.asList(1,3,5,7);
//		List<Integer> list2 = Arrays.asList(2,4,6,8,9);
//        Stream.concat(list1.stream(),list2.stream()).filter(s->s > 4).forEach(s->System.out.println(s));
//		List<String> words1 = Arrays.asList("hi", "hello", "java", "stream");
//		words1.stream().filter(s->s.length() >= 4).map(s->s.length() * s.length()).filter(s-> s > 20).forEach(s->System.out.println(s));
		class Student {
			String name;
			int score;
			int age;
			Student(String n, int s, int a) { name = n; score = s; age = a; }
		}
		List<Student> students = Arrays.asList(
				new Student("Alice", 85, 20),
				new Student("Bob", 92, 19),
				new Student("Charlie", 78, 21),
				new Student("David", 88, 20),
				new Student("Eva", 91, 19)
		);
		students.stream().filter(s-> s.score >= 85 && s.age >= 20).map(s-> s.name).forEach(s->System.out.println(s + s.length() * s.length()));



	}
}
