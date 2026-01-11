package OOP.day5.test2;

public class text {
    public static void main(String[] args) {
        Person Student = new Person();
        Student.setName("小明");
        Student s1 = new Student();


        Student.introduce();
        s1.setName("小明");
        s1.setGrade("一年级");
        s1.introduce();
    }
}
