package javaApi.day1.math;

public class text3 {
    public static void main(String[] args) {
    int count = 0;
    for(int i = 10000;i<= 99999;i++){
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100 % 10;
        int qian = i / 1000 % 10;
        int w = i / 10000 % 10;
        double sum = Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(bai,5) + Math.pow(qian,5) + Math.pow(w,5);

        if (sum == i){
            count++;
            System.out.println(i);
        }
    }
        System.out.println(count);

    }
}