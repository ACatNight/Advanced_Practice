package ioAndReflection.day6;

public class Student {
	private String name;
	private int age;
	public Student(){

	}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void sleep(){
		System.out.println("正在睡觉");
	}
	public void eat(String something){
		System.out.println("在吃" + something);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
