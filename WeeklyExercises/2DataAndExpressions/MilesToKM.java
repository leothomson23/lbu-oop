import java.util.Scanner;
public class MilesToKM {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a distance in miles and I will convert it to kilometers.");
		
		System.out.print("Enter a distance in miles: ");
		double miles = scanner.nextDouble();
		double kilometers = miles * 1.60935;
		System.out.print(miles + "miles converted to kilometers is " + kilometers + "km");

	}

}
