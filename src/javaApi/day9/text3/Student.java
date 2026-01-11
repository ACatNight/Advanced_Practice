package javaApi.day9.text3;

public class Student extends User {

    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }

    @Override
    public void printInfo() {
        System.out.println("[" + getRole() + "]"+ "学号" + getId() + "," + "姓名:" + getName());

    }
}
