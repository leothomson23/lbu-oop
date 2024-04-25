public class Password implements Encryptable {
    private String password;
    private boolean encrypted;

    public Password(String password) {
        this.password = password;
        this.encrypted = false;
    }

    public void encrypt() {
        if (!encrypted) {
            StringBuilder encryptedPassword = new StringBuilder(password).reverse();
            password = encryptedPassword.toString();
            encrypted = true;
        }
    }

    public String decrypt() {
        if (encrypted) {
            StringBuilder decryptedPassword = new StringBuilder(password).reverse();
            password = decryptedPassword.toString();
            encrypted = false;
        }
        return password;
    }

    public String toString() {
        return password;
    }
}