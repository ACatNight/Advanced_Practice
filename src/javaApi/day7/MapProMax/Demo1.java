package javaApi.day7.MapProMax;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String[] orders = {
                "apple 2 3.5",
                "banana 5 1.2",
                "orange 3 2.0",
        };
        Map<String,double []> shop = new HashMap<>();
        for(String order:orders){
            String [] data = order.split(" ");
            String name = data[0];
            int count = Integer.parseInt(data[1]);
            double price = Double.parseDouble(data[2]);

            double money = price * count;
            shop.putIfAbsent(name,new double[2]);
            shop.get(name)[0] += count;//销量
            shop.get(name)[1] += money;//营收
        }
        for(Map.Entry<String,double[]> entry:shop.entrySet()){
            double [] value = entry.getValue();
            System.out.println(entry.getKey() + ":" + value[0] + "," + value[1]);
        }




    }
}
