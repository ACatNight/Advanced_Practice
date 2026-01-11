package javaApi.day1.math;

public class text2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 999 ; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100 % 10;
            double sum = Math.pow(g,3) + Math.pow(s,3) + Math.pow(b,3);

           if(sum == i){
               count++;
                System.out.println(i);
            }

        }
        System.out.println("当前有:" + count);

    }
}
