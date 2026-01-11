package OOP.day7.test3;

public class Lion extends Animal{
    @Override
    public void makeSound() {
        System.out.println(getName() + "发出了低沉的吼叫");
        super.makeSound();
    }

    @Override
    public void move() {
        System.out.println(getName() + "在草原奔跑");
        super.move();
    }
    @Override
    public void eat(){
        System.out.println(getName() + "正在吃肉");

    }
    @Override
    public void sleep(){
        System.out.println(getName() + "正趴在地上睡觉");
    }
    @Override
    public void specialSkill(){
        System.out.println(getName() + "发出了怒吼");
    }

}
