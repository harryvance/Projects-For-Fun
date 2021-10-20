import java.util.Scanner;
public class AnnualPaycheckCalculationProgram

{

  //Public static void section

  public static void main(String[] args)

{

  //Double variable declaration section


   double dollarsPerHour;
   
   double hoursPerWeek;
   
   double annualPaycheck;
   
  
  //Scanner setup section
 
 
  Scanner keyboard = new Scanner(System.in);

  System.out.println("Welcome to the Annual Paycheck Calculation Program.");
  
  System.out.println("Please enter how much you make per hour.");
  dollarsPerHour = keyboard.nextDouble();
  
  System.out.println("Please enter how many hours you work per week.");
  hoursPerWeek = keyboard.nextDouble();
  
  annualPaycheck = (dollarsPerHour * hoursPerWeek * 4 * 12);
  
  System.out.println("Your annual paycheck, before taxes, is " +annualPaycheck);
  
  System.out.println("Thank you for using the Annual Paycheck Calculation Program.");
  
  
  //End of program
  

   }
   
}