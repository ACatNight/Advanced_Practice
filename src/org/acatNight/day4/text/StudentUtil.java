package org.acatNight.day4.text;

import java.util.ArrayList;

public class StudentUtil {
    public void Util(ArrayList<Student> Student){
        int max = Student.get(0).getAge();
        for (int i = 0; i < Student.size() ; i++) {
            if (max < Student.get(i).getAge()){
                max = Student.get(i).getAge();
            }

        }
        System.out.println("当前年龄最大的是" + max);
    }
}
