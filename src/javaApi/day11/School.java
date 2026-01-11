package javaApi.day11;

import java.util.HashMap;
import java.util.Map;

public class School {
	private Map<String,Classroom> classroomMap = new HashMap<>();

	public void addClassroom(Classroom classroom){
		classroomMap.put(classroom.getClassId(), classroom);
	}

	public Map<String, Classroom> getClassroomMap() {
		return classroomMap;
	}
	public void printAll(){
		System.out.println("当前班级详细报告");
		for (Classroom classroom:classroomMap.values()){
			System.out.println("班级编号:" + classroom.getClassId() + "\n" +
					"班级人数:" + classroom.getClassStudentCount() + "\n" +
					"平均:" + classroom.getClassAveAgeScore());
		}
	}
}
