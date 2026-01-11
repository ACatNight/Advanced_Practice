package ioAndReflection.day6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//		Class clazz = Class.forName("ioAndReflection.day6.Student");
////		Constructor[] con2 = clazz.getDeclaredConstructors();//获取构造方法
////		for (Constructor con:con2){
////			System.out.println(con);
////		}
////
//		Constructor con2 = clazz.getDeclaredConstructor(String.class,int.class);
//		int modifiers = con2.getModifiers();
//		System.out.println(modifiers);
//
//		Parameter [] parameters = con2.getParameters();
//		for (Parameter parameter:parameters){
//			System.out.println(parameter);
//		}//获取所有
//
//		con2.setAccessible(true);//表示临时取消权限
//		Student stu = (Student) con2.newInstance("张三",12);//暴力反射
//		System.out.println(stu);

		Class clazz = Class.forName("ioAndReflection.day6.Student");
        Constructor con2 = clazz.getDeclaredConstructor(String.class,int.class);
		con2.setAccessible(true);
		Student stu = (Student)con2.newInstance("张三",12);
		System.out.println(stu);

	}
}
