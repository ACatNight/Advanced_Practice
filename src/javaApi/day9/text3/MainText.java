package javaApi.day9.text3;

public class MainText {
    public static void main(String[] args) {
        School school = new School();
        Classroom c1 = new Classroom("一班");
        Classroom c2 = new Classroom("二班");
        school.addClassRoom(c1);
        school.addClassRoom(c2);
        User s1 = new Student("001","小明");
        User s2 = new Student("002","小月");
        User s4 = new Student("004","小化");
        User s5 = new Student("005","小琦");
        User s3 = new Admin("003","小兵");

        school.addUserToClas("一班", s1);
        school.addUserToClas("一班", s2);
        school.addUserToClas("二班", s4);
        school.addUserToClas("二班", s5);
        school.addUserToClas("二班", s3);
        User removed = school.removeUserFromClass("一班", "001");
        if (removed != null) {
            System.out.println("移除成功：" + removed.getName());
        } else {
            System.out.println("移除失败");
        }
        school.printAllUsers();





    }
}
