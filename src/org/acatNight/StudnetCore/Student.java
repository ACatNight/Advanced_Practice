package org.acatNight.StudnetCore;

public class Student {
    private String userID;
    private String name;
    private int age;
    private String HomeAddress;

    public void setUserID(String userID){
        this.userID = userID;
    }
    public String getUserID(){
        return userID;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setHomeAddress(String HomeAddress){
        this.HomeAddress = HomeAddress;

    }
    public String getHomeAddress(){
        return HomeAddress;
    }
}
