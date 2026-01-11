package OOP.day7.test3;

public class Eagle extends Animal {
    @Override
    public void makeSound() {
        System.out.println(getName() + "发出了高亢的鸣叫");
        super.makeSound();
    }

    @Override
    public void move() {
        System.out.println(getName() + "在天空中翱翔");
        super.move();
    }
    @Override
    public void eat() {
        System.out.println(getName() + "正在啄食猎物");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + "在悬崖边的巢中休息");
    }
    @Override
    public void specialSkill() {
        System.out.println(getName() + "俯冲捕猎，一击必中");
    }
}
