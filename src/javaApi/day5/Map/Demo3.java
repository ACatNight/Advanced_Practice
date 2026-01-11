package javaApi.day5.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        String text = "java python java c# python java c#";

        // 1. 拆分字符串
        String[] words = text.split(" ");

        // 2. 创建 Map
        Map<String, Integer> map = new HashMap<>();

        // 3. 统计次数
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // 4. 遍历输出
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
