package javaApi.day8.Stu;

import java.text.SimpleDateFormat;
import java.util.*;

public class ClassManager {
    private Map<String, Student> studentMap = new HashMap<>();
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("添加学生ID");
        String tStudentID = sc.next();
        System.out.println("添加学生姓名");
        String tStudentName = sc.next();
        Student tScore = new Student(tStudentID,tStudentName);
        System.out.println("添加语文成绩");
        double tChinese = sc.nextDouble();
        System.out.println("添加数学成绩");
        double tMath = sc.nextDouble();
        System.out.println("添加英语成绩");
        double tEnglish = sc.nextDouble();
        tScore.addScore("语文",tChinese);
        tScore.addScore("数学",tMath);
        tScore.addScore("英语",tEnglish);
        studentMap.put(tScore.getStudentID(),tScore);

    }
    public  void  removeStudent(){
        if (studentMap.isEmpty()){
            System.out.println("你没数据可删");
            return;
        }
        Scanner sc = new Scanner(System.in);
        for(Student score:studentMap.values()){
            System.out.println(score.getStudentID() + ":" + score.getName());
        }
        System.out.println("请输入对应学生ID");
        String tRemoveStudent = sc.next();
        if(studentMap.containsKey(tRemoveStudent)){
            studentMap.remove(tRemoveStudent);
            System.out.println("删除成功");
        }else {
            System.out.println("没有找到该学生ID");
        }
    }
    public  void printAllStudents(){
        for (Student score : studentMap.values()){
            System.out.println("学号:" + " " + score.getStudentID() + "\n" +
                    "学生姓名:" + " " + score.getName() + "\n" +
                    "学生总分:" + " " + score.getTotalScore() + "\n" +
                    "学生平均分:" + " " + score.getAverageScore());
        }
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("已经生成完毕 当前数据日志时间为:" + ft.format(date));
    }
    public  void printTotalScoreRanking(){
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort((a,b)->
                Double.compare(
                        b.getTotalScore(),a.getTotalScore()
                ));
        int rank = 0;
        for (Student s : list){
            rank++;
            System.out.println("第" + rank + "名");
            System.out.println("学号:" + " " + s.getStudentID() + "\n" +
                    "学生姓名:" + " " + s.getName() + "\n" +
                    "学生总分:" + " " + s.getTotalScore() + "\n");
        }
    }
    public  void printSubjectTopScore(){
        Map<String, Double> maxScoreMap = new HashMap<>();
        Map<String, String> maxScoreStudent = new HashMap<>();
        for (Student subjectTop : studentMap.values()){
            for(Map.Entry<String, Double> entry : subjectTop.getScore().entrySet()  ){
                String subject = entry.getKey();
                double score = entry.getValue();
                if(!maxScoreMap.containsKey(subject) || score > maxScoreMap.get(subject)){
                    maxScoreMap.put(subject, score);
                    maxScoreStudent.put(subject, subjectTop.getName());
                }
            }
        }
        System.out.println("科目最高分:");
        for (String subject:maxScoreMap.keySet()){
            System.out.println("科目:" + subject + "\n" +
                    "分数:" + maxScoreMap.get(subject) + "\n" +
                    "姓名:" + maxScoreStudent.get(subject));
        }

    }
    public void printFailStudents() {

        Map<String, Double> failScoreMap = new HashMap<>();
        Map<String, String> failScoreStudent = new HashMap<>();

        for (Student failSubject : studentMap.values()) {
            for (Map.Entry<String, Double> entry : failSubject.getScore().entrySet()) {

                String subject = entry.getKey();
                double score = entry.getValue();

                if (score < 60) {
                    // 组合 key：学号_科目（或 姓名_科目）
                    String key = failSubject.getStudentID() + "_" + subject;

                    failScoreMap.put(key, score);
                    failScoreStudent.put(key, failSubject.getName());
                }
            }
        }

        System.out.println("不及格榜单");

        for (String key : failScoreMap.keySet()) {
            String subject = key.split("_")[1];
            System.out.println(
                    "姓名：" + failScoreStudent.get(key) + "\n" +
                            "科目：" + subject + "\n" +
                            "分数：" + failScoreMap.get(key)
            );
        }
    }


}
