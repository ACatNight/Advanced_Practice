package javaApi.day4.Set.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 10 ; i++) {
            int number = r.nextInt(10)+1;
            hashSet.add(number);
        }
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            int it2 = it.next();
            if (it2 > 5){
                it.remove();
            }
        }
        Iterator<Integer> it3 = hashSet.iterator();
        while (it3.hasNext()){
            int it4 = it3.next();
            System.out.println(it4);
        }
    }
}
