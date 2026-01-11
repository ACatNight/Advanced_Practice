package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String text = "java python java c# java python";
        String [] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            // 在这里写一行
            map.put(word, map.getOrDefault(word,0)+1);
        }




    }
}
