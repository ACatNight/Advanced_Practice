package javaApi.day9.text6;

import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<String,Classroom> classroomMap = new HashMap<>();
    public School(){

    }
    public void addClassRoom(Classroom classroom){
        classroomMap.put(classroom.getClassId(),classroom);
    }
    public void addClassData(String classId,User user){
        Classroom classroom = classroomMap.get(classId);
        if (classroom!= null){
            classroom.addStudent(user);
        }

    }
}
