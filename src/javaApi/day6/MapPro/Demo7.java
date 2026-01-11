package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo7 {
    public static void main(String[] args) {
        String [] words= {"java","go","python","c","js","spring"};
        Map<Integer,Integer> map = new HashMap<>();
        for(String word : words){
            map.merge(word.length(),1,Integer::sum);

        }
        for(Map.Entry<Integer ,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
