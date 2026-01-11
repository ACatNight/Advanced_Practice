package javaApi.day14.text2;

public class text1 {
	private String name;
	private int age;
	public text1(){

	}
	public text1(String str){
		String [] arr = str.split(",");//擦粉
		this.name = arr[0];
		this.age = Integer.parseInt(arr[1]);
	}
	public text1(String name,int age){
		this.name = name;
		this.age= age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "text1{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

