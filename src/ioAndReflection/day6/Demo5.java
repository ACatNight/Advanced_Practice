package ioAndReflection.day6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo5 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Class clazz = Class.forName("ioAndReflection.day6.Student");
		Method m = clazz.getDeclaredMethod("eat", String.class);
		m.setAccessible(true);
		Student s = new Student();
		m.invoke(s,"苹果");
	}
}
