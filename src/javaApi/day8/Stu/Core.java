package javaApi.day8.Stu;

import java.util.Scanner;

public class Core {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        ClassManager manager = new ClassManager();
        while (flag){
            System.out.println("学生基础系统");
            System.out.println("0·添加学生\n" +
                    "1. 查看成绩总表\n" +
                    "2. 查看学生排名\n" +
                    "3. 查看单科最高分\n" +
                    "4. 查看不及格学生\n" +
                    "5. 退出");
            int choose = sc.nextInt();
            switch (choose){
                case 0:
                    manager.addStudent();
                    break;

                case 1:
                    manager.printAllStudents();

                    break;

                case 2:
                    manager.printTotalScoreRanking();
                    break;

                case 3:
                    manager.printSubjectTopScore();

                    break;
                case  4:
                    manager.printFailStudents();
                    break;

                case 5:
                    manager.removeStudent();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }

    }
}
