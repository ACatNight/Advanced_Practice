package org.acatNight.day3;

import java.util.ArrayList;

public class two {
    public static void main(String[] args) {

        ArrayList<test3> Student = new ArrayList<>();
        test3 s1 = new test3("小米",12,"男");
        test3 s2 = new test3("小红",14,"女");
        test3 s3 = new test3("小叶",17,"男");

        Student.add(s1);
        Student.add(s2);
        Student.add(s3);

        test4.FoundMax(Student);






    }
}
