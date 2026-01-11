package javaApi.day9.text;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private String className;
    private Map<String,User> userMap;


    public Classroom(String className) {
        this.className = className;
        this.userMap = new HashMap<>();
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
    public void addUser(User user){
        userMap.put(user.getId(),user);
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }
    public void printAllUsers(){
        for (User u : userMap.values()) {
            System.out.println(
                    u.getId() + " " +
                            u.getName() + " " +
                            u.getRole()

            );
        }

    }
}
