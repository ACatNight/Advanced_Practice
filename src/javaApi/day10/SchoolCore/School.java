package javaApi.day10.SchoolCore;

import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<String,Classroom> classroomMap = new HashMap<>();
    public void addClassRoom(Classroom classroom){
        classroomMap.put(classroom.getClassId(), classroom);
    }
    public void addClassData(String classId,User user){
        Classroom classroom = classroomMap.get(classId);
        if (classroom!= null){
            classroom.addStudent(user);
        }
    }
    public void printClass(){
        for (Classroom classroom: classroomMap.values()){
            System.out.println("班级ID:" + classroom.getClassId() + "\n" +
                    "班级人数:" + classroom.getStudentCount()
                    + "\n" + "总分:" + classroom.getTotalScore() +
                    "\n" + "平均分：" + classroom.getTotalScore() / classroom.getStudentCount());
        }
    }
    public Map<String, Classroom> getClassroomMap() {
        return classroomMap;
    }
}
