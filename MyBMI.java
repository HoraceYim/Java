import java.util.*;

/**
 * The MyBMI class is a program used to calculate the
 * Body Mass Index.
 * @author Horace Yim
 */
public class MyBMI {

   /** The upper limit for underweight in BMI.*/
   public static final double UNDERWEIGHT = 18.5;

   /** The upper limit for normal weight in BMI.*/
   public static final double NORMAL = 25.0;

   /** The upper limit for overweight in BMI.*/
   public static final double OVERWEIGHT = 30.0;

   /** The upper limit for overweight in BMI.*/
   public static final int BMI_CONSTANT = 703;

   /**
    * Using height/weight, and the BMI formula
    * to calculate the BMI. Then, print out the results.
    * @param args command line arguments (not used).
    */
   public static void main(String[] args) {

      // Asks the user for the height and weight
      Scanner console = new Scanner(System.in);
      System.out.print("What is your height in inches? ");

      /** The height given by the user.*/
      double height = console.nextDouble();

      System.out.print("What is your weight in pounds? ");

      /** The weight given by the user.*/
      double weight = console.nextDouble();

      /** Call the calcualteBMI method to calculate the BMI.*/
      double bmi = calculateBMI(height, weight);

      System.out.println("My height is " + height + " in.") ;
      System.out.println("My weight is " + weight + " lbs.") ;
      System.out.println("My BMI is " + bmi) ;

      /* Use if/else statements to determine the BMI
       * categories of underweight, normal weight,
       * overweight, or obese. */

      // calculate underweight.
      if (bmi <= UNDERWEIGHT) {
         System.out.println("I am underweight.");

      // calculate normal weight.
      } else if (bmi <= NORMAL) {
         System.out.println("I am normal weight.");

      // calculate overweight
      } else if (bmi <= OVERWEIGHT) {
         System.out.println("I am overweight.");

      // calculate obese
      } else {
         System.out.println("I am obese.");
      }
   }

   /**
    * Calculates the BMI.
    * @param height the height given by the user.
    * @param weight the weight given by the user.
    * @return bmi The Body Mass Index.
    */
   public static double calculateBMI(double height, double weight) {

      /**
       * Takes the heigh and weight to calculate the BMI.
       */
      double bmi = ( weight / Math.pow(height,2)) * BMI_CONSTANT;
      return bmi;
   }
}
