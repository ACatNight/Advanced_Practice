package javaApi.day9.text2;

import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<String, Classroom> classroomMap = new HashMap<>();
    public void addClassroom(Classroom classroom){
        classroomMap.put(classroom.getClassID(), classroom); //把班级收进学校
    }
    public void addUserToClass(String classId, User user) {
        Classroom classroom = classroomMap.get(classId);
        if (classroom != null) {
            classroom.addUser(user);
        }
    }
        public void printAllUsers() {
            for (Classroom classroom : classroomMap.values()) {
                classroom.printAllUser();

            }
        }

}
