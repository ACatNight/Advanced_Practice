package javaApi.day1.regex;

public class Demo1 {
    public static void main(String[] args) {
//        String qq = "2206739445";
//        System.err.println(checkQQ(qq));
//        用正则方法
        String qq = "2206739445";
                             //      (范围)开始-结束
        System.out.println(qq.matches("[1-9]\\[5-19]"));
        String s1 = "a";
        System.out.println(s1.matches("[a-c]"));
        //[a-z] [A-Z] [0-9] [a-zA-Z0-9] [a-dm-p]
    }
 //传统方法
//    public static boolean checkQQ(String qq){
//        int len = qq.length();
//
//        if (len < 6 && len > 20){
//             return false;
//        }
//        if(qq.startsWith("0")){
//            return false;
//        }
//        for (int i = 0; i < qq.length() ; i++) {
//            char q = qq.charAt(i);
//            if(q < '0' || q > '9'){
//                return false;
//            }
//        }
//        return true;
//    }
}
