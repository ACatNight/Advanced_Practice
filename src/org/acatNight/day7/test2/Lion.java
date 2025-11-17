package org.acatNight.day7.test2;

public class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println(getName() + "开始吼叫");
        super.makeSound();
    }
    public void hunt(){
        System.out.println(getName() + "开始捕猎 ");
    }
}
