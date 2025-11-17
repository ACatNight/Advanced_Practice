package org.acatNight.day5.test2;

public class Student extends Person {
    private String grade;

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    @Override
    public void introduce(){
        System.out.println("我是" + getName() + "读" + getGrade() + "年级");
    }

}
