package javaApi.model;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 什么是方法？
        // 方法 = 一段可以重复使用的“动作”
        // 调用方法 = 执行这段动作

        // 调用 sayHello 方法，打印问候
        sayHello("小明"); // 你可以修改名字

        // 调用 add 方法，计算 1 + 2
        int sum = add(1,2);
        System.out.println(sum); // 输出结果
        int [] Student = new int[2]; // 创建一个长度为2的数组，存储2个学生成绩
        // 调用菜单方法，开始学生管理面板
        Menu(Student);
    }

    // 打印问候的方法
    public static void sayHello(String name) {
        System.out.println("你好," + name);
    }

    // 计算两数和的方法，返回结果
    public static int add(int a, int b) {
        return a + b;
    }

    // 菜单方法：显示功能菜单并循环处理用户选择
    public static void Menu(int [] Student){
        boolean flag = true; // 控制菜单循环
        Scanner sc = new Scanner(System.in);

        while (flag){
            // 显示菜单选项
            System.out.println("1·请输入添加学生成绩");
            System.out.println("2·打印学生");
            System.out.println("3·退出");

            int Choose = sc.nextInt(); // 用户选择功能

            // 根据用户选择调用对应方法
            switch (Choose){
                case 1:
                    AddStudent(Student); // 输入学生成绩
                    break;
                case 2:
                    ShowInfo(Student); // 打印学生成绩
                    break;
                case 3:
                    flag = false; // 关闭菜单循环，退出系统
                    break;
            }
        }
    }

    // 添加学生成绩的方法
    public static void AddStudent(int [] Student){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Student.length ; i++) {
            System.out.println("请输入学生成绩");
            int score = sc.nextInt(); // 用户输入成绩
            Student[i] = score; // 存入数组
        }
    }

    // 打印学生成绩的方法
    public static void ShowInfo(int [] Student){
        for (int i = 0; i < Student.length ; i++) {
            System.out.println("学生" + (i+1) + " " +Student[i]);
        }
    }

}
