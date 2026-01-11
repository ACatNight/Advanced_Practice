package javaApi.day9.text6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        School school = new School();
        Classroom class1 = new Classroom("一班");

        // 关键一步：先加班级
        school.addClassRoom(class1);

        Student s1 = new Student("001", "小明");
        s1.setScore("语文", 32);
        s1.setScore("数学", 52);

        Student s2 = new Student("002", "小王");
        s2.setScore("语文", 42);
        s2.setScore("数学", 12);

        Admin s3 = new Admin("003", "老吴");

        // 通过 School 调度
        school.addClassData("一班", s1);
        school.addClassData("一班", s2);
        school.addClassData("一班", s3);

        // 正确打印
        System.out.println("人数: " + class1.getStudentCount());
        System.out.println("总分: " + class1.getTotalScore());
        System.out.println("平均分: " + class1.getAveScore());
    }
}