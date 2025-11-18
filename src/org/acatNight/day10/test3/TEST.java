package org.acatNight.day10.test3;


import java.util.ArrayList;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        boolean start = true;
        ShapeManager a = new ShapeManager();
        ArrayList<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (start){
            System.out.println("1·创建几个图形\n" +
                    "\n" +
                    "\n" +
                    "2·依次打印\n" +
                    "\n" +
                    "3·输出面积最大的图形名称");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    a.Shape(list);
                    break;
                case 2:
                    a.ShowInfo(list);
                    break;
                case 3:
                    double max = a.findMaxAreaShape(list);
                    System.out.println("当前面积最大值为:" + max);
                    break;

            }
        }

    }
}
