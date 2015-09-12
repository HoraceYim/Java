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
      System.out.println("Let's have fun learning Java!");
   }
}
