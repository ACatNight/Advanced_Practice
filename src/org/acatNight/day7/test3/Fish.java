package org.acatNight.day7.test3;

public class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println(getName() + "在水里发出咕噜咕噜的声音");
        super.makeSound();
    }

    @Override
    public void move() {
        System.out.println(getName() + "在水中游动");
        super.move();
    }
    @Override
    public void eat() {
        System.out.println(getName() + "正在吞食小虾和水草");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + "静静地漂浮着休息");
    }
    @Override
    public void specialSkill() {
        System.out.println(getName() + "快速地潜入深水躲避捕食者");
    }
}
