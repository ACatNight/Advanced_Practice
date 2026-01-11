package javaApi.day9.text2;

public class TestMain {
    public static void main(String[] args) {
        School school = new School();

        Classroom c1 = new Classroom("C01");
        Classroom c2 = new Classroom("C02");
        school.addClassroom(c1);
        school.addClassroom(c2);
        User s1 = new Student("1001", "张三");
        User s2 = new Student("1002", "李四");
        User a1 = new Admin("A01", "管理员");
        school.addUserToClass("C01", s1);
        school.addUserToClass("C01", s2);
        school.addUserToClass("C02", a1);

        school.printAllUsers();

    }
}
