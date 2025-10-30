package org.acatNight.day1;

import java.util.ArrayList;

public class three {
    public static void main(String[] args) {
        ArrayList<text3> list = new ArrayList<>();
        text3 s1 = new text3();
        text3 s2 = new text3();
        text3 s3 = new text3();
        s1.Student("张三",12);
        s2.Student("李四",23);
        s3.Student("王五",14);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size() ; i++) {
            text3 stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());


        }


    }

}
