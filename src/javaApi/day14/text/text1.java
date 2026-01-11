package javaApi.day14.text;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class text1 {
	public static void main(String[] args) {
		class Student {
			String name;
			int score;
			int age;

			Student(String name, int score, int age) {
				this.name = name;
				this.score = score;
				this.age = age;
			}
		}

		List<Student> students = Arrays.asList(
				new Student("Alice", 85, 20),
				new Student("Bob", 92, 19),
				new Student("Charlie", 78, 21),
				new Student("David", 88, 20),
				new Student("Eva", 21, 19),
				new Student("Frank", 60, 12),
				new Student("Grace", 15, 11)
		);
		//1 第一题students.stream().filter(s->s.score >= 85).map(s->s.name).forEach(s->System.out.println(s));
		//2 第二题students.stream().filter(s->s.age >= 20 && s.score < 90).map(s->s.name).forEach(s->System.out.println(s));
	    //3 第三题long count = students.stream().filter(s-> s.score < 60).count();
		//System.out.println(count);
		//第四题
//		List<String> result = students.stream().filter(s->s.age >= 20).map(s->s.name.toUpperCase()).collect(Collectors.toList());
//		System.out.println(result);
		//第五题
//		students.stream().filter(s->s.score >=80).map(s->s.score + 10).forEach(s->System.out.println(s));
		//第六题
		students.stream()
				.filter(s -> s.name.length() >= 5 && s.score >= 85)
				.forEach(s ->
						System.out.println(s.name + ":" + s.name.length())
				);

	}

}

