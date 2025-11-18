package org.acatNight.day10.test3;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManager  {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



    }
    public void Shape(ArrayList<Shape> list){
        System.out.println("请选择类型");
        System.out.println("1·圆形");
        System.out.println("2·长方形");
        Scanner sc = new Scanner(System.in);

        int Choose = sc.nextInt();
        sc.nextLine();
        switch (Choose){
            case 1:
                System.out.println("请输入radius");
                Shape a = new Circle("圆形",sc.nextDouble());
                list.add(a);
                break;
            case 2:
                System.out.println("请输入width and height");
                Shape b = new Rectangle("长方形",sc.nextDouble(),sc.nextDouble());
                list.add(b);
                break;

        }



    }
    public void ShowInfo(ArrayList<Shape> list){
        System.out.println("当前图形信息");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("图形:" + list.get(i).getName());
            System.out.println("面积:"+ list.get(i).getArea());
            System.out.println("周长" + list.get(i).getPerimeter());
        }


    }
    public double findMaxAreaShape(ArrayList<Shape> list){
        System.out.println("当前最大的面积");
        double max = list.get(0).getArea();
        for (int i = 0; i < list.size() ; i++) {
            if(max < list.get(i).getArea()){
                max = list.get(i).getArea();
            }

        }
        return max;
    }
}
