import java.util.Random;
import java.util.Scanner;
public class PinEncryption {
    public static void main (String[] args)
    {
        int pin, dec1, dec2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 4 digit PIN number to encrypt: ");
        pin = scan.nextInt();

        Random random = new Random();
        dec1 = random.nextInt((65536 - 1000)+1000);
        dec2 = random.nextInt((65536 - 1000)+1000);

        String hex1 = Integer.toHexString(dec1);
        String hex2 = Integer.toHexString(dec2);
        String hexpin = Integer.toHexString(pin);
        String encrypted = hex1+ hex2 + hexpin;

        System.out.println("Your encrypted pin number is: " + encrypted);
    }
}
