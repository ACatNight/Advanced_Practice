package ioAndReflection.day6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo4 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("ioAndReflection.day6.Student");
	    Method[] methods=	clazz.getMethods(); //获里面所有的方法对象(包括父类中所有的公共方法)
		for (Method method:methods){
			System.out.println(method);
		}
		System.out.println("==================");
		Method [] methods1 = clazz.getDeclaredMethods();//获取里面所有方法对象(不能获取父类的 但是可以获取本类的私有对象
		for (Method method : methods1){
			System.out.println(method);
		}
		System.out.println("==================");
		//获取指定唯一方法
		Method m = clazz.getDeclaredMethod("eat", String.class);
		System.out.println(m);
		//获取方法的修饰符
		int modifiers = m.getModifiers();
		System.out.println(modifiers);
		//获取方法的名字
		String name = m.getName();
		//获取方法的形参
		Parameter [] parameters = m.getParameters();
		for (Parameter parameter:parameters){
			System.out.println(parameter);
		}
		//获取方法的异常
		Class<?>[] exceptionTypes = m.getExceptionTypes();
		for (Class exceptionType : exceptionTypes){
			System.out.println(exceptionType);
		}
		//获取方法的返回值
		Student s = new Student();
		//s 表示方法的调用者
		//苹果 表示调用方法的时实际参数
		m.setAccessible(true);
		m.invoke(s, "苹果");


	}
}
