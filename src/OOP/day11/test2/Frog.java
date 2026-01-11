package OOP.day11.test2;

public class Frog extends Person implements Swim {

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃东西");
    }

    @Override
    public void Swim() {

    }
}
