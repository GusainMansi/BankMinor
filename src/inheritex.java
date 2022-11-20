package src;

public class inheritex extends MansiBank {
    public inheritex(int accountNo, String name, int balance, double interestRate) {
        super(accountNo, name, balance, interestRate);
    }


    @Override
    public void addMoney(int money) {
        this.balance+=money;
        System.out.println("Your total balance is "
                +balance);
    }

    @Override
    public boolean withdraw(int money) {
        if (money <= balance) {
            balance -= money;
            System.out.println("Money withdrawn " + money);
            System.out.println("Your total balance now is "
                    + balance);
            return true;
        } else {
            System.out.println("Sorry invalid request");
            return false;
        }


    }}