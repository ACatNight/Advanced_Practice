package javaApi.day9.text5;

import java.util.Scanner;

public class MainText {
    public static void main(String[] args) {
        School school = new School();
        ClassRoom class1 = new ClassRoom("一班");
        school.addClassRoom(class1);

        Student s1 = new Student("001", "小明");
        s1.setScore("语文", 80);
        s1.setScore("数学", 90);

        Student s2 = new Student("002", "小红");
        s2.setScore("语文", 70);
        s2.setScore("数学", 60);

        class1.addUser(s1);
        class1.addUser(s2);

        System.out.println(s1.getName() + " 总分：" + s1.getTotalScore());
        System.out.println(s2.getName() + " 平均分：" + s2.getAverageScore());
    }
}