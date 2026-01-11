package javaApi.day9.text3;

import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<String,Classroom> classroomMap = new HashMap<>();
    public School() {
    }
    public void addClassRoom(Classroom classroom){
        classroomMap.put(classroom.getClassID(),classroom);
    }
    public void addUserToClas(String classId,User user){
        Classroom classroom= classroomMap.get(classId);
        if (classroom!=null){
            classroom.addUser(user);
        }

    }
    public void printAllUsers(){
        for (Classroom classroom : classroomMap.values()) {
            classroom.printAllUser();
        }
    }
    public User removeUserFromClass(String classId,String userID){
       Classroom classroom = classroomMap.get(classId);
        //通过classId 找班级
        if (classroom != null){ //如果存在 让他删人
            return classroom.removeUserById(userID);
        }
        return null;
    }

    }




