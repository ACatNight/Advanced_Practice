package org.acatNight.day10.test1;

public abstract class Transport {
    private String name;

    public Transport(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void move();





}
