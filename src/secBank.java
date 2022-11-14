package src;

public class secBank implements Bank{

    int accountNo;
    String name;
    int balance;
    double interestRate;

    public secBank(int accountNo, String name, int balance, double interestRate) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void addMoney(int money) {
        balance+=money;
        System.out.println("Your total balance is "
                +balance);
    }

    @Override
    public boolean withdraw(int money) {
        if( money<=balance){
            balance-=money;
            System.out.println("Money withdrawn "+ money);
            System.out.println("Your total balance now is "
                    +balance);
            return true;
        }
        else{
            System.out.println("Sorry invalid request");
            return false;
        }

    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterest(int year) {
        return balance*interestRate/100 ;
    }
}

