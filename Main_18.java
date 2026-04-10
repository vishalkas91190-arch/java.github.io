class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main_18{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.display();
        acc.deposit(500);
        acc.display();
        acc.withdraw(300);
        acc.display();
        acc.withdraw(1500);
        acc.display();
    }
}
