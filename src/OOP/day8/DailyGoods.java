package OOP.day8;

public class DailyGoods extends Product {
    private String material;

    public void setMaterial(String material) { this.material = material; }
    public String getMaterial() { return material; }

    @Override
    public void showDetail() {
        System.out.printf("[日用品] 材质: %s | ", material);
        super.showDetail();
    }
}
