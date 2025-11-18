package org.acatNight.day10.test1;

public class Boat extends Transport {
    public Boat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "正在划船");
    }
}
