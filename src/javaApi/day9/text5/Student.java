package javaApi.day9.text5;

import java.util.HashMap;
import java.util.Map;

public class Student extends User {

    private Map<String, Double> scores = new HashMap<>();

    public Student(String id, String name) {
        super(id, name);
    }

    public void setScore(String subject, double score) {
        scores.put(subject, score); //添加科目 成绩
    }

    public double getTotalScore() {
        double total = 0;
        for (double s : scores.values()) {
            total += s;
        }
        return total;
    }

    public double getAverageScore() {
        if (scores.isEmpty()) return 0; //如果是空的 就返回
        return getTotalScore() / scores.size();
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }
}