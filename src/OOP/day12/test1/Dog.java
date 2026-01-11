package OOP.day12.test1;

public class Dog extends Person implements swim{
    public Dog(){

    }
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃饭");

    }

    @Override
    public void jump() {
        System.out.println(getName() + "在跳跃");

    }

    @Override
    public void Swim() {
        System.out.println(getName() + "会游泳");
    }
}
