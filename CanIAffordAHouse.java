import java.util.Scanner;
public class CanIAffordAHouse

{

public static void main(String[] args)

{

//Double variable declaration section

double annualIncome;

double downPayment;

//Scanner section   $10,150

Scanner keyboard = new Scanner(System.in);

//Beginning section

System.out.println("Welcome to the House Affordability Calculation Program.");

System.out.println("At the moment, the average cost of a house in America is $290,000. Today we will find out if you can afford to buy a house.");

//Scanner input section

System.out.println("How much do you make a year, before taxes?");
annualIncome = keyboard.nextDouble();

System.out.println("How much of a down payment can you afford to pay?");
downPayment = keyboard.nextDouble();

//If-else section

if (annualIncome < 70000 || downPayment < 10000)
 {
   System.out.println("We regret to inform you that you cannot afford to buy a house at this time. Thank you for using the House Affordability Calculation Program.");
   }
 
else 
   {
     System.out.println("Congratulations, you make enough money overall to be able to afford a house. Thank you for using the House Affordability Calculation Program.");
        }
   
   }
   
}



