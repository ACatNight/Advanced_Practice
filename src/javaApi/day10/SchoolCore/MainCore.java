package javaApi.day10.SchoolCore;

public class MainCore {
    public static void main(String[] args) {
        School school = new School();
        Classroom class1 = new Classroom("一班");
        school.addClassRoom(class1);
        Student s1 = new Student("001","小明");
        s1.addScore("语文",52);
        s1.addScore("数学",32);
        s1.addScore("英语",25);

        Student s2 = new Student("002","小月");
        s2.addScore("语文",52);
        s2.addScore("数学",32);
        s2.addScore("英语",25);

        Student s3 = new Student("003","小天");
        s3.addScore("语文",82);
        s3.addScore("数学",32);
        s3.addScore("英语",65);
        Admin admin = new Admin("996","老吴");
        school.addClassData(class1.getClassId(), s1);
        school.addClassData(class1.getClassId(), s2);
        school.addClassData(class1.getClassId(), s3);

        school.printClass();



    }
}
