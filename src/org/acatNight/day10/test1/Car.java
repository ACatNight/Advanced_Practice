package org.acatNight.day10.test1;

public class Car extends Transport {

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "正在行驶");
    }
}
