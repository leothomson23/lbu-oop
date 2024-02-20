import java.util.Random;
import java.util.Scanner;
public class Dice {
    public static void main (String[] args){
        int dice1Sides, dice2Sides;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the sides on Die 1: ");
        dice1Sides = scan.nextInt();

        System.out.print("Enter the sides on Die 2: ");
        dice2Sides = scan.nextInt();

        Random random = new Random();

        int D1total, D2total, D1avg, D2avg, D1R1, D1R2, D1R3, D2R1, D2R2, D2R3;
        D1R1 = random.nextInt(dice1Sides);
        D1R2 = random.nextInt(dice1Sides);
        D1R3 = random.nextInt(dice1Sides);
        D1total = D1R1 + D1R2 + D1R3;
        D1avg = D1total / 3;

        D2R1 = random.nextInt(dice2Sides);
        D2R2 = random.nextInt(dice2Sides);
        D2R3 = random.nextInt(dice2Sides);
        D2total = D2R1 + D2R2 + D2R3;
        D2avg = D2total / 3;

        System.out.println("Die 1, Roll 1 = " + D1R1);
        System.out.println("Die 1, Roll 2 = " + D1R2);
        System.out.println("Die 1, Roll 3 = " + D1R3);
        System.out.println("Die 2, Roll 1 = " + D2R1);
        System.out.println("Die 2, Roll 2 = " + D2R2);
        System.out.println("Die 2, Roll 3 = " + D2R3);

        System.out.println("Die 1 rolled a total of " + D1total + " and rolled " +  D1avg + " on average.");
        System.out.println("Die 2 rolled a total of " + D2total + " and rolled " +  D2avg + " on average.");

    }
}
