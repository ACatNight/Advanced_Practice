package javaApi.day9.text6;

public abstract class User {
    private String name;
    private String id;

    public  User(String id,String name){
        this.name = name;
        this.id = id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract String getRole();

}
