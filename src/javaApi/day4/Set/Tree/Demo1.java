package javaApi.day4.Set.Tree;

import java.util.List;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1,2,5,2,6,1,6)); //自动去重 和排序
        for(int data:treeSet){
            System.out.println(data);
        }
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.addAll(List.of("banana", "apple", "orange", "apple", "pear" //按照字符编码进行排序
        ));
        for(String tree : treeSet2){
            System.out.println(tree);
        }
        TreeSet<Integer> treeSet3 = new TreeSet<>((a,b) -> b - a); //a - b升序 b-a降序

        treeSet3.addAll(List.of(88, 92, 76, 88, 100, 92, 60, 76
        ));
        System.out.println("========");
        for(int tree3:treeSet3){
            System.out.println(tree3);
        }
        //first / last
        int max = treeSet3.first();//最大值
        int min = treeSet3.last();//最小值
        System.out.println("======");
        System.out.println(max);
        System.out.println(min);


    }
}
