package javaApi.day14.text;

public class text3 {
	private String name;
	private int age;

	// ✅ 必须加的构造方法
	public text3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter / setter（可留可不留）
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// ✅ 关键：重写 toString
	@Override
	public String toString() {
		return "text3{name='" + name + "', age=" + age + "}";
	}
}

