package OOP.day11.test3;

public abstract class Coach extends Person {
    public abstract void teach();

    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }
}
