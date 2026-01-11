package OOP.day14.test3;

public class one {
    public static void main(String[] args) {
//非静态
        test.Inter inter = new test.Inter();
        inter.show1();
//静态
        test.Inter.show2();
    }
}
