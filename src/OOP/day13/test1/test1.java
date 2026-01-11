package OOP.day13.test1;

public class test1 {
    public static void main(String[] args) {
        Person p = new Person();
        Person.Heart h = p.new Heart();
        h.showRate();
    }
}
