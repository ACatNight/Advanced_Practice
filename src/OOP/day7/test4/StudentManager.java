package OOP.day7.test4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); // 改名为 students
        Random r = new Random();

        System.out.println("请输入学生的数量");
        int n = sc.nextInt();

        int max = 0;
        int min = 100; // 最小值初始化为100
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Student s = new Student(); // 每个学生都创建新对象

            System.out.println("请录入姓名");
            s.setName(sc.next());

            System.out.println("请录入年龄");
            s.setAge(sc.nextInt());

            System.out.println("请录入性别");
            s.setGender(sc.next());

            // 自动生成成绩
            int score = r.nextInt(100) + 1;
            s.setScore(score);

            // 更新 max、min、sum
            if (score > max) max = score;
            if (score < min) min = score;
            sum += score;

            // 添加到集合
            students.add(s);

            System.out.println("自动生成" + (i + 1) + "学生的成绩: " + score);
        }

        System.out.println("不及格的学生名单:");
        for (Student s : students) {
            if (s.getScore() < 60) {
                System.out.println(s.getName() + "，成绩：" + s.getScore());
            }
        }

        int A = 0, B = 0, C = 0;
        for (Student s : students) {
            int score = s.getScore();
            if (score > 90) {
                A++;
            } else if (score > 80) {
                B++;
            } else if (score < 60) {
                C++;
            }
        }

        double avg = n > 0 ? (double) sum / n : 0;

        System.out.println("统计结束");
        System.out.println("成绩最高分: " + max);
        System.out.println("成绩最低分: " + min);
        System.out.println("平均分: " + avg);
        System.out.println("当前成绩等级统计:");
        System.out.println("A阶段: " + A);
        System.out.println("B阶段: " + B);
        System.out.println("C阶段: " + C);
    }
}
