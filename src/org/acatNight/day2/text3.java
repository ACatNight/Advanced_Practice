package org.acatNight.day2;

public class text3 {
    private String name;
    private int age;
    private String gray;

    public text3() {

    }

    public void setName(String name){
        this.name = name;

    }

    public String name() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGray(String gray){
        this.gray = gray;
    }
    public String getGray(){
        return gray;
    }

    public void Study(){
        System.out.println(name + "," + age + "," + gray + "正在学习");
    }
}
