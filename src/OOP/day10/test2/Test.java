package OOP.day10.test2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();

        Shape a = new Circle("圆",12);
        Shape b = new Rectangle("长方形",2,10);
        Shape c = new Square("正方形",1);

        list.add(a);
        list.add(b);
        list.add(c);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getArea());
            System.out.println(list.get(i).getPerimeter());
        }
    }
}
