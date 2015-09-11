/**
 * This is a variation of the FizzBuzz program.
 * We will use the modulo operator, if/else statements,
 * and for loop in this program.
 * @author Horace Yim
 */
public class Bigbang {
   /**
   * A program that prints the numbers from 1 to 100.
   * For multiples of 3, print “Big” instead of the number.
   * For multiples of 5, print “Bang” instead of the number.
   * For numbers which are multiples of both 3 and 5, print “BIGBANG”.
   */
   public static void main(String[] args) {

      //Count 1 to 100
      for (int i = 1; i <= 100; i++) {

         //Check for multiples of 3 and 5, i.e., 15. Prints "FizzBuzz".
         if (i % 15 == 0) {
            System.out.println("BIGBANG") ;

         //Check for multiples of 3. Prints "Big".
         } else if (i % 3 == 0) {
            System.out.println("Big");

         //Check for multiples of 5. Prints "Bang".
         } else if (i % 5 == 0) {
            System.out.println("Bang");

         //Not multiples of 3, 5, or 15. Prints value of i.
         } else {
            System.out.println(i);
         }
      }
   }
}
