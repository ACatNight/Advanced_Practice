package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<String> inputUsers = new ArrayList<>(List.of("admin1","root","user123","test1","guest","a1"));

        Iterator<String> it = inputUsers.iterator();
        while (it.hasNext()){
            String data = it.next();
            if (data.matches("^[a-z].*\\d*.{5,}$")){
                System.out.println("合法数据");
            }else {
                it.remove();
            }

        }
        for(String n : inputUsers){
            System.out.println(n);
        }
    }
}
