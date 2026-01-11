package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        String text = "java python java c# java";
        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }

        System.out.println(map);

    }
}
