package OOP.day10.test1;

public class Plane extends Transport{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "正在飞行");
    }
}
