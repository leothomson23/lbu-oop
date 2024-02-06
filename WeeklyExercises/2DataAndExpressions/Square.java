import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of a sqaure in cm: ");
		int length = scanner.nextInt();
		
		int area = length * length;
		int perimeter = length * 4;
		
		System.out.println("Perimeter: " + perimeter + "cm");
		System.out.println("Area: " + area + "cm2");
		
		

	}

}
