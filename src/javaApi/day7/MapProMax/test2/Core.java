package javaApi.day7.MapProMax.test2;


import javaApi.day7.MapProMax.text.model.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Core {
    public static void main(String[] args) {
        Student s1 = new Student("001","小红");
        Student s2 = new Student("002","小明");
        s1.add("语文",24);
        s1.add("数学",73);
        s2.add("语文",52);
        s2.add("数学",23);

        Map<String,Student> map = new HashMap<>();
        map.put(s1.getStudentID(),s1);
        map.put(s2.getStudentID(),s2);
        System.out.println("学生ID" + "  学生姓名" + "  成绩" + "总分");
        for (Student s : map.values()){
            System.out.println(s.getStudentID() + " " + s.getName() + "  " + s.getScores() + s.getTotalScore());
        }
        List<Map.Entry<String,Student>> scores = new ArrayList<>(map.entrySet());
        scores.sort((a,b) ->
                Double.compare(
                       b.getValue().getTotalScore(),a.getValue().getTotalScore()
                )
                );
        System.out.println("学生排名");
        for(Map.Entry<String,Student> entry : scores){
            Student s =   entry.getValue();
            System.out.println(s.getStudentID() + s.getName() + s.getTotalScore());
        }
        Map<String, Double> maxScoreMap = new HashMap<>();
        Map<String, String> maxScoreStudent = new HashMap<>();
        System.out.println("学生单科排名");
        for (Student s : map.values()) {//遍历所有学生
            for (Map.Entry<String, Double> e : s.getScores().entrySet()) { //遍历一个学生的所有成绩
                String subject = e.getKey(); //记录科目
                double score = e.getValue();//记录成绩
                if (!maxScoreMap.containsKey(subject) //这个没记录过
                        || score > maxScoreMap.get(subject)) { //当前分数比“已知最高分”还高
                    maxScoreMap.put(subject, score);//然后把值放里面
                                  //Key值的唯一性
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
