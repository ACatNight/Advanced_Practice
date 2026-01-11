package OOP.day14.test1;

import java.util.Random;

public class GameStore {
    private double balance = 0; // 商店余额

    public double getBalance() {
        return balance;
    }

    public void addIncome(double money){
        balance += money;
    }

    public void start(){
        Random r = new Random();

        System.out.println("=== 游戏商店开业 ===");

        Customer customer = new Customer();
        customer.setName("小明");
        customer.setMoney(r.nextInt(401)+100);  // 100~500

        System.out.println("顾客初始余额：" + customer.getMoney());
        System.out.println("商店初始余额：" + getBalance());

        Item item = new Item();
        item.setName("钻石");
        item.setPrice(100);

        Item item2 = new Item();
        item2.setName("黄金");
        item2.setPrice(200);

        customer.buy(item);
        customer.buy(item2);

        System.out.println("=== 购买结束 ===");
        System.out.println("顾客余额：" + customer.getMoney());
        System.out.println("商店余额：" + getBalance());
    }

    // ----------- 商品类 -------------
    public class Item{
        private String name;
        private double price;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public void sell(){
            System.out.println("商品【" + name + "】成功售出，售价：" + price);
        }
    }

    // ----------- 顾客类 -------------
    public class Customer{
        private String name;
        private double money;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getMoney() { return money; }
        public void setMoney(double money) { this.money = money; }

        public void buy(Item item){
            if (item.getPrice() > money){
                System.out.println("顾客余额不足，无法购买：" + item.getName());
            } else {

                // ❶ 扣顾客钱
                money -= item.getPrice();

                // ❷ 商店收入增加
                addIncome(item.getPrice());

                // ❸ 输出购买信息
                System.out.println("顾客 " + name + " 成功购买 " + item.getName()
                        + "，花费：" + item.getPrice());
                item.sell();

                System.out.println("当前顾客余额：" + money);
                System.out.println("当前商店余额：" + getBalance());
                System.out.println("----------------");
            }
        }
    }
}
