package org.acatNight.day9.test1;

public class Novel extends Book {
    private String author;
    @Override
    public void setAuthor(String issue) {
        super.setAuthor(issue);
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void showDetail() {
        System.out.println("书名：" + getName() + "\n" +
                "价格：" + getPrice() + "\n" +
                "库存数量：" + getCount() + " 本\n" +
                "作者:" + getName() + "\n" +
                "当前状态：可借阅\n" +
                "======================");

        super.showDetail();
    }
}
