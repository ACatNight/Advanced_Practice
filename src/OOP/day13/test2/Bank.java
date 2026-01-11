package OOP.day13.test2;

import java.util.Random;

public class Bank {
    public void start(){
        Card c = new Card();
        Random r = new Random();
        c.cardNumber = "";
        for (int i = 0; i < 6; i++) {
            c.cardNumber += r.nextInt(10);
        }
        c.money = r.nextInt(9999-1000+1)+1000;

        System.out.println("当前额度" + c.money);

        APP app = new APP();

        app.transfer(c,23);

        c.show();

    }
    public class Card{
        String cardNumber;
        double money;

        public  void pay(double amount){
            money -= amount;
        }
        public void show(){
            System.out.println("当前卡的金额：" + money);
        }

    }
    public class APP{
       public void transfer(Card c,double amount){
            c.pay(amount);
           System.out.println("APP正在为卡号" + c.cardNumber + "转钱：" + amount + "元");

       }



    }
}
