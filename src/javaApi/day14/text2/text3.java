package javaApi.day14.text2;

public class text3 {
	private String name;
	private int age;
    public text3(){

    }
	public text3(String str){
		String [] arr = str.split(",");
		this.name = arr[0];
		this.age = Integer.parseInt(arr[1]);

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return  name + "-" + age;

	}
}
