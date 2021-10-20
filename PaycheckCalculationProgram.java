import java.util.Scanner;
public class PaycheckCalculationProgram

{

  //Public static void section

  public static void main(String[] args)

{

   //Double variable declaration section

   double hoursPerWeek;
   
   double dollarsPerHour;
   
   double monthlyPaycheck;
   
   //Scanner section
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Welcome to the Paycheck Calculation Program, where we help you find out how much your monthly paycheck is.");
   
   System.out.println("Please enter how much you make per hour.");
   dollarsPerHour = keyboard.nextDouble();
   
   System.out.println("Please enter how many hours you work per week.");
   hoursPerWeek = keyboard.nextDouble();
   
   monthlyPaycheck = (dollarsPerHour * hoursPerWeek * 4);
   
   System.out.println("Your monthly paycheck, before tax, is: " + monthlyPaycheck);
   
   System.out.println("Thank you for using the Paycheck Calculation Program.");
   
   //End of program

   }

}