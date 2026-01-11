package javaApi.day10.SchoolCore;

public class Admin extends User {
    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }
}
