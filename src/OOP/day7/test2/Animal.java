package OOP.day7.test2;

public class Animal {
    private String name;
    private int age;
    private String diet;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setDiet(String diet){
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }
    public void makeSound(){

    }
    public void showInfo(){
        System.out.println("当前动物的详细信息");
        System.out.println("动物:" + name + "\n" +
                "年龄" + age + "\n" +
                "食性" + diet);
    }
}
