import java.util.*;

/**
 * The Projectile class is a program used to calculate the position of
 * the a ball throw into the air vertically at 1, 2, 3, 4, and 5 seconds.
 * @author Horace Yim
 */
public class Projectile {

   /** Acceleration due to gravity is -9.8 m/(s^2).*/
   public static final double ACCELERATION = -9.8;

   /** One second after the ball launches. */
   public static final int TIME_MIN = 1;

   /** Five seconds after the ball launches.*/
   public static final int TIME_MAX = 5;

   /** Projectile position formula constant.*/
   public static final double CONSTANT = 0.5;

   /**
    * Use the vertical projectile physics formula to calculate
    * the position of the ball at 1, 2, 3, 4, and 5 seconds.
    * Earth's gravity is at -9.8 m/(s^2).
    * The position and initial velocity are determined by the user.
    * @param args command line arguments (not used)
    */
   public static void main(String[] args) {

      Scanner console = new Scanner(System.in);
      System.out.print("What is the the ball's original position at t = 0 in meters? ");

      /** The use-provided original position of the ball at t = 0.*/
      double s0 = console.nextDouble();

      System.out.print("What is the the ball's initial velocity at t = 0 in m/s? ");

      /** The user-provided original position of the ball at t = 0.*/
      double v0 = console.nextDouble();

      for (int time = TIME_MIN; time <= TIME_MAX; time++) {

         /**
          * Calls the method method to calculate the position of the ball.
          */
         double position = position(time, s0, v0);

         // Prints the results.
         System.out.println("The ball at t=" + time + " is at " + position + "meters.");
      }
   }

   /**
    * Calculates the position of the ball given the time.
    * @param time in seconds
    * @param s0 the initial position of the ball
    * @param v0 the initial velocity of the ball
    * @return the position of the ball at t = 0 to t = 5.
    */
   public static double position(double time, double s0, double v0) {
      double position = s0 + (v0 * time) + (CONSTANT * ACCELERATION * Math.pow(time,2));
      return position;
   }
}
