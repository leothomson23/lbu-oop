
import java.text.DecimalFormat;
class Sphere {
    private double diameter;
    String pattern = "##0.##";
    DecimalFormat fmt = new DecimalFormat(pattern);

    public Sphere(double input1){
        this.diameter = 0;
    }

    public void setDiameter(double diameter) {
        if (diameter <= 0) {
            System.out.println("Diameter must be a positive number.");
        }
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public String toString() {
        return "Sphere Diameter: " + fmt.format(diameter) + "cm3";
    }

    public String calculateVolume(){
        double radius = diameter / 2;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return fmt.format(volume);
    }

    public String calculateSA(){
        double radius = diameter / 2;
        double surfacearea = (4.0 * Math.PI * Math.pow(radius, 2));
        return fmt.format(surfacearea);
    }
}

