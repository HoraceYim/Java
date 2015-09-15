import java.util.*;

/**
 * This is my first program with a few updates.
 * My name is Horace Yim.
 * @author Horace Yim
 */
public class HelloWorld {
   /**
    * Says hello world and greets the user.
    * @param args command line arguments (not used)
    */
   public static void main(String[] args) {

      // Asks for the user's name.
      Scanner console = new Scanner(System.in);
      System.out.print("What is your name? ");

      /** Saves the user's name as the variable text. */
      String text = console.nextLine();

      // Prints Hello statements.
      System.out.println();
      System.out.println("Hello world!");
      System.out.println("Hello " + text + " !");

      // Declare variable for reverse stirng
      String textReverse = "";

      /**
       * The length of the user's name.
       */
      int length = text.length();

      // Reverse string for the user's name
      for (int i = length - 1; i >= 0; i--) {
         textReverse = textReverse + text.charAt(i);
      }

      // Prints reverse string.
      System.out.println("! " + textReverse + " olleH");

      // Prints fun statements.
      System.out.println("Let's have fun learning Java!");
      System.out.println();

   }
}
