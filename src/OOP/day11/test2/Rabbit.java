package OOP.day11.test2;

public class Rabbit extends Person {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃草");
    }
}
