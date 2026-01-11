package OOP.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        ArrayList<text4> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3 ; i++) {
            System.out.println("请输入您的姓名");
            String name = sc.next();
            System.out.println("请输入您的年龄");
            int age = sc.nextInt();
            text4 s = new text4(); //循环内创建新的Text4对象实例
            s.setName(name); // 将输入的name设置到当前对象的name属性
            s.setAge(age);// 将输入的age设置到当前对象的age属性
            list.add(s); //将当前设置好的对象添加到ArrayList集合中

        }
        for (int i = 0; i < list.size() ; i++) {
            text4 stu = list.get(i); //从集合中获取第i个元素（Text4对象）
            System.out.println(stu.getName() + "," + stu.getAge());
        }




    }
}
