package OOP.day13.test2;

public class BankAccount {
    private double balance = 1000;


    public class ATM{
        public void deposit(double amount){
            balance += amount;
        }
        public void withdraw(double amount){
            if (balance < amount){
                System.out.println("额度不足");
            }else {
                balance -= amount;
            }

        }
        public void check(){
            System.out.println("当前额度还有" + balance);
        }
    }
}
