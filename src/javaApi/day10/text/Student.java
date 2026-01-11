package javaApi.day10.text;

import java.util.HashMap;
import java.util.Map;

public class Student extends User {

    private Map<String, Double> scores;

    public Student(String id, String name) {
        super(id, name);
        this.scores = new HashMap<>();
    }
    public void inputScore() {
        while (true) {
            System.out.println("请输入科目：");
            String subject = Util.inputString();

            System.out.println("请输入成绩：");
            double score = Util.inputDouble();

            scores.put(subject, score);

            System.out.println("是否继续录入成绩（y/n）");
            String choose = Util.inputString();
            if (choose.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    @Override
    public String getRole() {
        return "";
    }
    public Double getScoreBySubject(String subject) {
        return scores.getOrDefault(subject, 0.0);
    }



    public double getTotalScore() {
        double total = 0;
        for (double s : scores.values()) {
            total += s;
        }
        return total;
    }
}
