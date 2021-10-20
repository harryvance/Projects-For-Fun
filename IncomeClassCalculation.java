import java.util.Scanner;
public class IncomeClassCalculation

{

  //Public static void section

  public static void main(String[] args)
  
  {
  
  //Double variable declaration section
  
  double incomePerYear;
  
  double incomeClass;
  
  //Scanner section
  
  Scanner keyboard = new Scanner(System.in);
  
  System.out.println("Welcome to the Income Class Calculation Program.");
  
  System.out.println("Today we will determine what your income class is relative to how much you make per year.");
  
  System.out.println("What is your annual salary, before taxes?");
  incomePerYear = keyboard.nextDouble();
  
  //If-else statement section
  
  if (incomePerYear < 30000)
  
  {
    System.out.println("Your income class is lower class.");
       }
  
  else if (incomePerYear > 30000 && incomePerYear < 80000)
  
  {
    System.out.println("Your income class is middle class.");
     }
     
  else
 
  {
    System.out.println("Your income class is upper class.");
     }
  
  //Closing message section
  
  System.out.println("Thank you for using the Income Class Calculation Program.");
  
  //End of program
  
      }
  
  }