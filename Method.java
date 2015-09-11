/**
 * This program will use multiple methods to draw different figures.
 * It will also be used to practice using strings.
 * @author Horace Yim
 */

public class Method {
   /**
    * The main method will detail how to draw the figures.
    * @param args command line arguments (not used)
    */
   public static void main(String[] args) {

      //Draws Figure One
      top();
      bottom();
      System.out.println();
      System.out.println("Figure one drawing completed!");
      System.out.println();

      //Draws Figure Two
      lighteningrod();
      top();
      middle();
      foundation();
      System.out.println();
      System.out.println("Figure two drawing completed!");
      System.out.println();

      //Draws Figure Three
      line();
      middle();
      bottom();
      foundation();
      middle();
      bottom();
      lighteningrod();
      System.out.println();
      System.out.println("Figure three drawing completed!");
      System.out.println();

      //Draws Figure Four
      top();
      line();
      middle();
      line();
      bottom();
      System.out.println();
      System.out.println("Figure four drawing completed!");
      System.out.println();

      //Draws Figure Five
      lighteningrod();
      top();
      line();
      middle();
      line();
      middle();
      line();
      middle();
      foundation();
      System.out.println();
      System.out.println("Figure five drawing completed!");
      System.out.println();
   }

   /**
    * Draws the top.
    */
   public static void top() {
      System.out.println("    /\\    ");
      System.out.println("   /  \\   ");
      System.out.println("  /    \\  ");
      System.out.println(" /      \\ ");
      System.out.println("/        \\");
   }

   /**
    * Draws the bottom.
    */
   public static void bottom() {
      System.out.println("\\        /");
      System.out.println(" \\      / ");
      System.out.println("  \\    /  ");
      System.out.println("   \\  /   ");
      System.out.println("    \\/    ");
   }

   /**
    * Draws the middle.
    */
   public static void middle() {
      System.out.println("|        |");
      System.out.println("|        |");
      System.out.println("|        |");
      System.out.println("|        |");
      System.out.println("|        |");
   }

   /**
    * Draws the lightening rod.
    */
   public static void lighteningrod() {
      System.out.println("     |     ");
      System.out.println("     |     ");
      System.out.println("     |     ");
      System.out.println("     |     ");
      System.out.println("     |     ");
   }

   /**
    * Draws the foundation.
    */
   public static void foundation() {
      System.out.println("----------");
      System.out.println("----------");
      System.out.println("----------");
   }

   /**
    * Draws a line.
    */
   public static void line() {
      System.out.println("----------");
   }
}
