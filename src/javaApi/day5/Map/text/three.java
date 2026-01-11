package javaApi.day5.Map.text;

import java.util.HashMap;
import java.util.Map;

public class three {
    public static void main(String[] args) {
        String data ="小明=78,小红=92,小刚=59,小月=88,小李=60";

        String [] posts = data.split(",");
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> levels = new HashMap<>();
        for(String post:posts){
            String [] kv = post.split("=");
            String name = kv[0];
            int score = Integer.parseInt(kv[1]);
            map.put(name,score);
        }
        int pass = 0;
        int notPass = 0;
        String level;
        int count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() >= 60){
                pass += 1;
            }else {
                notPass+=1;
            }
            if(entry.getValue() >= 90 && entry.getValue() <= 100){
                level = "优秀";

            }else if(entry.getValue() >= 80 && entry.getValue() <= 89){
                level = "良好";
            }else if(entry.getValue() >= 60 && entry.getValue() <= 79 ){
                level = "及格";
            }else {
                level = "不及格";
            }
            levels.put(level, levels.getOrDefault(level, 0) + 1); //取旧值

        }
            System.out.println("及格人数" + pass);
            System.out.println("不及格人数:" + notPass);
        System.out.println("当前等级划分");
        for(Map.Entry<String ,Integer> entry : levels.entrySet()){
                System.out.println(entry.getKey() + ":" + entry.getValue() + "人数");
            }




    }
}
