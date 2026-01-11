package javaApi.day9.text6;

import java.util.HashMap;
import java.util.Map;

public class Student extends User{
    private Map<String,Double> scores;
    public Student(String id, String name) {
        super(id, name);
        this.scores = new HashMap<>();
    }
    public void setScore(String subject,double score){
        scores.put(subject,score);
    }
    public Double queryScore(String id){
        Double score = (double) 0;
        if (scores.containsKey(id)){
            for (Map.Entry<String,Double> entry : scores.entrySet() ){
                score = entry.getValue();
            }

        }
        return score;
    }
    public double toTalScore(){
        double total = 0;
        for(double score:scores.values()){
            total+=score;
        }
        return total;
    }
    public double aveScore(){
        if (scores.isEmpty()){
            return 0;
        }
        return toTalScore() / scores.size();
    }

    public void ShowInfo(){
        System.out.println("姓名" + getName() + "\n" +
                "学号" + getId());
    }


    @Override
    public String getRole() {
        return "STUDENT";
    }
}
