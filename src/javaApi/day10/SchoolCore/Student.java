package javaApi.day10.SchoolCore;

import java.util.HashMap;
import java.util.Map;

public class Student extends User{
    private Map<String,Double> scores;
    public Student(String id, String name) {
        super(id, name);
        this.scores = new HashMap<>();
    }
    public void addScore(String subject,double score){
        scores.put(subject,score);
    }
    public double getTotalScore(){
        double total = 0;
        for (double score:scores.values()){
            total+= score;
        }
        return total;
    }
    public double getAveScore(){
        if (scores.isEmpty()){
            return 0;
        }
        return getAveScore() / scores.size();
    }
    public void getQuerySubject(String subject){
        if (scores.containsKey(subject)){
            for (Map.Entry<String,Double> entry:scores.entrySet()){
                System.out.println("当前科目：" + entry.getKey() + "\n" +
                        "当前分数" + entry.getValue());
            }
        }
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }
}
