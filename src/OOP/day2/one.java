package OOP.day2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        ArrayList<text1> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("输入1·录入数据");
            System.out.println("输入2·查找用户");
            int data = sc.nextInt();
            Random r = new Random();
            switch (data){
                case 1:
                    for (int i = 0; i < 3 ; i++) {
                        String userid = sc.next();
                        System.out.println("输入用户姓名");
                        String username = sc.next();
                        System.out.println("输入用户密码");
                        int password = sc.nextInt();

                        text1 s = new text1();
                        s.setId(userid);
                        s.setName(username);
                        s.setPassword(password);
                        list.add(s);
                    }
                    System.out.println("录入成功，以下是生成名单");
                    for (int i = 0; i < list.size(); i++) {
                        text1 stu = list.get(i);
                        System.out.println(stu.getId() + stu.getName());
                    }
                    break;
                case 2:
                    System.out.println("请输入要查找的用户ID：");
                    String searchId = sc.next();
                    boolean found = FindUserID(list, searchId);
                    if (!found) {
                        System.out.println("未找到该用户。");
                    }
                    break;


            }
        }
    }


    public static boolean FindUserID(ArrayList<text1> list, String id) {
        // ❌ 原代码中多余使用 Scanner 并要求再次输入 ID，逻辑混乱
        // ✅ 直接用传入的 id 查找即可
        for (int i = 0; i < list.size(); i++) {
            text1 stu = list.get(i);

            // ❌ 原来把 id 当 int 来比较：uid.equals(tempID)
            // uid 是 String，tempID 是 int，会报错。
            // ✅ 应该直接字符串比较
            if (stu.getId().equals(id)) {
                System.out.println("已经查询到用户信息：");
                System.out.println("姓名：" + stu.getName());
                System.out.println("密码：" + stu.getPassword());
                return true;
            }
        }
        return false;
    }
}


