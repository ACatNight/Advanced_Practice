package javaApi.day9.text6;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private String classId;
    private Map<String,User> userMap = new HashMap<>();
    public Classroom(String classId){
        this.classId = classId;
    }
    public void setClassId(String classId){
        this.classId = classId;
    }
    public String getClassId(){
        return classId;
    }
    public Map<String, User> getUserMap() {
        return userMap;
    }
    public void addStudent(User user){
        userMap.put(user.getId(),user);
    }
    public void removeStudent(String id){
        userMap.remove(id);
    }
    public double getTotalScore(){
        double total = 0;
        for (User user:userMap.values()){
            if (user instanceof  Student){
                Student s = (Student) user;
                total += s.toTalScore();
            }
        }
        return total;
    }
    public double getAveScore() {
        if (userMap.isEmpty()) {
            return 0;
        }

        double total = 0;
        int studentCount = 0;

        for (User user : userMap.values()) {
            if (user instanceof Student) {
                Student s = (Student) user;
                total += s.toTalScore();
                studentCount++;//学生数量
            }
        }

        if (studentCount == 0) {
            return 0;
        } else {
            return total / studentCount;
        }
    }
    public int getStudentCount(){
        int count = 0;
        for(User user: userMap.values()){
            if (user instanceof  Student) count++;
        }
        return count;
    }

}
