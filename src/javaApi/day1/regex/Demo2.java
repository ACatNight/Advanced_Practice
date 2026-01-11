package javaApi.day1.regex;

public class Demo2
{
    public static void main(String[] args) {
        System.out.println("af".matches(".."));//表示任一个字符
        System.out.println("1".matches("\\d")); //表示一个数字
        System.out.println("w".matches("\\w"));//任一个单词字符
        System.out.println("你".matches("\\W"));//非单词字符

        //必须是数字 字母 下划线 至少六位
        System.out.println("dsf13f".matches("\\w{6,}"));
        System.out.println("abcd".matches("[a-zA-Z0-9]{4}"));


    }
}
