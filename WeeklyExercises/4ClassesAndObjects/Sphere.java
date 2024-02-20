import java.text.DecimalFormat;
import java.util.Scanner;
public class Sphere {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of your sphere in centimeters: ");
        double radius = scan.nextDouble();

        double volume = ((4*Math.PI)*(Math.pow(radius, 3)) / 3);
        double surfacearea = ((4*Math.PI)*Math.pow(radius, 3));

        String pattern = "##0.####";
        DecimalFormat fmt = new DecimalFormat(pattern);

        System.out.println("Radius: " + fmt.format(radius) + "cm");
        System.out.println("Surface Area: " + fmt.format(surfacearea)+ "cm2");
        System.out.println("Area: " + fmt.format(volume) + "cm3");
    }
}
