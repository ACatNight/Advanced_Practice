package OOP.day9.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentCore = new ArrayList<>();
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        while (start){
            System.out.println("===== 学生管理系统 =====\n" +
                    "1. 添加学生\n" +
                    "2. 查看所有学生\n" +
                    "3. 查找学生（通过学号）\n" +
                    "4. 修改学生信息（年龄）\n" +
                    "5. 删除学生\n" +
                    "6. 退出系统\n" +
                    "=======================\n" +
                    "请选择：");
            int choose1 = sc.nextInt();
            switch (choose1){
                case 1:
                    System.out.println("该学生是:");
                    System.out.println("1.本科生" + "\n" +
                            "2.研究生" + "\n" +
                            "3.留学生");
                    int choose2 = sc.nextInt();
                    switch (choose2){
                        case 1 :
                            Undergraduate a = new Undergraduate();
                            System.out.println("请输入学生姓名");
                            a.setName(sc.next());
                            System.out.println("请输入学生年龄");
                            a.setAge(sc.nextInt());
                            System.out.println("请输入学生学号");
                            a.setId(sc.next());
                            System.out.println("请输入学生专业");
                            a.setMajor(sc.next());
                            studentCore.add(a);
                            break;
                        case 2:
                            Graduate b = new Graduate();
                            System.out.println("请输入学生姓名");
                            b.setName(sc.next());
                            System.out.println("请输入学生年龄");
                            b.setAge(sc.nextInt());
                            System.out.println("请输入学生学号");
                            b.setId(sc.next());
                            System.out.println("请输入学生导师");
                            b.setTeacher(sc.next());
                            studentCore.add(b);
                            break;
                        case 3:
                            InternationalStudent c = new InternationalStudent();
                            System.out.println("请输入学生姓名");
                            c.setName(sc.next());
                            System.out.println("请输入学生年龄");
                            c.setAge(sc.nextInt());
                            System.out.println("请输入学生学号");
                            c.setId(sc.next());
                            System.out.println("请输入学生国家");
                            c.setCountry(sc.next());
                            studentCore.add(c);
                            break;
                    }
                case 2:
                    if (studentCore.isEmpty()){
                        System.out.println("数据为空，请添加数据");
                    }
                    for (int i = 0; i < studentCore.size() ; i++) {
                        studentCore.get(i).showDetail();

                    }
                    break;
                case 3:
                    if (studentCore.isEmpty()){
                        System.out.println("数据为空，请添加数据");
                    }
                    System.out.println("当前学生学号");
                    for (int i = 0; i < studentCore.size() ; i++) {
                        studentCore.get(i).getId();
                    }
                    boolean flag = false;
                    System.out.println("请输入学号");
                    String tempID = sc.next();
                    for (int i = 0; i < studentCore.size() ; i++) {
                        if (studentCore.get(i).getId().equals(tempID)){
                            System.out.println("查找成功当前学生详细信息");
                            studentCore.get(i).showDetail();
                            flag = true;
                        }
                    }
                    if (!flag){
                        System.out.println("当前未查找到该学生学号");
                    }
                    break;

                case 4:
                    if (!studentCore.isEmpty()){
                        System.out.println("数据为空，请添加数据");
                    }
                    for (int i = 0; i < studentCore.size() ; i++) {
                        studentCore.get(i).showDetail();

                    }
                    System.out.println("修改学生信息(年龄)");
                    boolean flag2 = false;
                    System.out.println("请输入学生ID");
                    String TempID = sc.next();
                    for (int i = 0; i < studentCore.size(); i++) {
                        if (studentCore.get(i).getId().equals(TempID)){
                            System.out.println("请输入需要重新设置的年龄");
                            int TempID2 = sc.nextInt();
                            studentCore.get(i).setAge(TempID2);
                            flag2 = true;

                        }

                    }
                    if (!flag2){
                        System.out.println("查询失败");
                    }

                    break;

                case 5:
                    if (studentCore.isEmpty()){
                        System.out.println("数据为空，请添加数据");
                    }
                    for (int i = 0; i < studentCore.size() ; i++) {
                        studentCore.get(i).showDetail();

                    }
                    System.out.println("请输入学号");
                    String TempID3 = sc.next();
                    boolean flag3 = false;
                    for (int i = 0; i < studentCore.size() ; i++) {
                        if (studentCore.get(i).getId().equals(TempID3)){
                            System.out.println("删除该学生信息");
                            studentCore.remove(i);
                            flag3 = true;
                        }
                    }
                    if (!flag3){
                        System.out.println("查询失败");
                    }
                    break;
            }
        }
    }
}
