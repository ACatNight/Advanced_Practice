package org.acatNight.day8;

public class Product {
    private String name;
    private double unitPrice; // 单价
    private int quantity;     // 数量

    public Product() {}

    public Product(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // setter / getter
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public double getUnitPrice() { return unitPrice; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getQuantity() { return quantity; }

    // 该商品总价 = 单价 * 数量
    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    // 显示详细信息（可被子类 override）
    public void showDetail() {
        System.out.printf("商品名: %s | 单价: %.2f | 数量: %d | 小计: %.2f%n",
                name, unitPrice, quantity, getTotalPrice());
    }
}
