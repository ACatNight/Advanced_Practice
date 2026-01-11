package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {
        String text = "java java python c java python java c";
        String [] words = text.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String word : words){
            map.merge(word, 1, Integer::sum);//专门用来统计的

        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
