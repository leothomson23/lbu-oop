import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Postcode postcode = new Postcode();

        System.out.println("Enter up to 25 pairs of names and postal codes (separated by tabs):");
        for (int i = 0; i < 25; i++) {
            String inputLine = scanner.nextLine();
            String[] parts = inputLine.split("\t");
            if (parts.length == 3) {
                Person person = new Person(parts[0], parts[1], parts[2]);
                postcode.addPerson(person);
            } else {
                System.out.println("Invalid input format - enter first name, last name, and postal code separated by tabs.");
                break;
            }
        }

        System.out.println("List of people and postcodes:");
        postcode.printList();
    }
}