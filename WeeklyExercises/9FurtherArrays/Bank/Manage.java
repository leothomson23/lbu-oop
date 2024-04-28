public class Manage {
    private Account[] accounts;
    private int numAccounts;

    public Manage() {
        accounts = new Account[30];
        numAccounts = 0;
    }

    public void createAccount(int accountNo, double initialBalance) {
        if (numAccounts < 30) {
            accounts[numAccounts] = new Account(accountNo, initialBalance);
            numAccounts++;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Cannot create account, capacity reached."); // Removed extra semicolon
        }
    }

    public void deposit(int accountNo, double amount){
        Account account = findAccount(accountNo);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void addInterestToAll() {
        for (int i = 0; i < numAccounts; i++) {
            accounts[i].addInterest();
        }
    }

    private Account findAccount(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNo() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}


