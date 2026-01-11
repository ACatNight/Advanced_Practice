package javaApi.day2.Object;

public class Demo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));//false
        //因为eq方法是被s调用 s是字符串
        //所以eq要看string类里面
        //字符串中的eq方法 先判断方法是否为字符串
        //如果是字符串在比较内部熟悉;
        //如果不是就返回false
        System.out.println(sb.equals(s));
        //eq方法要看builder中的eq方法
        //这边builder没有重写eq方法
        //使用的是Object中的
        //obj默认用的是地址值  比较两个对象的地址值
        //而这边地址值不一样 所以返回false


    }
}
