package org.acatNight.day9.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean start = true;

        while (start){
            System.out.println("===== 图书馆系统 =====\n" +
                    "1·添加书籍\n" +
                    "2·查看所有书籍\n" +
                    "3·借书\n" +
                    "4·归还书\n" +
                    "5·退出\n" +
                    "=====================\n" +
                    "请选择：");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("请添加类型");
                    System.out.println("1·小说" + "\n" +
                            "2·杂志" + "\n" +
                            "3·科普书" + "\n" +
                            "4·退出");
                    int tempChoose = sc.nextInt();
                    switch (tempChoose){
                        case 1:
                            Novel a = new Novel();
                            System.out.println("请输入书名");
                            a.setName(sc.next());
                            System.out.println("请输入书的价格");
                            a.setPrice(sc.nextInt());
                            System.out.println("请输入书的库存");
                            a.setCount(sc.nextInt());
                            System.out.println("请输入书的作者");
                            a.setAuthor(sc.next());
                            books.add(a);
                            break;


                        case 2:
                            Magazine b = new Magazine();
                            System.out.println("请输入书名");
                            b.setName(sc.next());
                            System.out.println("请输入书的价格");
                            b.setPrice(sc.nextInt());
                            System.out.println("请输入书的库存");
                            b.setCount(sc.nextInt());
                            System.out.println("请输入书的期号");
                            b.setIssue(sc.next());
                            books.add(b);
                            break;

                        case 3:
                            ScienceBook c = new ScienceBook();
                            System.out.println("请输入书名");
                            c.setName(sc.next());
                            System.out.println("请输入书的价格");
                            c.setPrice(sc.nextInt());
                            System.out.println("请输入书的库存");
                            c.setCount(sc.nextInt());
                            System.out.println("请输入书的领域");
                            c.setField(sc.next());
                            books.add(c);
                            break;
                        case 4:
                            break;
                    }

                    break;
                case 2:
                    if(books.isEmpty()){
                        System.out.println("当前没有数据，请您添加");
                    }
                    System.out.println("查看当前的所有书籍的详细信息");

                    for (int i = 0; i < books.size() ; i++) {
                        System.out.println("===== 查询结果 =====");
                        books.get(i).showDetail();
                    }


                    break;
                case 3:
                    for (int i = 0; i < books.size() ; i++) {
                        System.out.println("===== 查询结果 =====");
                        books.get(i).showDetail();
                    }
                    System.out.println("请输入您要借书的名字");
                    String bookTemp = sc.next();
                    boolean flag = false;
                    for (int i = 0; i < books.size() ; i++) {
                        if (bookTemp.equals(books.get(i).getName())){
                            System.out.println("已经查询完毕");
                            System.out.println("当前库存:" + books.get(i).getCount());
                            flag = true;
                            System.out.println("请您输入借阅数量");
                            int tempNumber = sc.nextInt();

                            if (books.get(i).getCount() < tempNumber){
                                System.out.println("您借阅的书本数量，超过库存的数量");
                            }
                            books.get(i).setCount(books.get(i).getCount() - tempNumber);

                        }
                        if (!flag){
                            System.out.println("没有找到该书籍信息");
                        }
                    }



                    break;
                case 4:
                    System.out.println("是否归还书籍");
                    String temp = sc.next();
                    switch (temp){
                        case "是":
                            System.out.println("请输入您要归还的书名");
                            String returnBook = sc.next();
                            boolean flagReturn = false;

                            for (Book b : books) {
                                if (returnBook.equals(b.getName())) {
                                    flagReturn = true;
                                    System.out.println("请输入归还数量");
                                    int returnNumber = sc.nextInt();

                                    b.setCount(b.getCount() + returnNumber);
                                    System.out.println("归还成功，当前库存: " + b.getCount());
                                    break;
                                }
                            }

                            if (!flagReturn) {
                                System.out.println("没有找到该书籍信息");
                            }
                            break;
                        case "不是":
                            break;
                    }


                    break;
                case 5:
                   start  = false;
                    break;

            }
        }

    }
}
