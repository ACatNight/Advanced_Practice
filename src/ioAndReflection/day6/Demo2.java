package ioAndReflection.day6;

import java.lang.reflect.Field;

public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		Class clazz = Class.forName("ioAndReflection.day6.Student");
		Field [] fields = clazz.getDeclaredFields();
		//获取所有
		for (Field field:fields){
			System.out.println(field);
		}
		//获取单个
		Field name = clazz.getDeclaredField("name");
		System.out.println(name);
        //获取权限修饰符
		int modifiers = name.getModifiers();
		System.out.println(modifiers);
		//成员变量名字
		String n = name.getName();
		System.out.println(n);
		//数据类型
		Class<?> type = name.getType();
		System.out.println(type);
		//获取成员变量记录的值
		name.setAccessible(true);
		Student stu = new Student("老吴",42);
		Object value = name.get(stu);
		System.out.println(value);
		//修改对象的值
		name.set(stu,"list");
		System.out.println(stu);

	}
}
