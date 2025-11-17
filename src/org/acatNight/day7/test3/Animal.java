package org.acatNight.day7.test3;

public class Animal {
    private String name;
    private int age;
    public void setAge(int age){
        if (age > 0 && age < 100){
            this.age = age;

        }else {
            System.out.println("age数据异常");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void makeSound(){

    }
    public void move(){

    }
    public void showInfo(){
        System.out.println(("========================================="));
        System.out.println("当前动物(+" + name + ")的信息");
        System.out.println(name + ":" + "年龄" + age);
    }
    public void eat(){

    }
    public void sleep(){

    }
    public void specialSkill(){

    }
}
