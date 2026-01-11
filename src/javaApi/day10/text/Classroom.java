package javaApi.day10.text;

import java.util.*;

public class Classroom {

    private String classID;
    private Map<String, Student> studentMap = new HashMap<>();

    public Classroom(String classID) {
        this.classID = classID;
    }

    public String getClassID() {
        return classID;
    }
    public void queryStudent(){
        System.out.println("请输入学号");
        String tId = Util.inputString();
        User user = studentMap.get(tId);
        if (user == null){
            System.out.println("未找到该学生");
            return;
        }
        if (!(user instanceof  Student)){
            System.out.println("该用户不是学生");
            return;
        }
        Student student = (Student) user;
        System.out.println("学号：" + student.getId());
        System.out.println("姓名：" + student.getName());
        System.out.println("总分：" + student.getTotalScore());
    }

    //添加学生（包含输入 & 成绩）
    public void addStudentWithInput() {
        System.out.println("请输入学生ID：");
        String id = Util.inputString();

        System.out.println("请输入学生姓名：");
        String name = Util.inputString();

        Student student = new Student(id, name);
        studentMap.put(id, student);

        System.out.println("是否录入成绩（y/n）");
        String choose = Util.inputString();
        if (choose.equalsIgnoreCase("y")) {
            student.inputScore(); // 添加成绩
        }

        System.out.println("学生添加成功！");
    }

    public int getStudentCount() {
        return studentMap.size();
    }

    public double getTotalScores() {
        double total = 0;
        for (Student s : studentMap.values()) {
            total += s.getTotalScore();
        }
        return total;
    }
    public double getAveScores(){
        double ave = 0;
        if (studentMap.isEmpty()){
            return 0;
        }
        ave = getTotalScores() / studentMap.size();
        return ave;
    }
    public double getMaxScore(){
        Double max = 0.0;
        for (Student s: studentMap.values()){
            double total = s.getTotalScore();
            if (total > max){
                max = total;
            }


        }
        return max;
    }
    public void printFailRateSubject(){
        System.out.println("请输入科目");
        int totalCount = 0;  // 统计有成绩的学生数
        int failCount = 0;   // 统计不及格人数

        String subject = Util.inputString();
        for (User user: studentMap.values()){
            if (user instanceof  Student){
                Student s = (Student) user;
                double failScore = s.getScoreBySubject(subject);
                if (failScore != 0){
                    totalCount++;
                    if (failScore < 60){
                        failCount++;
                    }

                }
                if (totalCount == 0) {
                    System.out.println("该科目暂无成绩");
                    return;
                }

            }
        }
        double rate = failCount * 100.0 / totalCount;
        System.out.println("参考人数：" + totalCount);
        System.out.println("不及格人数：" + failCount);
        System.out.println("不及格率：" + rate + "%");




    }
    public void printRankByTotalScore() {
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort((a,b) -> Double.compare(b.getTotalScore(), a.getTotalScore())
        );
        int rank = 0;
        for (Student student : list) {
            rank++;
            System.out.println("排名：" + rank + "\n" +
                    "学号:" + student.getId() + "\n" +
                    "名字:" + student.getName() + "\n" +
                    "总分:" + student.getTotalScore());

        }

    }
    public void printFailRankBySubject(){
        System.out.println("请输入你要排名的不及格的科目");
        String tSubject = Util.inputString();
        List<Student> list = new ArrayList<>();
        for (User user:studentMap.values()){
            if (user instanceof Student){
                Student s = (Student) user;
                Double score = s.getScoreBySubject(tSubject);
                if (score != null  && score< 60){
                    list.add(s);
                }
            }
        }
        if (list.isEmpty()){
            System.out.println("该科目暂无不及格学生");
            return;
        }
        list.sort((a,b)->Double.compare(a.getScoreBySubject(tSubject),b.getScoreBySubject(tSubject)));
        int rank = 1;
        for (Student s:list){
            System.out.println("排名:" + rank++ + "\n" +
                    "学号:" + s.getId() + "\n" +
                    "姓名:" + s.getName() + "\n" +
                    "科目:" + tSubject + "\n" +
                    "成绩:" + s.getScoreBySubject(tSubject));

        }

    }

    public void printRankBySubject(){
        System.out.println("请输入你要排名的科目");
        String tSubject = Util.inputString();
        //只收集有这个科目的学生
        List<Student> list = new ArrayList<>();
        for (User user:studentMap.values()){
            if (user instanceof Student){ //判断Student子类
                Student s = (Student) user; //然后转换
                if (s.getScoreBySubject(tSubject) > 0) {
                    list.add(s);
                }
            }
        }
        if (list.isEmpty()){
            System.out.println("没有该科目的成绩");
            return;
        }
        list.sort((a,b)->Double.compare(
                b.getScoreBySubject(tSubject),a.getScoreBySubject(tSubject)
                )
                );
        int rank = 1;
        for (Student s:list){
            System.out.println("排名:" + rank++ + "\n" +
                    "学号:" + getClassID() + "\n" +
                    "姓名:" + s.getName() + "\n" +
                    "科目:" + tSubject + "\n" +
                    "成绩:" + s.getScoreBySubject(tSubject));
        }

    }


}
