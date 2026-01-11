package javaApi.day4.Set.Hash;

import java.util.HashSet;

public class Demo5 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int i = 0; i < 10 ; i++) {
            int number = i + 1;
            hashSet1.add(number);
        }
        for (int i = 5; i < 15 ; i++) {
            int number2= i+1;
            hashSet2.add(number2);
        }
        hashSet1.addAll(hashSet2);//合并

        for(int number:hashSet1){
            System.out.println(number);
        }

    }
}
