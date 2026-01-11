package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30 ; i++) {
            int number = i +1;
            list.add(number);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int n = it.next();
            if(n % 3 == 0){
                it.remove();
            }
        }
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()){
            int n2 = it2.next();
            System.out.println(n2);
        }
        System.out.println("剩余元素个数:");
        System.out.println(list.size());

    }
}
