package javaApi.day5.Map.text;

import java.util.HashMap;
import java.util.Map;

public class one {
    public static void main(String[] args) {
        String text = "java python java c# python c#";
        String [] words = text.split(" ");

        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else {
                map.put(word, 1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
