package javaApi.day6.MapPro;

import java.util.HashMap;
import java.util.Map;

public class Demo8 {
    public static void main(String[] args) {
        String data = "java java python java c python";
        String [] texts = data.split(" ");
        Map<String ,Integer> map = new HashMap<>();

        for(String text:texts ){
            map.merge(text,1,Integer::sum);



        }
        int maxCount = 0;
        String maxWord ="";
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();;
                maxWord = entry.getKey();
            }
        }
        System.out.println("出现次数最多的单词：" + maxWord + " -> " + maxCount);
    }
}
