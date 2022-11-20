package src;

public class MansiBank implements Bank {
private int accountNo;
private String name;
protected int balance;
private double interestRate;

private String password="123";public void setPassword(String newPass,String oldPass){
    if(oldPass==this.password ){
        this.password=newPass;
        System.out.println("Password changed " +
                "successfully");
    }
    else{
        System.out.println("Incorrect password");
    }
}

    public MansiBank(int accountNo, String name, int balance, double interestRate) {
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
