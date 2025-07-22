interface Bank {
    void deposit(double x);
    void withdraw(double x);
}

class Account implements Bank {
    double bal = 0;
    public void deposit(double x) {
        bal += x;
        System.out.println("Deposited: " + x + ", Balance: " + bal);
    }
    public void withdraw(double x) {
        if (x <= bal) {
            bal -= x;
            System.out.println("Withdrawn: " + x + ", Balance: " + bal);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class lab7_q3{
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(100);
        a.withdraw(30);
        a.withdraw(80);
    }
}