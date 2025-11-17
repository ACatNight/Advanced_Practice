package org.acatNight.day9.test2;

public class Graduate extends Student {
    private String teacher;
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public String getTeacher(){
        return teacher;
    }

    @Override
    public void showDetail() {
        System.out.println("[研究生] \t 姓名:" + getName() + "年龄:" + getAge() + "学号:" + getId() + "导师" + getTeacher());
        super.showDetail();
    }
}
