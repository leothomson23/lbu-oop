public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();

        manage.createAccount(1, 1754);
        manage.createAccount(2, 2345);
        manage.createAccount(3, 1754);
        manage.createAccount(4, 235);

        manage.deposit(1, 500);
        manage.withdraw(2, 1000);
        manage.deposit(3, 500);
        manage.withdraw(4, 1000);

        manage.addInterestToAll();
    }
}