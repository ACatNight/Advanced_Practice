package javaApi.day4.Set.Hash.test;

import java.util.HashSet;
import java.util.Iterator;

public class two {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for(int i = 0;i < 20;i++){
            int number1 = i+1;
            hashSet1.add(number1);
        }
        for(int i = 10;i < 30;i++){
            int number2 = i+1;
            hashSet2.add(number2);
        }
            System.out.print("hashSet1:" + hashSet1);
            System.out.println("");
            System.out.println("hashSet2:" + hashSet2);

            HashSet<Integer> union = new HashSet<>(hashSet1);
            union.addAll(hashSet2); //b并集
            System.out.println("并集:" + union);

            HashSet<Integer> section = new HashSet<>(hashSet1);
            section.retainAll(hashSet2); //交集
            System.out.println("交集:" + section);

            HashSet<Integer> diffSet = new HashSet<>(hashSet1);
            diffSet.removeAll(hashSet2);
            System.out.println("差集:" + diffSet);

        Iterator<Integer> it = union.iterator();
        while (it.hasNext()){
            int data = it.next();
            if (data < 25){
                it.remove();
            }
        }
        System.out.println("最后一步" + union);


    }
     }

