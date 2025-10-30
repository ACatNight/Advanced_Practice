package org.acatNight.day1;

import java.util.Random;

public class two {
    public static void main(String[] args) {
        test2 s2 = new test2();
        Random r = new Random();
        s2.setBrand("宝马");
        s2.setColor("红色");
        s2.setSpeed(r.nextInt(4)+1);
        s2.showInfo();

        test2 s3 = new test2();
        s3.setBrand("天马");
        s3.setColor("蓝色");
        s3.setSpeed(r.nextInt(3)+1);

        s3.showInfo();
        s3.accelerate(2);
        s3.brake(1);

        s3.showInfo();



    }

}
