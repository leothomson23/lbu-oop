public class Account {
    private int accountNo;
    private double balance;

    public Account(int accountNo, double initialBalance) {
        this.accountNo = accountNo;
        this.balance = initialBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successful deposit. £" + amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount. Enter a positive number.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of £" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void addInterest() {
        double interest = balance * 0.03;
        balance += interest;
        System.out.println("Interest of £" + interest + " added to account.");
    }
}
