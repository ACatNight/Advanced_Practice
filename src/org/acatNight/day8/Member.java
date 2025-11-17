package org.acatNight.day8;

/**
 * 会员类（**不继承 Product**）
 * 管理会员等级、积分、折扣逻辑。
 */
public class Member {
    private String name;
    private String level = "普通"; // 默认普通
    private int points = 0;

    public Member() {}
    public Member(String name) { this.name = name; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setLevel(String level) { this.level = level; }
    public String getLevel() { return level; }

    public void addPoints(int delta) { this.points += delta; }
    public int getPoints() { return points; }

    /**
     * 根据购物车总价判定会员等级（升级逻辑）
     * 这里用总价阈值： >1000 金卡, >500 银卡, 否则 普通
     */
    public void evaluateLevelByTotal(double totalPrice) {
        if (totalPrice > 1000) {
            this.level = "金卡";
        } else if (totalPrice > 500) {
            this.level = "银卡";
        } else {
            this.level = "普通";
        }
    }

    /**
     * 根据等级计算折后价并返回
     * 普通：不打折；银卡：95折；金卡：9折
     */
    public double applyDiscount(double total) {
        double discounted = total;
        switch (level) {
            case "金卡": discounted = total * 0.90; break;
            case "银卡": discounted = total * 0.95; break;
            default: discounted = total; break;
        }
        return discounted;
    }

    /**
     * 根据消费获得积分（示例：每消费10元得1分）
     */
    public void awardPointsByAmount(double paidAmount) {
        int gain = (int)(paidAmount / 10);
        addPoints(gain);
    }

    public String info() {
        return String.format("会员: %s | 等级: %s | 积分: %d", name == null ? "未命名" : name, level, points);
    }
}

