package OOP.day11.test1;

public class test {
    public static void main(String[] args) {
        Frog f = new Frog("小青蛙",12);
        System.out.println(f.getName() + "," + f.getAge());

        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小白",1);

        System.out.println(f.getName() + f.getAge());
        r.eat();


    }
}
