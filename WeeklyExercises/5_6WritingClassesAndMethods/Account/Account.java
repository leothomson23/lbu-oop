public class Account {
    public String accountName;
    public int accountNo;
    public double balance;

    public Account(String name, int number, double initialBalance) {
        accountName = name;
        accountNo = number;
        balance = initialBalance;
    }

    public Account(String name, int number) {
        accountName = name;
        accountNo = number;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
            return true;
        } else {
            System.out.println("Balance too low.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: £" + balance);
    }
}
