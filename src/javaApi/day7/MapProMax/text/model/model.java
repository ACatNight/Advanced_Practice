package javaApi.day7.MapProMax.text.model;

import java.util.HashMap;
import java.util.Map;

public class model {
    public static class Student {
        private String name;
        private String studentID;
        private Map<String, Double> scores;

        public Student(String name, String studentID){
            this.name = name;
            this.studentID = studentID;
            this.scores = new HashMap<>();
        }

        public void addScore(String subject, double score){
            scores.put(subject, score);
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

        public String getName() { return name; }
        public String getStudentID() { return studentID; }
        public Map<String, Double> getScores() { return scores; }
    }
}
