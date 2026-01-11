package OOP.day7.test4;

import java.util.Random;

public class Student extends Person{
    Random r = new Random();
    private String UID;
    private int Score;

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getScore() {
        return Score;
    }

    public void setUID(String UID){
        this.UID = UID;
    }

    public String getUID() {
        return UID;
    }

}
