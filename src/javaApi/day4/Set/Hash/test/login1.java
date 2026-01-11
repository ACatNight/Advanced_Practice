package javaApi.day4.Set.Hash.test;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class login1 {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>(List.of( //合法用户名单
                "admin", "tom", "jack", "lucy", "guest"
        ));
        HashSet<String> blackList = new HashSet<>(List.of( //黑名单
                "root", "hacker", "test"
        ));
        Boolean start = true;
        Scanner sc = new Scanner(System.in);
        while (start){
            System.out.println("用户系统");
            System.out.println("0·退出\n" + "1·注册" + "\n" + "2·登录\n");
            int Choose = sc.nextInt();
            switch (Choose){
                case 1:
                    String status;
                    System.out.println("请输入用户名:");
                    String tempUser = sc.next();
                    if (tempUser.length() < 4){
                        status = "INVALID";//非法输入
                    }else if (blackList.contains(tempUser)){
                        status = "BANNED";//用户已被封禁

                    }else if(users.contains(tempUser)){
                        status = "YES_USER";//用户已存在
                    }else {
                         status = "OK";
                    }
                    switch (status){
                        case "INVALID":
                            System.out.println("非法输入");
                            break;
                        case "BANNED" :
                            System.out.println("用户已经被封禁了");
                            break;
                        case "YES_USER" :
                            System.out.println("用户已存在");
                            break;
                        case "OK" :
                            users.add(tempUser);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("请输入账号");
                    int count = 0;
                    boolean flag = true;
                    while (flag){
                        count++;
                        System.out.println("请输入账号");
                        String tUser = sc.next();
                        if (users.contains(tUser)){
                            System.out.println("登录成功" + tUser);
                            flag = false;

                        }else {
                            System.out.println("登录失败,当前还有" + count + "次机会" );
                        }
                        if (count == 3){
                            flag = false;

                        }




                    }
                    break;


                case 0 :
                    start = false;
                    break;

            }
        }
    }
}
