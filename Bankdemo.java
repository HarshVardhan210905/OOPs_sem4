public class Bankdemo {
    public static void main(String[] args) {
        SavingsAccount acc =new SavingsAccount(500,35);
        acc.accountInfo();
    }
}
abstract class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    abstract void accountInfo();
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    public void accountInfo(){
        System.out.println("balance is "+ getBalance());
        System.out.println("interest "+ interestRate);
    }
}

