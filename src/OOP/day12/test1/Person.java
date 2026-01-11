package OOP.day12.test1;

public abstract class Person  {
    private String name;
    public Person(){
    }
    public Person(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
            return name;
    }
    public abstract void eat();
    public abstract void jump();

}
