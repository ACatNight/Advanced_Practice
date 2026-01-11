package javaApi.day5.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("小红",43);
        map.put("小明",85);
        map.put("小月",92);
        map.put("小刚",78);
        map.put("小李",90);
        boolean s = map.containsKey("小华");



        if (s){
            System.out.println("小华在");
        }else {
            System.out.println("小华不在成绩表");
        }
        map.put("小明",95);
        map.remove("小刚");
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println("姓名:" + entry.getKey() + ",成绩:" + entry.getValue());
        }

    }
}
