package OOP.day8;

public class Electronic extends Product {
    private int warrantyYears;

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears; }
    public int getWarrantyYears() {
        return warrantyYears; }

    @Override
    public void showDetail() {
        System.out.printf("[电子产品] ");
        System.out.printf("保修: %d 年 | ", warrantyYears);
        super.showDetail();
    }
}
