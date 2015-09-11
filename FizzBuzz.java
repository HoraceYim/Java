/**
 * This is FizzBuzz program that uses the modulo operator,
 * if/else statements, and for loop to say "Fizz" for multiples
 * of 3, "Buzz" for multiples of 5, and "FizzBuzz" for multiples
 * of both 3 and 5.
 * @author Horace Yim
 */
public class FizzBuzz {

   /** For multiples of 3 says "Fizz".*/
   public static final int FIZZ = 3;

   /** For multiples of 5 says "Buzz".*/
   public static final int BUZZ = 5;

   /**
    * For multiples of 3 and 5, which is 15,
    * the program says "FizzBuzz".
    */
   public static final int FIZZBUZZ = 15;

   /** The counting starts at 1.*/
   public static final int STARTS = 1;

   /** The counting ends at 100.*/
   public static final int ENDS = 100;

   /**
    * Prints the numbers from 1 to 100.
    * For multiples of three, prints “Fizz” instead of the number.
    * For multiples of five, prints “Buzz” instead of the number.
    * For numbers which are multiples of both three and five, prints “FizzBuzz”.
    * @param args command line arguments (not used)
    */
   public static void main(String[] args) {

      //Count 1 to 100
      for (int i = STARTS; i <= ENDS; i++) {

         //Check for multiples of 3 and 5, i.e., 15. Prints "FizzBuzz".
         if (i % FIZZBUZZ == 0) {
            System.out.println("FizzBuzz") ;

         //Check for multiples of 3. Prints "Fizz".
         } else if (i % FIZZ == 0) {
            System.out.println("Fizz");

         //Check for multiples of 5. Prints "Buzz".
         } else if (i % BUZZ == 0) {
            System.out.println("Buzz");

         //Not multiples of 3, 5, or 15. Prints value of i.
         } else {
            System.out.println(i);
         }
      }
   }
}
