package javaApi.day5.Map.text;

import java.util.HashMap;
import java.util.Map;

public class text {
    public static void main(String[] args) {
        String text = "java python java c# java python go";
        String [] words = text.split( " ");

        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else {
                map.put(word, 1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
