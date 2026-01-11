package javaApi.day11;

import java.util.HashMap;
import java.util.Map;

public class Student extends User {
    private Map<String,Double> scores;
    public Student(String id, String name) {
        super(id, name);
        this.scores = new HashMap<>();
    }
    public void addScore(){
        while (true){
            System.out.println("请输入科目");
            String tSubject = Util.inputString();
            System.out.println("请输入成绩");
            double tScore = Util.inputDouble();
            scores.put(tSubject,tScore);
            System.out.println("是否继续添加科目(y/n)");
            String tChoose = Util.inputString();
            if (tChoose.equalsIgnoreCase("n")){
                break;
            }
        }
    }
    public double getTotalScore(){
        if (scores.isEmpty()){
            System.out.println("数据为空");
            return 0.0;
        }
        double total = 0;
        for (double score: scores.values()){
            total += score;
        }
        return total;
    }
    public double getAveAgeScore(){
        if (scores.isEmpty()){
            System.out.println("数据为空");
            return 0.0;
        }
        return getTotalScore() / scores.size();
    }
    public void querySubjectScore(){
        if (scores.isEmpty()){
            System.out.println("该数据为空");
            return;
        }
        System.out.println("请输入你要查找的科目成绩");
        String tSubject = Util.inputString();
        if (scores.containsKey(tSubject)){
            double tScore = scores.get(tSubject);
            System.out.println("科目:" + tSubject + "\n" +
                    "成绩:" + tScore);
        }else {
            System.out.println("未找到该科目");
        }

    }
    public double getDefaultSubjectScore(String tSubject){
        return scores.getOrDefault(tSubject,0.0);
    }





    public Map<String, Double> getScores() {
        return scores;
    }
    @Override
    public String getRole() {
        return "STUDENT";
    }
}
