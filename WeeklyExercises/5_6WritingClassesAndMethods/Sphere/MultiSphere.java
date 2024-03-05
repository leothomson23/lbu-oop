import java.util.Scanner;
public class MultiSphere{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the diameter of sphere 1: ");
        double input1 = scan.nextDouble();

        System.out.println("Enter the diameter of sphere 2: ");
        double input2 = scan.nextDouble();

        Sphere sphere1 = new Sphere(input1);
        sphere1.setDiameter(input1);

        Sphere sphere2 = new Sphere(input2);
        sphere2.setDiameter(input2);

        System.out.println(sphere1.toString());
        System.out.println("Surface Area: " + sphere1.calculateSA() + "cm2");
        System.out.println("Volume: " + sphere1.calculateVolume() + "cm3");

        System.out.println();

        System.out.println(sphere2.toString());
        System.out.println("Surface Area: " + sphere2.calculateSA()+ "cm2");
        System.out.println("Volume: " + sphere2.calculateVolume() + "cm3");
    }
}
