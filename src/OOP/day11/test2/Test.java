package OOP.day11.test2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小狗",12);
        Rabbit r = new Rabbit("兔子",1);
        Frog f = new Frog("青蛙",23);

        System.out.println(d.getName() + d.getAge());
        d.eat();
        d.Swim();

        r.eat();
        System.out.println(r.getName() + r.getAge());
    }
}
