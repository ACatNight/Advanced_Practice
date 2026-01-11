package javaApi.day11;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private String classId;
    private Map<String,Student> studentMap = new HashMap<>();
    public Classroom(String classId){
        this.classId = classId;
    }
    public Map<String, Student> getStudentMap() {
        return studentMap;
    }
    public String getClassId() {
        return classId;
    }
    public void addStudent(){
        System.out.println("添加学生数据");
        System.out.println("请输入学号:");
        String tId = Util.inputString();
        System.out.println("请输入姓名:");
        String tName = Util.inputString();
        Student student = new Student(tId,tName);
        studentMap.put(tId,student);
        System.out.println("是否继续录入成绩(y/n)");
        String tChoose = Util.inputString();
        if (tChoose.equalsIgnoreCase("y")){
            student.addScore();
        }
    }
    public void removeStudent(){
        for (Student s:studentMap.values()){
            System.out.println("学号:" + s.getId() + "\n" +
                    "姓名:" + s.getName());
        }
        System.out.println("请输入学号");
        String tId = Util.inputString();
        studentMap.remove(tId);
            }
    public void queryStudent(){
        for (Student s:studentMap.values()){
            System.out.println("学号:" + s.getId() + "\n" +
                    "姓名:" + s.getName());
        }
        System.out.println("请输入学号");
        String tId = Util.inputString();
        User user = studentMap.get(tId);
        if (user == null){
            System.out.println("未找到该学生");
            return;
        }
        if (!(user instanceof Student)){
            System.out.println("该用户不是学生");
        }
        Student s = (Student) user;
        System.out.println("Id:" + s.getId() + "\n" +
                "name:" + s.getName() + "\n" +
                "总分:" + s.getTotalScore());
    }
    public double getClassTotalScore(){
        if (studentMap.isEmpty()){
            System.out.println("数据为空");
            return 0;
        }
        double total = 0;

        for (Student score:studentMap.values()){
            total+= score.getTotalScore();
        }
        return total;
    }
    public double getClassAveAgeScore(){
        if (studentMap.isEmpty()){
            System.out.println("数据为空");
            return 0;
        }
        return getClassTotalScore() / studentMap.size();
    }
    public void printTotalScoreRank(){

	    List<Student> list = new ArrayList<>(studentMap.values());
		list.sort((a,b)->Double.compare(b.getTotalScore(),a.getTotalScore()));
        int rank = 1;
        for (User user:list){
            System.out.println("排名:" + rank++ + "\n" +
                    "学号:" + user.getId() + "\n" +
                    "姓名:" + user.getName());
        }
    }
    public void printSubjectScoreFailRanK(){
        System.out.println("请输入你要查看的不及格科目名单");
        String tSubject = Util.inputString();
        List<Student> list = new ArrayList<>();
        for (User user:studentMap.values()){
            if (user instanceof Student){
                Student student = (Student) user;
                Double score = student.getDefaultSubjectScore(tSubject);
                if (score <= 60 && score != null){
                    list.add(student);
                }
            }
        }
		if (list.isEmpty()){
			System.out.println("没有该科目的成绩");
			return;
		}
		list.sort((a,b)->
				Double.compare
				(
				b.getDefaultSubjectScore(tSubject),a.getDefaultSubjectScore(tSubject)
				)
		);
		int rank = 1;
	    for (Student s:list) {
		    System.out.println("排名：" + rank++ + "\n" +
				    "学号:" + s.getId() + "\n" +
				    "姓名:" + s.getName() + "\n" +
				    "科目:" + tSubject + "\n" +
				    "成绩:" + s.getDefaultSubjectScore(tSubject));

	    }
    }

    public void printSubjectScoreRank(){
        System.out.println("请输入你要进行排名的科目");
        String tSubject = Util.inputString();
        List<Student> list = new ArrayList<>();
        for (User user:studentMap.values()){
            if (user instanceof Student){
                Student student = (Student) user;
                Double score = student.getDefaultSubjectScore(tSubject);
                if (score != null){
                    list.add(student);
                }
            }

        }
        if (list.isEmpty()){
            System.out.println("没有该科目的成绩");
			return;
        }
        list.sort((a,b)->
        Double.compare(b.getDefaultSubjectScore(tSubject),a.getDefaultSubjectScore(tSubject)));
        int rank = 1;
        for (Student s:list){
            System.out.println("排名：" + rank++ + "\n" +
                    "学号:" + s.getId() + "\n" +
                    "姓名:" + s.getName() + "\n" +
                    "科目:" + tSubject + "\n" +
                    "成绩:" + s.getDefaultSubjectScore(tSubject));
        }

    }
	public int getClassStudentCount(){
		return studentMap.size();
	}

}
