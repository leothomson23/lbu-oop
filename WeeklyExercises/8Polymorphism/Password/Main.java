public class Main {
    public static void main(String[] args) {
        Secret secret = new Secret("Leeds United are the best team in the world.");

        secret.encrypt();
        System.out.println("Encrypted Secret: " + secret);

        String decryptedSecret = secret.decrypt();
        System.out.println("Decrypted Secret: " + decryptedSecret);


        Password password = new Password("MarceloBielsa");

        password.encrypt();
        System.out.println("Encrypted Password: " + password);

        String decryptedPassword = password.decrypt();
        System.out.println("Decrypted Password: " + decryptedPassword);
    }
}
