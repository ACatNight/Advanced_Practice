package javaApi.day9.text2;

public class Student extends User {
    public Student(String id, String name) {
        super(id, name);
    }
    @Override
    public String getRole() {
        return "STUDENT";
    }

}
