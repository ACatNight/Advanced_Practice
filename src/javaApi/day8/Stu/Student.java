package javaApi.day8.Stu;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String studentID;
    private Map<String,Double> scores;

    public Student(String studentID,String name){
        this.name = name;
        this.studentID = studentID;
        this.scores = new HashMap<>();
    }

    public void addScore(String subject,double score){
        scores.put(subject,score);
    }
    public double getTotalScore(){
        double total = 0;
        for (double score:scores.values()){
            total+=score;
        }
        return total;

    }
    public double getAverageScore(){
        return getTotalScore() / scores.size();
    }
    public Map<String, Double> getScore(){
        return scores;
    }
    public String getName(){
        return name;
    }
    public String getStudentID(){
        return studentID;
    }
}
