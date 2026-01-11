package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> data =new ArrayList<>(List.of("java","java","mysql","spring","mysql"));
        List<String> result = new ArrayList<>();
        for (String s : data) {
            if (!result.contains(s)) {//查重
                result.add(s);
            }
        }
        for (String n2 : result) {
            System.out.println(n2);
        }
    }
}
