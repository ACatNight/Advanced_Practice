package OOP.day12.test1;

public class TEST {
    public static void main(String[] args) {
        Dog Dog = new Dog("小狗");
        Bird Bird = new Bird("小鸟");
        Dog.eat();
        Dog.jump();
        Dog.Swim();

        Bird.eat();
        Bird.FLY();
        Bird.jump();
    }
}