package javaApi.day6.MapPro;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Map<String,String> user = new HashMap<>();
        Map<String,Integer> users= new HashMap<>();
        List<Map.Entry<String, Integer>> list = //取出来
                new ArrayList<>(users.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue()); //设定规则 进行排序 这个 b-a 是升序
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag){
            String status;
            System.out.println("1·注册");
            System.out.println("2·登录");
            System.out.println("3·退出");
            System.out.println("4·查看次数");
            int Choose = sc.nextInt();
            switch (Choose){
                case 1:
                    System.out.println("请输入您的账号");
                    String tUserName = sc.next();
                    if (tUserName.length() < 4){
                        status = "INVALID";
                    }else if(user.containsKey(tUserName)){
                        status = "YES_USER";

                    }else  {
                        status = "OK";
                    }
                    switch (status){
                        case "INVALID":

                            System.out.println("输入异常");
                            break;
                        case "YES_USER":
                            System.out.println("用户已存在");
                            break;
                        case "OK":
                            System.out.println("请输入密码");
                            String tPass = sc.next();
                            user.put(tUserName,tPass);
                            users.putIfAbsent(tUserName,0); //用于新用户初始化为0
                            System.out.println("注册成功");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("请输入账号");
                    String tUser = sc.next();
                    System.out.println("请输入密码");
                    String tPass = sc.next();
                    if (user.containsKey(tUser) && user.get(tUser).equals(tPass)){
                        System.out.println("登录成功");
                        users.put(tUser,users.getOrDefault(tUser,0)+1);

                    }else {
                        System.out.println("登录失败");
                    }
                    break;

                case 3:
                    flag = false;
                    break;

                case 4:
                    System.out.println("===== 登录次数排行榜 =====");
                    for (Map.Entry<String, Integer> entry : list) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    break;
            }

        }
    }
}
