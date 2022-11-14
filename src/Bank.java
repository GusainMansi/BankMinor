package src;

public interface Bank {
    void addMoney(int money) ;
    public boolean withdraw(int money);

    public int checkBalance();
    public double calculateInterest(int year);

}
