import java.util.*;

/**
 * MyBMI.java is a program used to calculate the
 * Body Mass Index.
 * @author Horace Yim
 */
public class MyBMI {
   /*
    * Declare variables, using height/weight, and the formula
    * to calculate the BMI. Then, print out the results.
    * @param args command line arguments (not used).
    */
   public static void main(String[] args) {

      // Asks the user for the height and weight
      Scanner console = new Scanner(System.in);
      System.out.print("What is your height in inches? ");
      double height = console.nextDouble();
      System.out.print("What is your weight in pounds? ");
      double weight = console.nextDouble();
      double bmi = calculateBMI(height, weight);
      System.out.println("My height is " + height + " in.") ;
      System.out.println("My weight is " + weight + " lbs.") ;
      System.out.println("My BMI is " + bmi) ;

      /* Use if/else statements to determine the BMI
       * categories of underweight, normal weight,
       * overweight, or obese. */

      //calculate underweight.
      if (bmi < 18.5) {
         System.out.println("I am underweight.");

      // calculate normal weight.
      } else if (bmi >= 18.5) {
         System.out.println("I am normal weight.");

      //calculate overweight
      } else if (bmi >= 25) {
         System.out.println("I am overweight.");

      //calculate obese
      } else {
         System.out.println("I am obese.");
      }
   }

   /**
    * Calculates the BMI.
    * @return bmi The Body Mass Index.
    */
   public static double calculateBMI(double height, double weight) {

      // BMI calculation formula
      double bmi = weight / Math.pow(height,2) * 703;
      return bmi;
   }
}
