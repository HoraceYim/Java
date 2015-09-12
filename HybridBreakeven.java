import java.util.*;

/**
 * The HybridBrakeven class will consider the cost of gasoline,
 * the additional expenses of purchasing a hyrbid vehicle,
 * the number of miles driven per year, and the fuel economy of
 * the conventional and hybrid vehicles to calculate the number
 * of years to breakeven when purchasing a hybrid vehicle over
 * a conventional vehicle.
 * @author Horace Yim
 */
public class HybridBreakeven {

   /** Year one of ownership. */
   public static final int YEAR_ONE = 1;

   /**
    * Calculates the cumulative fuel cost and the total cost of conventional
    * and hybrid vehicles in dollars.
    * The for loop will call the calculateFuelCost method two times to
    * produce the cumulative fuel and total costs of the conventional
    * and hybrid vehicles over the duration of car ownership.
    * Prints the results in a table.
    * @param args command line arguments (not used)
    */
   public static void main(String[] args) {

      // Explains to the user about the purpose of the program.
      System.out.println("This program will calculate the number of years to breakeven");
      System.out.println("when purchasing a hybrid vehicle over a conventional vehicle.");
      System.out.println();

      Scanner console = new Scanner(System.in);

      System.out.print("What is the purchase price of the conventional vehicle? ");
      /** The purchase price of the conventional vehicle. */
      double carPrice = console.nextDouble();

      System.out.print("What is the purchase price of the hybrid vehicle? ");
      /** The purchase price of the hybrid vehicle. */
      double hybridPrice = console.nextDouble();

      System.out.print("What is the fuel economy of the conventional vehicle in MPG? ");
      /** The fuel economy of the conventional vehicle. */
      double carMPG = console.nextDouble();

      System.out.print("What is the fuel economy of the hybrid vehicle in MPG? ");
      /** The fuel economy of the hybrid vehicle. */
      double hybridMPG = console.nextDouble();

      System.out.print("The average cost of a gallon of the gasoline? ");
      /** The average cost of a gallon of gasoline. */
      double gasPrice = console.nextDouble();

      System.out.print("How many miles do you drive per year? ");
      /** The number of miles driven by the user annually. */
      double miles = console.nextDouble();

      System.out.print("How many years do you plan to keep the car? ");
      /** The number of years the user plans to keep the car. */
      double maxYears = console.nextDouble();



      // Table headings.
      System.out.println();
      System.out.println("        Cumulative Fuel and Total Cost Comparison (in dollars)        ");
      System.out.println();
      System.out.println("          Conventional             Hybrid            Hybrid Savings   ");
      System.out.println("Years    Fuel      Total       Fuel      Total       Fuel      Total  ");
      System.out.println("-----  --------  ---------   --------  ---------   --------  ---------");

      for (int years = YEAR_ONE; years <= Math.ceil(maxYears); years++) {

         /** The fuel cost of the conventional vehicle. */
         double carFuelCost = calculateFuelCost(years, miles, carMPG, gasPrice);

         /** The total cost of the conventional vehicle. */
         double carTotal = carFuelCost + carPrice;

         /** The fuel cost of the conventional vehicle. */
         double hybridFuelCost = calculateFuelCost(years, miles, hybridMPG, gasPrice);

         /** The total cost of the conventional vehicle. */
         double hybridTotal = hybridFuelCost + hybridPrice;

         /** The savings in cumulative fuel costs by purchasing the hybrid vehicle. */
         double savingsFuel = carFuelCost - hybridFuelCost;

         /** The savings in the total cost by purchasing the hybrid vehicle. */
         double savingsTotal = carTotal - hybridTotal;

         // Prints the outputs of the calculations.
         System.out.printf("%3d", years);
         System.out.printf("%12.2f", carFuelCost);
         System.out.printf("%11.2f", carTotal);
         System.out.printf("%11.2f", hybridFuelCost);
         System.out.printf("%11.2f", hybridTotal);
         System.out.printf("%11.2f", savingsFuel);
         System.out.printf("%11.2f", savingsTotal);
         System.out.println();
      }

      /** The price premium for the hybrid over the conventional vehicle. */
      double premium = hybridPrice - carPrice;

      /** Annual fuel cost of the conventional vehicle. */
      double annualCarFuel = calculateFuelCost(YEAR_ONE, miles, carMPG, gasPrice);

      /** Annual fuel cost of the hybrid vehicle. */
      double annualHybridFuel = calculateFuelCost(YEAR_ONE, miles, hybridMPG, gasPrice);

      /** The number of years required to breakeven. */
      double breakeven = premium / (annualCarFuel - annualHybridFuel);

      /*
      /* Prints the number of years for the user to breakeven from the savings on fuel.
      /* The If else statements will determine when to use "year" or "years".
       */
      if (breakeven > YEAR_ONE) {
         System.out.printf("\nIt would take %.2f years to breakeven.\n", Math.max(0, breakeven));

      } else {
         System.out.printf("\nIt would take %.2f year to breakeven.\n", Math.max(0, breakeven));
      }
   }

   /**
    * Calculates the cumulative fuel cost in dollars using the number
    * of years of ownership, the annual milege driven, the fuel economy,
    * and the average price of a gallon of gasoline.
    * @param years the number of years of ownership
    * @param miles the number of miles driven per year
    * @param mpg the fuel economy
    * @param gasPrice the average price of a gallon of gasoline
    * @return fuel the cumulative fuel cost in dollars
    */
   public static double calculateFuelCost(int years, double miles, double mpg, double gasPrice) {

      /** Calculates the fuel cost.*/
      double fuel = years * (miles / mpg) * gasPrice;

      // Returns the fuel cost to the main method and for loop.
      return fuel;
   }
}
