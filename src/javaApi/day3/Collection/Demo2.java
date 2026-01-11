package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            String s = "学生" + (i+1);
            list.add(s);
        }

        System.out.println("普通循环");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("增强循环");
        for(String x:list){
            System.out.println(x);
        }
        Iterator<String> it = list.iterator();
        System.out.println("Iterator");
        while (it.hasNext()){
            if(it.next().equals("学生3")){
                it.remove();
            }
        }
        Iterator<String> it2 = list.iterator();;
        while (it2.hasNext()){
            String n = it2.next();
            System.out.println(n);
        }

    }
}
