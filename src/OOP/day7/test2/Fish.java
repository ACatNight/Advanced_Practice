package OOP.day7.test2;

public class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println(getName() + "在吐泡泡");
        super.makeSound();
    }
    public void swim(){
        System.out.println(getName() + "在水中游动");
    }
}
