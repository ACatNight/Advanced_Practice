package javaApi.day4.Set.Hash;

import java.util.HashSet;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        String s1 = "Java";
        String s2 = "Python";
        String s3 = "C#";
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

            if(hashSet.contains(s)){
                System.out.println("存在");
            }else {
                System.out.println("不存在");
            }




    }
}
