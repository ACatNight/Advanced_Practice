package javaApi.day7.MapProMax.text3;

import java.text.SimpleDateFormat;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Map<String, Student> scoreMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("\n====== 学生成绩管理系统 ======");
            System.out.println("1·添加学生");
            System.out.println("2·查看学生成绩");
            System.out.println("3·总分排名榜");
            System.out.println("4·每科最高分");
            System.out.println("5·删除学生");
            System.out.println("0·退出系统");

            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    addScore(scoreMap, sc);
                    break;
                case 2:
                    showInfo(scoreMap);
                    break;
                case 3:
                    printTotalScoreRanking(scoreMap);
                    break;
                case 4:
                    printSubjectTopScore(scoreMap);
                    break;
                case 5:
                    removeStudent(scoreMap, sc);
                    break;
                case 0:
                    flag = false;
                    System.out.println("系统已退出");
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
            }
        }

        sc.close();
    }

    // 添加学生
    public static void addScore(Map<String, Student> scoreMap, Scanner sc) {

        System.out.print("请输入学生姓名：");
        String name = sc.next();
        System.out.print("请输入学生学号：");
        String id = sc.next();
        Student s = new Student(id, name);
        System.out.print("语文成绩：");
        s.addScore("语文", sc.nextDouble());
        System.out.print("数学成绩：");
        s.addScore("数学", sc.nextDouble());
        System.out.print("英语成绩：");
        s.addScore("英语", sc.nextDouble());
        scoreMap.put(id, s);
        System.out.println("学生添加成功！");
    }

    // 查看学生信息
    public static void showInfo(Map<String, Student> scoreMap) {

        if (scoreMap.isEmpty()) {
            System.out.println("暂无学生数据");
            return;
        }
        for (Student s : scoreMap.values()) {
            System.out.println("--------------------");
            System.out.println("学号：" + s.getStudentID());
            System.out.println("姓名：" + s.getName());
            System.out.println("总分：" + s.getTotalScore());
            System.out.println("平均分：" + s.getAverageScore());
        }
    }

    // 总分排行榜
    public static void printTotalScoreRanking(Map<String, Student> scoreMap) {

        List<Student> list = new ArrayList<>(scoreMap.values());
        list.sort((a, b) -> Double.compare(b.getTotalScore(), a.getTotalScore()));
        int rank = 1;
        for (Student s : list) {
            System.out.println("第" + rank++ + "名：" +
                    s.getName() + " 总分：" + s.getTotalScore());
        }
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date());
        System.out.println("数据生成时间：" + time);
    }

    // 每科最高分
    public static void printSubjectTopScore(Map<String, Student> scoreMap) {

        Map<String, Double> maxScoreMap = new HashMap<>();
        Map<String, String> maxScoreStudent = new HashMap<>();

        for (Student s : scoreMap.values()) {
            for (Map.Entry<String, Double> entry : s.getScores().entrySet()) {
                String subject = entry.getKey();
                double score = entry.getValue();
                if (!maxScoreMap.containsKey(subject)
                        || score > maxScoreMap.get(subject)) {
                    maxScoreMap.put(subject, score);
                    maxScoreStudent.put(subject, s.getName());
                }
            }
        }
        for (String subject : maxScoreMap.keySet()) {
            System.out.println(subject + " 最高分："
                    + maxScoreMap.get(subject)
                    + " 学生：" + maxScoreStudent.get(subject));
        }
    }

    // 删除学生
    public static void removeStudent(Map<String, Student> scoreMap, Scanner sc) {

        if (scoreMap.isEmpty()) {
            System.out.println("暂无数据可删除");
            return;
        }
        System.out.println("现有学生：");
        for (Student s : scoreMap.values()) {
            System.out.println(s.getStudentID() + " - " + s.getName());
        }
        System.out.print("请输入要删除的学号：");
        String id = sc.next();
        if (scoreMap.remove(id) != null) {
            System.out.println("删除成功");
        } else {
            System.out.println("未找到该学号");
        }
    }
}

