package javaApi.day7.MapProMax.test2;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String studentID;
    private Map<String,Double> scores;

    public Student (String studentID,String name){
        this.name = name;
        this.studentID = studentID;
        this.scores = new HashMap<>();
    }
    public double getTotalScore(){
        double total = 0;
        for(double score : scores.values()){
            total += score;
        }
        return total;
    }
    public double getAverageScore(){
        if(scores.isEmpty()) return 0;
        return getTotalScore() / scores.size();
    }
    public void add(String subject,double score){
        scores.put(subject,score);
    }
    public String getName() {
        return name;
    }
    public String getStudentID() {
        return studentID;
    }
    public Map<String, Double> getScores() {
        return scores;
    }


}
