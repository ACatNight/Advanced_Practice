package OOP.day14.test1;

import java.util.Random;

public class GameStore1 {
    String storeName = "万乐";
    double balance = 0;

    public void start(){
        Customer customer = new Customer();
        customer.name = "小明";
        Random r = new Random();
        customer.money = r.nextInt(301)+100;
        System.out.println("当前余额" + customer.money);
        Item item1 = new Item();
        item1.setName("木剑");
        item1.setPrice(r.nextInt(100)+10);
        Item item2 = new Item();
        item2.setName("铁剑");
        item2.setPrice(200);
        customer.buy(item1);
        customer.buy(item2);

        System.out.println("商店 余额" + balance);


    }

    public void addBalance(double money){
        balance += money;
    }

    public class Item{
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public void sell(){
            System.out.println("道具" + name + "已售出" + price);
        }
    }
    public class Customer{
        private String name;
        private double money;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }
        public void buy(Item item){
            if (item.getPrice() > money){
                System.out.println("顾客" + name + "额度不足，无法购买" + item.getName()  );
            }else {
                money -= item.getPrice();
                addBalance(item.getPrice());
                item.sell();
                System.out.println("顾客还剩下" + money);
            }
        }
    }

}
