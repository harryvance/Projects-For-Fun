import java.util.Scanner;
public class HowOldAreYou

{

//Public static void section

public static void main(String[] args)

{

//Double variable declaration section

double ageOfUser;

double ageCategory;

//Scanner section

Scanner keyboard = new Scanner(System.in);

System.out.println("Welcome to the Age Category Calculation Program.");

//If-else statement section

System.out.println("Please enter how old you are: ");
ageOfUser = keyboard.nextDouble();

if (ageOfUser < 14)

{
  System.out.println("You are very young.");
  }

else if (ageOfUser == 14)

{
   System.out.println("You are a teenager.");
   }

else if (ageOfUser > 14 && ageOfUser < 18)

{
   System.out.println("You are a teenager.");
   }

else if (ageOfUser == 18)

{
   System.out.println("You are a young adult.");
   }

else if (ageOfUser > 18 && ageOfUser < 40)

{
   System.out.println("You are a young adult.");
   }
 
 else if (ageOfUser == 40)
 
 {
   System.out.println("You are middle-aged.");
   }
 
 else if (ageOfUser > 40 && ageOfUser < 70)
 
 {
   System.out.println("You are middle-aged.");
   }
 
 else if (ageOfUser == 70)
 
 {
   System.out.println("You are a senior citizen.");
   }
 
 else if (ageOfUser > 70)
 
 {
   System.out.println("You are a senior citizen.");
   }
   
   //Closing message section
   
   System.out.println("Thank you for using the Age Category Calculation Program.");

   //End of program

}


}