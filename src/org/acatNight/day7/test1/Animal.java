package org.acatNight.day7.test1;

public class Animal {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        System.out.println("已经创建好" + name);

        return name;
    }
    public void makeSound(){
        System.out.println(name + "发出了声音");
    }
}
