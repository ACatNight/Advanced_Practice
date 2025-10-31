package org.acatNight.StudnetCore;


import java.util.ArrayList;
import java.util.Scanner;

public class Core {
    public static void main(String[] args) {
        boolean running = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean Start = true;

        ArrayList<String> Usernames = new ArrayList<>();
        ArrayList<String> Passwords = new ArrayList<>();

        while (Start){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1注册 2登录 3忘记密码");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    RegisterUser(Usernames,Passwords);

                    break;
                case 2:
                    if (Usernames.isEmpty() && Passwords.isEmpty()){
                        System.out.println("当前未注册");
                    }
                    LoginUser(Usernames,Passwords);
                    Start = false;
                    running = true;
                    System.out.println("登录成功");


                    break;
                case 3:
                    if (Usernames.isEmpty() && Passwords.isEmpty()){
                        System.out.println("当前未注册");
                    }
                    ForgotPassword(Usernames,Passwords);



                    break;
                case 4:
                    Start = false;
            }



        }






        while (running) {
            System.out.println("\"-------------欢迎来到学生管理系统----------------\"\n" +
                    "\"1：添加学生\"\n" +
                    "\"2：删除学生\"\n" +
                    "\"3：修改学生\"\n" +
                    "\"4：查询学生\"\n" +
                    "\"5：显示学生名单\"\n" +
                    "\"6：退出\"\n" +
                    "\"请输入您的选择:\"");
            int data = sc.nextInt();
            switch (data) {
                case 1:
                    AddStudent(list);
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("当前没有用户数据");
                        break;
                    }
                    DelStuDent(list);
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("当前没有用户数据");
                        break;
                    }
                    SetUser(list);

                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("当前没有用户数据");
                        break;
                    }
                    QueryUser(list);
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("当前没有用户数据");
                        break;
                    }
                    ShowInfo(list);


                    break;

                case 6:

                    running = false;
                    break;
                default:
                    System.out.println("您输入的选择有问题,请重新输入");
                    break;


            }

        }
    }

    public static void RegisterUser(ArrayList<String> Usernames, ArrayList<String> Passwords) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入您的用户名：");
            System.out.println("\t用户名长度必须在3~15位之间");
            System.out.println("\t只能是字母加数字的组合，但不能是纯数字");

            String name = sc.next();

            // 检查用户名是否合法
            if (!Usernames.contains(name)
                    && name.length() >= 3 && name.length() <= 15
                    && name.matches("[A-Za-z0-9]+")
                    && !name.matches("\\d+")) {

                System.out.println("用户名合法！");
                Usernames.add(name);

                while (true) {
                    System.out.println("请输入密码：");
                    String pwd1 = sc.next();

                    System.out.println("请再次输入密码确认：");
                    String pwd2 = sc.next();

                    if (pwd1.equals(pwd2)) {
                        Passwords.add(pwd1);
                        System.out.println("注册成功！");
                        return; //注册完成后退出整个方法
                    } else {
                        System.out.println("两次输入的密码不相同，请重新输入！");
                    }
                }

            } else {
                System.out.println("用户名不合法，请重新输入！");
            }
        }
    }

    public static void LoginUser(ArrayList<String> Usernames, ArrayList<String> Passwords){
        System.out.println("欢迎来到登录界面");
        Scanner sc = new Scanner(System.in);
        boolean online = true;
        while (online){
            System.out.println("请输入你的用户账号");
            String Temp = sc.next();
            System.out.println("请输入你的密码");
            String pass = sc.next();
            if (Usernames.contains(Temp)){

                for (int i = 0; i < Passwords.size() ; i++) {
                    String TempPass  = Passwords.get(i);
                    boolean correctPassword = TempPass.equals(pass);
                    if (correctPassword){
                        System.out.println("登录成功");
                        online = false;
                    }else {
                        System.out.println("登录失败");
                    }



                }


            }else {
                System.out.println("用户不存在");
            }

        }


    }

    public static void ForgotPassword(ArrayList<String> Usernames,ArrayList<String> Passwords){
        System.out.println("请输入您的账户，进行修改密码");
        Scanner sc = new Scanner(System.in);
        String TempUser = sc.next();
        for (int i = 0; i < Usernames.size() ; i++) {
            if (Usernames.contains(TempUser)){
                System.out.println("用户正确");
                System.out.println("请你修改密码");
                String pass = sc.next();
                Passwords.set(i,pass);
                System.out.println("密码修改成功");
                System.out.println("您当前的账号:" + Usernames.get(i));
                System.out.println("您当前的密码:" + Passwords.get(i));



            }else {
                System.out.println("没有该用户");
            }
        }

    }


    public static void AddStudent(ArrayList<Student> list) {
        System.out.println("请先设置学生人数");
        Scanner sc = new Scanner(System.in);
        boolean idExists = false;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Student user = new Student();

            System.out.println("请输入ID");

            while (true) {
                System.out.println("请输入ID");

                String id = sc.next();
                for (Student temp : list) {
                    if (temp.getUserID().equals(id)) {
                        idExists = true;
                        break;
                    }
                }

                if (idExists) {
                    System.out.println("错误：该 ID 已经存在，请重新输入！");
                    idExists = false;

                } else {
                    System.out.println("ID 可用，继续输入其他信息...");
                    user.setUserID(id);
                    break;
                }
            }

            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            System.out.println("请输入家庭住址");
            String address = sc.next();
            user.setName(name);
            user.setAge(age);
            user.setHomeAddress(address);

            list.add(user);
        }


    }

    public static void DelStuDent(ArrayList<Student> list) {
        System.out.println("请输入ID进行删除ID");
        Scanner sc = new Scanner(System.in);
        System.out.println("当前名单");
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            System.out.println(user.getUserID() + "," + user.getName());
        }
        boolean flag = false;

        String tempID = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            if ((user.getUserID().equals(tempID))) {
                list.remove(i);
                System.out.println("已删除ID为 " + tempID + " 的学生。");
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println(" 没有找到该ID的学生。");

        }
    }

    public static void SetUser(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("当前学生名单");
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            System.out.println(user.getUserID() + "," + user.getName());
        }

        boolean idExists = false;
        String tempID = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            if (user.getUserID().equals(tempID)) {
                System.out.println("已找到当前ID(请重新设置当前ID数据)");
                while (true) {
                    System.out.println("请输入学生ID,进行修改");

                    String id = sc.next();
                    for (Student temp : list) {
                        if (temp.getUserID().equals(id)) {
                            idExists = true;

                            break;
                        }
                    }

                    if (idExists) {
                        System.out.println("错误：该 ID 已经存在，请重新输入！");
                        idExists = false;

                    } else {
                        System.out.println("ID 可用，继续输入其他信息...");
                        user.setUserID(id);
                        break;
                    }
                }
                System.out.println("请输入姓名");
                String name = sc.next();
                user.setName(name);
                System.out.println("请输入年龄");
                int age = sc.nextInt();
                user.setAge(age);
                System.out.println("请输入家庭住址");
                String address = sc.next();
                user.setHomeAddress(address);
                break;

            }

        }
        System.out.println("以下是修改后的学生数据");
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            System.out.println("用户ID:" + user.getUserID() + "," + "用户姓名:" + user.getName() + "," + "用户年龄:" + user.getAge() + "," + "用户家庭地址:" + user.getHomeAddress());
        }

    }

    public static void QueryUser(ArrayList<Student> list) {
        System.out.println("当前学生ID");
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            System.out.println(user.getUserID());
        }
        System.out.println("请输入ID，查询学生详细信息");
        Scanner sc = new Scanner(System.in);
        String TempID = sc.next();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            if (user.getUserID().equals(TempID)) {
                System.out.println("查询完毕,当前学生信息");
                System.out.println(user.getUserID() + "," + user.getName() + "," + user.getAge() + "," + user.getHomeAddress());
                flag = true;


            }

        }
        if (!flag){
            System.out.println("未查询到");
        }

    }
    public static void ShowInfo(ArrayList<Student> list){
        System.out.println("用户ID\t\t用户姓名\t\t用户年龄\t\t用户地址");
        for (int i = 0; i < list.size(); i++) {
            Student user = list.get(i);
            System.out.println(user.getUserID() + "\t\t\t" + user.getName() + "\t\t\t" + user.getAge() + "\t\t\t" + user.getHomeAddress());
        }
    }
}