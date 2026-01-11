package javaApi.day4.Set.Hash.test;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>(List.of("admin","tom","joker"));
        HashSet<String> blackList = new HashSet<>(List.of("root","hacker"));

        System.out.println("请输入用户名");
        Scanner sc =new Scanner(System.in);
        String status;//状态码
        String userName = sc.next();
        if (userName.length() < 4){
            status = "INVALID";
        } else if (blackList.contains(userName)) {
            status = "BANNED";
            
        }else if (!users.contains(userName)){
            status = "NO_USER";

        }else {
            System.out.println("登录成功");
            status = "OK";
        }
        switch (status){
            case "OK":
                System.out.println("登录成功，欢迎你：" + userName);
                break;
            case "NO_USER":
                System.out.println("账号不存在，请先注册");
                break;
            case "BANNED":
                System.out.println("账号已被封禁");
                break;
            case "INVALID":
                System.out.println("用户名不合法");
                break;
            
        }
        

    }
}
