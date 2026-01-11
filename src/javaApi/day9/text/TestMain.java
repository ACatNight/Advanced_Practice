package javaApi.day9.text;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student("001","小明");
        User s2 = new Student("1002", "李四");
        User a1 = new Admin("A01", "管理员");

        Classroom c = new Classroom("一班");
        c.addUser(s1);
        c.addUser(s2);
        c.addUser(a1);
        s1.setScore(90);
        c.printAllUsers();

    }
}
