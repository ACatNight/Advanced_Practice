package OOP.day9.test1;

public class Magazine extends Book{
    private String issue;

    @Override
    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String getIssue() {
        return issue;
    }

    @Override
    public void showDetail() {
        System.out.println("书名：" + getName() + "\n" +
                "价格：" + getPrice() + "\n" +
                "库存数量：" + getCount() + " 本\n" +
                "期号:" + getIssue() + "\n" +
                "当前状态：可借阅\n" +
                "======================");

        super.showDetail();
    }
}
