package javaApi.day1.math;

public class MathDemo {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-54));        // 54
        // 向上取整
        System.out.println(Math.ceil(43.63));    // 44.0
        // 向下取整
        System.out.println(Math.floor(13.23));   // 13.0
        // 四舍五入
        System.out.println(Math.round(23.2));    // 23
        // 获取最大值
        System.out.println(Math.max(54, 23));    // 54
    }
}