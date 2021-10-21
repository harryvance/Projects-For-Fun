import java.util.Scanner;
public class ManhattanMealChargeCalculator

{

//Public static void section

public static void main(String[] args)

{

//Double variable declaration section

double priceOfMeal;

double mealTip;

double mealChargeWithTax;

//Scanner section

Scanner keyboard = new Scanner(System.in);

System.out.println("Welcome to the Manhattan Meal Charge Calculator Program.");

System.out.println("How much was your meal?");
priceOfMeal = keyboard.nextDouble();

System.out.println("How much was your tip?");
mealTip = keyboard.nextDouble();

mealChargeWithTax = (priceOfMeal + mealTip) + (priceOfMeal * 0.08875);

System.out.println("Your total meal charge after tax including tip is: " + mealChargeWithTax);

//Closing message

System.out.println("Thank you for using the New York City Meal Charge Calculator Program.");

//End of program

   }
   
}