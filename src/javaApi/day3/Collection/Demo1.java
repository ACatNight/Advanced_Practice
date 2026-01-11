package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();


        for(int i = 1;i <= 10;i++){
            int num = r.nextInt(100)+1;
            list.add(num);

        }
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for(int x:list ){
            if(x > max){
                max = x;
            }
            if(x < min){
                min = x;
            }
            sum+=x;

        }
        sum = sum / list.size();
        System.out.println("最大值:" + max);
        System.out.println("最小值:" + min);
        System.out.println("平均数:" + sum);


        for(int rand:list){
            System.out.println(rand);
        }
        System.out.println(list.size());


    }
}
