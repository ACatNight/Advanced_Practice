package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo5 {
    public static void main(String[] args) {
        String s = "aabccdd";
        String [] words = s.split("");
        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.merge(word,1,Integer::sum);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
