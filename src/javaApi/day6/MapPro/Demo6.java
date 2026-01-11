package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo6 {
    public static void main(String[] args) {
        int [] scores = {78,64,34,23,77,54,99,34,2,100};
        Map<String,Integer> map = new HashMap<>();

        for(int score : scores){
            String level;
            if (score >= 90 && score <= 100){
                level = "优秀";
                map.merge(level,1,Integer::sum);

            }else if (score >= 60 && score <= 89){
                level = "良好";
                map.merge(level,1,Integer::sum);

            }else {
                level = "不及格";
                map.merge(level,1,Integer::sum);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
