package javaApi.day7.MapProMax;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        String[] orders = {
                "apple 2 3.5",
                "banana 5 1.2",
                "orange 3 2.0",
        };
        Map<String,double[]> map = new HashMap<>();
        for(String order : orders){
            String [] posts = order.split(" ");
            String name = posts[0];
            int quantity = Integer.parseInt(posts[1]);
            double price = Double.parseDouble(posts[2]);
            double money = price * quantity;

            map.putIfAbsent(name,new double[2]);
            map.get(name)[0] += quantity;
            map.get(name)[1] += money;


        }
        for(Map.Entry<String,double[]> entry : map.entrySet()){
            double [] value = entry.getValue();;
            System.out.println(entry.getKey() + "商品销量:" + value[0] + "商品营收" + value[1]);
        }
    }
}
