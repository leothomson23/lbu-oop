import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int[] frequency = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100 (Enter 0 to stop):");
        int input = scanner.nextInt();

        while (input >= 1 && input <= 100) {
            int index = (input - 1) / 10;
            frequency[index]++;

            input = scanner.nextInt();
        }

        printHistogram(frequency);
    }

        public static void printHistogram(int[] frequency) {
            for (int i = 0; i < frequency.length; i++) {
                System.out.print((10 * i + 1) + " - " + (10 * (i + 1)) + " | ");
                for (int x = 0; x < frequency[i]; x++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }