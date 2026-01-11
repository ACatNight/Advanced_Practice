package javaApi.day9.text5;

import javaApi.day9.text3.Classroom;

import java.util.HashMap;
import java.util.Map;

public class School {

    private Map<String, ClassRoom> classRoomMap = new HashMap<>();

    public void addClassRoom(ClassRoom classRoom) {
        classRoomMap.put(classRoom.getClassId(), classRoom); //添加班级结构
    }
    public void addUserToClass(String classId, User user) {//添加班级内容层
        ClassRoom classRoom = classRoomMap.get(classId);
        if (classRoom != null) {//如果为空 那就添加
            classRoom.addUser(user);
        }

    }

    public ClassRoom getClassRoom(String classId) {
        return classRoomMap.get(classId);
    }
}