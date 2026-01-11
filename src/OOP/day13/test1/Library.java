package OOP.day13.test1;

public class Library {
    private int books = 200;

    public class Manager{
        public void borrow(int n) {
            books -= n;
        }

        public void restock(int n) {
            books += n;
        }

        public void show() {
            System.out.println("当前图书数量：" + books);
        }

    }
}
