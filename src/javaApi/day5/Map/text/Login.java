package javaApi.day5.Map.text;

import java.util.*;

public class Login {
    public static void main(String[] args) {
        String data = "tom=1,lucy=1,admin=3";
        String [] posts = data.split(",");
        Map<String, Integer> users = new TreeMap<>((a,b)->{
            if(a.length()!= b.length()){
                return  a.length() - b.length();
            }
            return a.compareTo(b);
        });
        for(String post:posts){
            String [] kv = post.split("=");
            String user = kv[0].trim();;
            int count = Integer.parseInt(kv[1]);
            users.put(user,count);
        }
        Map<String,String> user = new HashMap<>();//用户账号
        Set<String> blackList = new HashSet<>(List.of("root","user","hacker"));
        Scanner sc = new Scanner(System.in);

        boolean start = true;
        while (start){
            System.out.println("====== 用户系统 ======\n" +
                    "1. 注册\n" +
                    "2. 登录\n" +
                    "3. 查看所有用户\n" +
                    "4. 查看登录次数排行\n" +
                    "0. 退出\n");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 0:
                    start = false;
                    break;
                case 1:
                    String status;
                    if (!blackList.isEmpty()){
                        System.out.println("请输入您的账号");
                        String tempUser = sc.next();
                        tempUser = tempUser.trim();
                        if (tempUser.length() < 4){
                            status = "INVALID";
                        }else if(blackList.contains(tempUser)){
                            status = "BANNED";

                        }else if (users.containsKey(tempUser)){
                            status = "YES_USER";


                        }else{
                            status = "OK";
                        }
                        switch (status){
                            case "OK":
                                System.out.println("请输入密码");
                                String tempPass = sc.next();
                                user.put(tempUser,tempPass);
                                users.put(tempUser,0);
                                break;
                            case  "INVALID" :
                                System.out.println("输入异常");
                                break;
                            case "BANNED" :
                                System.out.println("您的账号在封禁名单");
                                break;
                            case  "YES_USER":
                                System.out.println("您的账号已存在");
                                break;

                        }
                    }else {
                        System.out.println("您已注册");
                    }
                    break;
                case 2:


                    System.out.println("请输入您的账号");
                    String tUser = sc.next();
                    System.out.println("请输入您的密码");
                    String tPass = sc.next();
                    if (blackList.contains(tUser)){
                        System.out.println("您的账号已被封禁");
                    }else if(!user.containsKey(tUser)) {
                        System.out.println("您的账号不存在，快去注册");
                    }
                    if (user.containsKey(tUser) && user.get(tUser).equals(tPass)) {
                        System.out.println("恭喜您登录成功");
                        users.put(tUser,users.get(tUser) + 1);
                    }else {
                        System.out.println("登录失败");
                    }
                    break;

                case 3:
                    for(Map.Entry<String,Integer> entry : users.entrySet()){
                        System.out.println(entry.getKey() + "登录次数:" + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("登录次数排名表");
                    for (Map.Entry<String,Integer> entry : users.entrySet()){
                       System.out.println("ID:" + entry.getKey() + ":" + "次数" + entry.getValue());
                    }
                    break;
            }
        }




    }
}
