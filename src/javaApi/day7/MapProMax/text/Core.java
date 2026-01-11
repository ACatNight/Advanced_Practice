package javaApi.day7.MapProMax.text;

import javaApi.day7.MapProMax.text.model.model;
import java.util.*;

public class Core {
    public static void main(String[] args) {
        model.Student s1 = new model.Student("小明","001");
        s1.addScore("语文", 90);
        s1.addScore("数学", 85);

        model.Student s2 = new model.Student("小红","002");
        s2.addScore("语文", 95);
        s2.addScore("数学", 80);

        model.Student s3 = new model.Student("小刚","003");
        s3.addScore("语文", 88);
        s3.addScore("数学", 92);


        Map<String, model.Student> studentMap = new HashMap<>();
        studentMap.put(s1.getStudentID(), s1);
        studentMap.put(s2.getStudentID(), s2);
        studentMap.put(s3.getStudentID(), s3);
        System.out.println("===== 学生成绩详情 =====");
        for(model.Student s : studentMap.values()){
            System.out.println(s.getName() + " 学号:" + s.getStudentID() +
                    " 总分:" + s.getTotalScore() +
                    " 平均分:" + s.getAverageScore());
            for(Map.Entry<String, Double> entry : s.getScores().entrySet()){
                System.out.println("  " + entry.getKey() + "：" + entry.getValue());
            }
            System.out.println("---------------------");
        }
        List<model.Student> studentList = new ArrayList<>(studentMap.values());
        studentList.sort((a,b) -> Double.compare(b.getTotalScore(), a.getTotalScore()));

        System.out.println("===== 总分排行榜 =====");
        int rank = 1;
        for(model.Student s : studentList){
            System.out.println(rank + ". " + s.getName() + " 总分:" + s.getTotalScore());
            rank++;
        }
        Map<String, Double> maxScoreMap = new HashMap<>();
        Map<String, String> maxScoreStudent = new HashMap<>();
        for(model.Student s : studentMap.values()){
            for(Map.Entry<String, Double> entry : s.getScores().entrySet()){
                String subject = entry.getKey();
                double score = entry.getValue();
                if(!maxScoreMap.containsKey(subject) || score > maxScoreMap.get(subject)){
                    maxScoreMap.put(subject, score);
                    maxScoreStudent.put(subject, s.getName());
                }
            }
        }
        System.out.println("===== 每科最高分 =====");
        for(String subject : maxScoreMap.keySet()){
            System.out.println(subject + " 最高分：" + maxScoreMap.get(subject) +
                    " 学生：" + maxScoreStudent.get(subject));
        }
    }
}
