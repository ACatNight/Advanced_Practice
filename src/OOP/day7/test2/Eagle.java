package OOP.day7.test2;

public class Eagle extends Animal {
    @Override
    public void makeSound() {
        System.out.println(getName() + "鸣叫");
        super.makeSound();
    }
    public void fly(){
        System.out.println(getName() + "在天空翱翔");
    }
}
