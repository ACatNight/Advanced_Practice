package javaApi.day5.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("小明",23);//添加数据
        map.put("小月",42);
        map.put("小天",62);
        map.put("小人",21);
        map.put("小光",64);

        System.out.println(map.get("小明")); //获取小明的成绩
        System.out.println(map.containsKey("小额")); //判断map中是否有 对应的值
        map.put("小明",31);
        map.remove("小天");

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("姓名：" + entry.getKey() + ",成绩:" + entry.getValue());
        }


    }
}
