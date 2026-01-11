package OOP.day13.test1;

public class test3 {
    public static void main(String[] args) {
        Library b = new Library();
        Library.Manager l = b.new Manager();
        l.borrow(30);
        l.restock(40);


        l.show();


    }
}
