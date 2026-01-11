package OOP.day13.test2;

public class test1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount.ATM bank = bankAccount.new ATM();

        bank.deposit(200);
        bank.withdraw(500);
        bank.withdraw(900);

        bank.check();




    }
}
