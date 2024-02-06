// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and " + "I will compute their average");
       
       System.out.print("Enter the first integer: ");
       val1 = scan.nextInt();

       System.out.print("Enter the second integer: ");
       val2 = scan.nextInt();

       System.out.print("Enter the third integer: ");
       val3 = scan.nextInt();

       average = (val1 + val2 + val3) / 3;
       System.out.println("The average of the three integers is: " + average);
    }
}