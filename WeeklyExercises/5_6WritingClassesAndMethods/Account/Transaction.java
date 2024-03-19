import java.util.Scanner;
public class Transaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your account number:");
        int number = scanner.nextInt();

        Account account = new Account(name, number);
        System.out.println("Account created successfully:");

        account.displayAccountInfo();

        System.out.println("Select an option:");
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Check Balance");
        int option = scanner.nextInt();

        if (option == 1){
            System.out.println("Enter amount to deposit:");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            System.out.println("Deposit successful.");
            return;
        }

        if (option == 2){
            System.out.println("Enter amount to withdraw:");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            return;
        }

        if (option == 3){
            System.out.println("Current balance: £" + account.getBalance());
            return;
        }
    }
}
