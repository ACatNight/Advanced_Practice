package javaApi.day14.text2;

public class Demo3 {

	public static void main(String[] args) {
		Son son = new Son();
		Runnable r = son::hello; /* 这里用方法引用 */;
        r.run();
		Father father = new Father();
		Runnable f = father::say;
		f.run();
		

	}
}
class Father {
	public void say() {
		System.out.println("Father say");
	}

	public static void staticSay() {
		System.out.println("Father static say");
	}
}

class Son extends Father {
	@Override
	public void say() {
		System.out.println("Son say");
	}

	public void hello() {
		System.out.println("Son hello");
	}

	public static void staticHello() {
		System.out.println("Son static hello");
	}
}

