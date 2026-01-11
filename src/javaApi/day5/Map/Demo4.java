package javaApi.day5.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {
        String data ="小明=78,小红=92,小刚=59,小月=88,小李=60";
        String [] parts = data.split(",");
        Map<String,Integer> map = new HashMap<>();
        for(String part:parts){
            String [] kv = part.split("=");
            String name = kv[0];
            int score = Integer.parseInt(kv[1]);
            map.put(name,score);
        }
        String level;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() >= 60){
                level = "及格";
            }else {
                level = "不及格";
            }
            System.out.println(entry.getKey() + ":" + entry.getValue() + "(" + level + ")");

        }



    }
}
