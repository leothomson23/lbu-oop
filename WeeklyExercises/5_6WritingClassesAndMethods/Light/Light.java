import java.util.Scanner;
public class Light {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        Scanner scanner = new Scanner(System.in);
        System.out.println("For Bulb 1, enter 1 to turn it on, or 0 to turn it off.");
        int bulb1_choice = scanner.nextInt();

        System.out.println("For Bulb 2, enter 1 to turn it on, or 0 to turn it off.");
        int bulb2_choice = scanner.nextInt();

        bulb1.controlBulb(bulb1_choice);
        bulb2.controlBulb(bulb2_choice);

        System.out.println("Bulb 1 Status: " + bulb1.getStatus());
        System.out.println("Bulb 2 Status: " + bulb2.getStatus());
    }
}