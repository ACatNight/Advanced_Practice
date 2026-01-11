package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = List.of("学生1","学生2","学生3","学生3","学生4","学生5");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String data = it.next();
            if (data.matches(".*[3-9]*.")){
                it.remove();
            }
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()){
            String data2 = it2.next();
            System.out.println(data2);
        }
    }
}
