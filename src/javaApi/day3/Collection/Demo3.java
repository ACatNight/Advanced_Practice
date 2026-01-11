package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            int num = i + 1;
            list.add(num);
        }

       Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int number = it.next();
            if (number % 2 == 1){
                it.remove();
            }
        }

        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()){
            int number2 = it2.next();
            System.out.println(number2);
        }


    }
}
