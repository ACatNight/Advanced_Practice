package OOP.day11.test1;

public class Frog extends Person implements Swim {
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("青蛙正在游泳");

    }

    @Override
    public void eat() {

        System.out.println("青蛙正在吃东西");
    }
}
