package javaApi.day10.text;

import java.util.HashMap;
import java.util.Map;

public class School {

    private Map<String, Classroom> classroomMap = new HashMap<>();

    public void addClassroom(Classroom classroom) {
        classroomMap.put(classroom.getClassID(), classroom);
    }

    public Classroom getClassroom(String classID) {
        return classroomMap.get(classID);
    }

    public void printAll() {
        for (Classroom c : classroomMap.values()) {
            System.out.println("班级：" + c.getClassID());
            System.out.println("人数：" + c.getStudentCount());
            System.out.println("总分：" + c.getTotalScores());
            System.out.println("------------------");
        }
    }
}
