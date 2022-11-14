package src;

public class Main {
    public static void main(String[] args) {
        MansiBank acc= new MansiBank(12345,"Mansi",100000,4.5);
        acc.addMoney(100000);
        acc.withdraw(50);

        System.out.println("Your balance:"+acc.checkBalance());
        System.out.println("The interest for this year "+acc.calculateInterest(2));
   acc.setPassword("345","123");
    }
}
