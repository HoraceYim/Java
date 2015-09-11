/**
 * Projectile.java is a program used to calculate the position of
 * the a ball throw into the air vertically at 1, 2, 3, 4, and 5 seconds.
 * @author Horace Yim
 */
public class Projectile {
   /**
    * Declare variables, use the vertical projectile physics formula
    * to calculate the position of the ball at 1, 2, 3, 4, and 5 seconds.
    * Earth's gravity is at -9.8 m/(s^2).
    * The ball's initial upward velocity is at 20 m/s.
    * The starting position of the ball is at 0 m.
    */
   public static void main(String[] args) {
      // Declare variables
      // Acceleration is -9.8 m/(s^2)
      double a = -9.8;
      // The initial velocity is at 20 m/s.
      double v0 = 20;
      // The original position of the ball at 0 m.
      double s0 = 0;

      // Declare time
      int t1 = 1;
      int t2 = 2;
      int t3 = 3;
      int t4 = 4;
      int t5 = 5;

      // Calculate s1
      double s1 = s0 + (v0 * t1) + (0.5 * a * t1 * t1);
      // Calculate s2
      double s2 = s0 + (v0 * t2) + (0.5 * a * t2 * t2);
      // Calculate s3
      double s3 = s0 + (v0 * t3) + (0.5 * a * t3 * t3);
      // Calculate s4
      double s4 = s0 + (v0 * t4) + (0.5 * a * t4 * t4);
      // Calculate s5
      double s5 = s0 + (v0 * t5) + (0.5 * a * t5 * t5);


      //print results
      System.out.println("s when t = 1 is at " + s1 + "m.");
      System.out.println("s when t = 2 is at " + s2 + "m.");
      System.out.println("s when t = 3 is at " + s3 + "m.");
      System.out.println("s when t = 4 is at " + s4 + "m.");
      System.out.println("s when t = 5 is at " + s5 + "m.");
   }
}
