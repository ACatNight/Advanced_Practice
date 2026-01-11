package javaApi.day4.Set.Tree.test;

import com.sun.source.tree.Tree;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class one {
    public static void main(String[] args) {
        //第一题
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(List.of(5,1,3,5,2,1,9));
        for(int x:treeSet){
            System.out.println(x);
        }
        System.out.println("============");
        //第二题
        int min = treeSet.first(); //最小
        int max = treeSet.last();//最大
        System.out.println("最大值" + max);
        System.out.println("最小值" + min);
        System.out.println("============");
        //第三题
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        for (int i = 0; i < 20 ; i++) {
            int number = i+1;
            treeSet2.add(number);
        }
//        treeSet2.subSet(5,15); 因为不会修改原有的
        SortedSet<Integer> sub = treeSet2.subSet(5, 15);//所以要这样
        System.out.println(sub);
        System.out.println(treeSet2);
        System.out.println("============");
        //第四题
        TreeSet<String> treeSet3 = new TreeSet<>();
        treeSet3.addAll(List.of("banana","apple","pear","orange"));
        //按照字符编码 进行排序
        System.out.println(treeSet3);
        System.out.println("============");
        //第五题
        TreeSet<String> treeSet4 = new TreeSet<>((a,b) -> a.length() - b.length());
        treeSet4.addAll(List.of("java","python","c","js"));
        System.out.println(treeSet4);
        System.out.println("============");
        //第六题
        TreeSet<String> treeSet5 = new TreeSet<>((a,b)-> a.length() - b.length());
        treeSet5.addAll(List.of("aa","bb","ccc","ddd"));
        System.out.println(treeSet5);
        //不太懂
        //第七题
        SortedSet<Integer> tree = new TreeSet<>();
        tree.addAll(List.of(10,3,6,1));
        System.out.println(tree);
        //因为比较规划

        //第八题

        TreeSet<Integer> scores = new TreeSet<>((a,b)->a-b);
        scores.addAll(List.of(98,85,23,54,23,64,100,23));
        System.out.println(scores);
        int min1 = scores.first();
        int max1 = scores.last();
        System.out.println("max:" + max1);
        System.out.println("min:" + min1);

        SortedSet<Integer> scoreA = scores.subSet(60,90);
        System.out.println("60-90区间");
        System.out.println(scoreA);

        //第九题
        Student score = new Student("小明",42);
        Student score2 = new Student("小钱",32);
        Student score3 = new Student("小话",52);
        Student score4 = new Student("小天",83);
        TreeSet<Student> Scores = new TreeSet<>((a, b) -> {
            if(a.getScore() != b.getScore()){
                return (int) (a.getScore() - b.getScore());
            }
            return a.getName().compareTo(b.getName());
        }
        );
        Scores.add(score);
        Scores.add(score2);
        Scores.add(score3);
        Scores.add(score4);

        for(Student score1 :Scores){
            System.out.println("======");
            System.out.println(score1.getName());
            System.out.println(score1.getScore());
        }


    }
}
