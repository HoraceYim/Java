/**
 * The BigBang class is a variation of the FizzBuzz program.
 * It will use the modulo operator, if/else statements,
 * and for loop to say "Big" for multiples of 3,
 * "Bang" for multiples of 5, and "BIGBANG" for multiples
 * of both 3 and 5.
 * @author Horace Yim
 */
 public class BigBang {

    /** For multiples of 3 says "Big".*/
    public static final int BIG = 3;

    /** For multiples of 5 says "Bang".*/
    public static final int BANG = 5;

    /**
     * For multiples of 3 and 5, which is 15,
     * the program says "BIGBANG".
     */
    public static final int BIGBANG = 15;

    /** The counting starts at 1.*/
    public static final int STARTS = 1;

    /** The counting ends at 100.*/
    public static final int ENDS = 100;

    /**
     * Prints the numbers from 1 to 100.
     * For multiples of three, prints "Big" instead of the number.
     * For multiples of five, prints "Bang" instead of the number.
     * For numbers which are multiples of both three and five, prints "BIGBANG".
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

       //Count 1 to 100
       for (int i = STARTS; i <= ENDS; i++) {

          //Check for multiples of 3 and 5, i.e., 15. Prints "BIGBANG".
          if (i % BIGBANG == 0) {
             System.out.println("BIGBANG") ;

          //Check for multiples of 3. Prints "Big".
          } else if (i % BIG == 0) {
             System.out.println("Big");

          //Check for multiples of 5. Prints "Bang".
          } else if (i % BANG == 0) {
             System.out.println("Bang");

          //Not multiples of 3, 5, or 15. Prints value of i.
          } else {
             System.out.println(i);
          }
       }
    }
 }
