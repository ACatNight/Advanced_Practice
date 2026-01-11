package javaApi.day9.text3;

public class Admin extends User {

    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }

    @Override
    public void printInfo() {
        System.out.println("[" + getRole() + "]"+ "学号" + getId() + "," + "姓名:" + getName());

    }
}
