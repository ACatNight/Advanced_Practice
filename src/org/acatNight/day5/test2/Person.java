package org.acatNight.day5.test2;

import org.acatNight.day4.text.Student;

public class Person{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void introduce(){
        System.out.println("我是" + getName());
    }
}
