package javaApi.day4.Set.Hash.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class three {
    public static void main(String[] args) {
        HashSet<String> regUser = new HashSet<>(List.of("user1","admin","root123","test","guest","abc"));
        HashSet<String> blackList = new HashSet<>(List.of("root123","test","hacker","baduser"));

        System.out.println("注册:" + regUser);
        System.out.println("非法:" + blackList);

        HashSet<String> legalUser = new HashSet<>(regUser);
        legalUser.removeAll(blackList);
        System.out.println("合法用户:" + legalUser);

        HashSet<String> tryUser = new HashSet<>(regUser);
        tryUser.retainAll(blackList);
        System.out.println("异常:" + tryUser);

        regUser.addAll(blackList);
        System.out.println(regUser);
        Iterator<String> it = regUser.iterator();
        while (it.hasNext()){
            int  data = it.next().length();
            if (data < 5){
                it.remove();
            }


        }
        System.out.println("最后" + regUser);

    }
}
