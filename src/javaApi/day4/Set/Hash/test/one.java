package javaApi.day4.Set.Hash.test;

import java.util.HashSet;
import java.util.Iterator;

public class one {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for(int i = 1; i <= 20; i++) hashSet1.add(i);
        for(int i = 11; i <= 30; i++) hashSet2.add(i);

        System.out.println("hashSet1: " + hashSet1);
        System.out.println("hashSet2: " + hashSet2);

        // 并集
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println("并集: " + union);

        // 交集
        HashSet<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println("交集: " + intersection);

        // 差集 (hashSet1 - hashSet2)
        HashSet<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.println("差集 (hashSet1 - hashSet2): " + difference);

        // 删除大于25的元素
        Iterator<Integer> it = union.iterator();
        while(it.hasNext()){
            if(it.next() > 25){
                it.remove();
            }
        }
        System.out.println("删除大于25后的并集: " + union);
    }
}
