package OOP.day8;

public class Food extends Product {
    private String expireDate;

    public void setExpireDate(String expireDate) { this.expireDate = expireDate; }
    public String getExpireDate() { return expireDate; }

    @Override
    public void showDetail() {
        System.out.printf("[食品] 保质期: %s | ", expireDate);
        super.showDetail();
    }
}
