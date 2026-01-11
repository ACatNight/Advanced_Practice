package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12,53,23,872,323,23,-2));

        Iterator<Integer> it =list.iterator();
        while (it.hasNext()){
            int data = it.next();
            if (data < 0 || data > 100){
                it.remove();
            }
        }
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for(int number:list){
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
            sum = sum + number;
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("sun:" + sum);


    }
}
