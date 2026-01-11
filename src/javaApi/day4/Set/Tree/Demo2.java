package javaApi.day4.Set.Tree;

import java.util.List;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>((a,b)-> a.length() - b.length()); //去重
        treeSet.addAll(List.of("java","java","sql","Map"));
        System.out.println(treeSet);




    }
}
