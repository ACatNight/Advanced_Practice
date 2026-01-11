package javaApi.day9.text3;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private String classID;
    private Map<String,User> userMap;

    public Classroom(String classID){
        this.classID = classID;
        this.userMap = new HashMap<>();
    }

    public void setClassID(String classID){
        this.classID = classID;
    }
    public String getClassID(){
        return classID;
    }
    public void addUser(User user){
        userMap.put(user.getId(),user);
    }
    public void printAllUser(){
        for (User u:userMap.values()){
            System.out.println("学号:" + u.getId() + "\n" +
                    "姓名:" + u.getName() + "\n" +
                    "身份：" + u.getRole() + "\n" +
                    "班级" + getClassID());

        }
    }
    public User removeUserById(String userId){
        return userMap.remove(userId);
    }

}
