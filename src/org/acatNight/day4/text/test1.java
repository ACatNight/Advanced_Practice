package org.acatNight.day4.text;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.exmple("小明",12,"男");
        Student s2 = new Student();
        s2.exmple("小红",16,"男");
        Student s3 = new Student();
        s3.exmple("小花",19,"女");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        StudentUtil s = new StudentUtil();
        s.Util(list);





    }
}
