import java.util.Scanner;
public class AreYouWealthy

{

//Public static void section

public static void main(String[] args)

{

//Variable declaration section

double annualSalary;

double financialAssets;

double wealthStatus;

//Scanner declaration section

Scanner wealthRegister = new Scanner(System.in);

System.out.println("Please enter how much you make per year, before taxes.");

annualSalary = wealthRegister.nextDouble();

System.out.println("Please list the total cash value of the assets you owned this year.");

financialAssets = wealthRegister.nextDouble();

if (annualSalary + financialAssets >= 100000)

   {
      System.out.println("You make six figures per year and qualify as financially wealthy.");
      System.out.println("Wealth is best utilized when it is grown and compounded. Build upon what you have already achieved and you will be on your way to financial security.");
      }

else 
         {
            System.out.println("You fall below the financial threshold and do not qualify as financially wealthy at this time.");
            System.out.println("The path to wealth is not just through income, but through assets as well. Continue to work on both and you will be on your way to financial security.");
           }

//Closing message
          

//End of program

}

}