package javaApi.day10.SchoolCore;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private String classId;
    private Map<String,User> userMap= new HashMap<>();

    public Classroom(String classId) {
        this.classId = classId;
    }

    public void addStudent(User user){
        userMap.put(user.getId(),user);
    }
    public double getTotalScore(){
        double total = 0;
        for(User user: userMap.values()){
            Student s = (Student) user;
            total+= s.getTotalScore();
        }
        return total;
    }
    public Student getQueryStudent(String id){
        User user = userMap.get(id);
        if (user instanceof  Student){
            return (Student)user;
        }
        return null;

    }
    public int getStudentCount(){
        int count = 0;
        for (User user: userMap.values()){
            if (user instanceof Student)count++;
        }
        return count;
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
}
