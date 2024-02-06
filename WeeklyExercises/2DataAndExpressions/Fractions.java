import java.util.Scanner;
public class Fractions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numerator of a fraction: ");
		int numerator = scanner.nextInt();
		
		System.out.println("Enter the denominator of a fraction: ");
		int denominator = scanner.nextInt();
		
        double decimalEquivalent = (double) numerator / denominator;

        // Display the result
        System.out.println("The decimal equivalent of the fraction " + numerator + "/" + denominator + " is: " + decimalEquivalent);
	}

}
