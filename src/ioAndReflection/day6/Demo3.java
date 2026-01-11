package ioAndReflection.day6;

import java.lang.reflect.Field;

public class Demo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		Class clazz = Class.forName("ioAndReflection.day6.Student");
		Field [] fields = clazz.getDeclaredFields();
		for (Field field : fields){
			System.out.println(field);
		}
		Field name = clazz.getDeclaredField("name");
		System.out.println(name);

		name.setAccessible(true);
		Student stu = new Student("老吴",23);
		Object obj = name.get(stu);
		System.out.println(obj);
		name.set(stu,"老王");
		System.out.println(stu);
	}
}
