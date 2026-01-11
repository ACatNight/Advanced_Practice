package OOP.day5.test2;

public class Person{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void introduce(){
        System.out.println("我是" + getName());
    }
}
