package javaApi.day9.text;

public class Student extends User {
    private int score;

    public Student(String id, String name) {
        super(id, name);
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }
}
