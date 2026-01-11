package javaApi.day4.Set.Hash;

import java.util.HashSet;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        Random r = new Random();
        for(int i = 0;i < 10;i++){
            int number = r.nextInt(20)+1;
            hashSet.add(number);
        }
        for(int data:hashSet){
            System.out.println(data);
            System.out.println(hashSet.size());
        }

    }
}
