package javaApi.day9.text5;

import java.util.HashMap;
import java.util.Map;

public class ClassRoom {

    private String classId;
    private Map<String, User> userMap = new HashMap<>();

    public ClassRoom(String classId) {
        this.classId = classId;
    }

    public void addUser(User user) {
        userMap.put(user.getId(), user); //添加学生
    }

    public User removeUser(String userId) {
        return userMap.remove(userId);
    }

    public User getUser(String userId) {
        return userMap.get(userId);
    }

    public String getClassId() {
        return classId;
    }
}