package javaApi.day4.Set.Tree.test;

public class Student {
    private String name;
    private double score;

    public Student(){

    }
    public Student(String name,double score){
        this.score = score;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return score;
    }
}
