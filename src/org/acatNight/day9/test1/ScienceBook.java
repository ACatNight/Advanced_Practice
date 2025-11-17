package org.acatNight.day9.test1;

public class ScienceBook extends Book {
    private String field;

    @Override
    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String getField() {
        return field;
    }

    @Override
    public void showDetail() {
        System.out.println("书名：" + getName() + "\n" +
                "价格：" + getPrice() + "\n" +
                "库存数量：" + getCount() + " 本\n" +
                "图书领域:" + getField() + "\n" +
                "当前状态：可借阅\n" +
                "======================");

        super.showDetail();
    }

}
