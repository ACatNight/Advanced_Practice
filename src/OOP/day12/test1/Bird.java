package OOP.day12.test1;

public class Bird extends Person implements fly{

    public Bird(){

    }
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃饭");

    }

    @Override
    public  void jump() {
        System.out.println(getName() + "在跳");

    }


    @Override
    public void FLY() {
        System.out.println(getName() + "在飞翔");

    }
}
