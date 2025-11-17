package org.acatNight.day9.test2;

public class Undergraduate extends Student {
    private String major;
    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void showDetail() {
        System.out.println("[本科生] \t 姓名:" + getName() + "年龄:" + getAge() + "学号:" + getId() + "专业" + getMajor());
        super.showDetail();
    }
}
