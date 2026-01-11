package OOP.day8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CheckoutSystem {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        Member vip = null; // 当前会员（可为空）
        boolean running = true;

        System.out.println("欢迎使用简易购物系统");
        while (running) {
            System.out.println("------------- 菜单 -------------");
            System.out.println("1. 加入商品到购物车");
            System.out.println("2. 打印购物车所有商品");
            System.out.println("3. 计算总价");
            System.out.println("4. 计算折后价并更新会员等级/积分");
            System.out.println("5. 创建/切换会员");
            System.out.println("6. 打印最终小票并退出");
            System.out.println("0. 退出（不生成小票）");
            System.out.print("请选择: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.next());
            } catch (Exception e) {
                System.out.println("输入无效，请输入数字。");
                continue;
            }

            switch (choice) {
                case 1:
                    // 添加商品
                    System.out.print("请输入要添加的商品数量: ");
                    int n;
                    try {
                        n = Integer.parseInt(sc.next());
                    } catch (Exception e) {
                        System.out.println("无效数量，返回菜单");
                        break;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("请选择商品类型：1. 普通 2. 食品 3. 电子 4. 日用品");
                        int t = Integer.parseInt(sc.next());
                        Product p;
                        switch (t) {
                            case 2: p = new Food(); break;
                            case 3: p = new Electronic(); break;
                            case 4: p = new DailyGoods(); break;
                            default: p = new Product(); break;
                        }
                        System.out.print("请输入商品名称: ");
                        p.setName(sc.next());
                        System.out.print("请输入单价(元): ");
                        double price = Double.parseDouble(sc.next());
                        p.setUnitPrice(price);
                        System.out.print("请输入数量: ");
                        int qty = Integer.parseInt(sc.next());
                        p.setQuantity(qty);

                        // 额外属性示例
                        if (p instanceof Electronic) {
                            ((Electronic) p).setWarrantyYears(r.nextInt(5) + 1);
                        } else if (p instanceof Food) {
                            ((Food) p).setExpireDate("2026-12-31"); // demo
                        } else if (p instanceof DailyGoods) {
                            ((DailyGoods) p).setMaterial("塑料");
                        }

                        cart.add(p);
                        System.out.println("已加入购物车: ");
                        p.showDetail();
                    }
                    break;

                case 2:
                    // 打印购物车
                    if (cart.isEmpty()) {
                        System.out.println("购物车为空");
                    } else {
                        System.out.println("购物车内容：");
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.print((i+1) + ". ");
                            cart.get(i).showDetail();
                        }
                    }
                    break;

                case 3:
                    // 计算总价（不含折扣）
                    double total = calcTotal(cart);
                    System.out.printf("购物车总价(未折扣)：%.2f 元%n", total);
                    break;

                case 4:
                    // 计算折后价并更新会员等级/积分
                    if (cart.isEmpty()) {
                        System.out.println("购物车为空，无法计算折扣。");
                        break;
                    }
                    if (vip == null) {
                        System.out.println("当前没有会员，请先创建/切换会员（选项5）。");
                        break;
                    }
                    double totalBefore = calcTotal(cart);
                    // 根据总价评估会员等级（升级）
                    vip.evaluateLevelByTotal(totalBefore);
                    // 计算折后价
                    double after = vip.applyDiscount(totalBefore);
                    // 奖励积分（按折后金额计算）
                    vip.awardPointsByAmount(after);

                    System.out.println("会员信息更新： " + vip.info());
                    System.out.printf("原价: %.2f 元 | 折后价: %.2f 元%n", totalBefore, after);
                    break;

                case 5:
                    // 创建或切换会员
                    System.out.print("请输入会员姓名（将创建/切换）：");
                    String mname = sc.next();
                    vip = new Member(mname);
                    System.out.println("已切换到会员：" + vip.info());
                    break;

                case 6:
                    // 打印最终小票并退出
                    double finalTotal = calcTotal(cart);
                    System.out.println("------ 小票 ------");
                    for (Product p : cart) {
                        p.showDetail();
                    }
                    System.out.printf("原价合计：%.2f 元%n", finalTotal);
                    if (vip != null) {
                        vip.evaluateLevelByTotal(finalTotal);
                        double discounted = vip.applyDiscount(finalTotal);
                        System.out.printf("会员(%s) 折后价：%.2f 元%n", vip.getName(), discounted);
                        System.out.println("会员信息：" + vip.info());
                    } else {
                        System.out.println("无会员，未享受折扣。");
                    }
                    System.out.println("感谢光临！");
                    running = false;
                    break;

                case 0:
                    running = false;
                    System.out.println("已退出。");
                    break;

                default:
                    System.out.println("无效选项");
            }
        }

        sc.close();
    }

    // 计算购物车总价
    private static double calcTotal(ArrayList<Product> cart) {
        double sum = 0.0;
        for (Product p : cart) {
            sum += p.getTotalPrice();
        }
        return sum;
    }
}
