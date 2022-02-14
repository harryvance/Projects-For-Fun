import java.util.Scanner;  //Scanner package import section
public class EightNumberSorter    //Class declaration section

{
 
  public static void main(String[] args)    //Main declaration section
  
  { 
  
  //Variable declaration section
  
  int evenNumbers = 0;  //(even numbers counter)
  
  int oddNumbers = 0;   //(odd numbers counter)
  
  int sumTotal;

  int firstNumber;
  
  int secondNumber;
  
  int thirdNumber;
  
  int fourthNumber;
  
  int fifthNumber;
  
  int sixthNumber;
  
  int seventhNumber;
  
  int eighthNumber;
  
  //Scanner creation section
  
  Scanner inputRegister = new Scanner(System.in);
  
  //Welcome section
  
  System.out.println("For the purposes of this program, you will be entering twelve numbers.");
  
  //First number section
  
  System.out.println("Please enter the first number.");
  
  firstNumber = inputRegister.nextInt();
  
  if (firstNumber % 2 == 0)
  
  {
  System.out.println("Your first number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your first number was odd.");
  oddNumbers++;
  }
  
  //Second number section
  
  System.out.println("Please enter the second number.");
  
  secondNumber = inputRegister.nextInt();
  
  if (secondNumber % 2 == 0)
  
  {
  System.out.println("Your second number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your second number was odd.");
  oddNumbers++;
  }
  
   //Third number section
  
  System.out.println("Please enter the second number.");
  
  thirdNumber = inputRegister.nextInt();
  
  if (thirdNumber % 2 == 0)
  
  {
  System.out.println("Your third number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your third number was odd.");
  oddNumbers++;
  }
  
   //Fourth number section
  
  System.out.println("Please enter the fourth number.");
  
  fourthNumber = inputRegister.nextInt();
  
  if (fourthNumber % 2 == 0)
  
  {
  System.out.println("Your fourth number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your fourth number was odd.");
  oddNumbers++;
  }
  
   //Fifth number section
  
  System.out.println("Please enter the fifth number.");
  
  fifthNumber = inputRegister.nextInt();
  
  if (fifthNumber % 2 == 0)
  
  {
  System.out.println("Your firth number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your fifth number was odd.");
  oddNumbers++;
  }

   //Sixth number section
  
  System.out.println("Please enter the sixth number.");
  
  sixthNumber = inputRegister.nextInt();
  
  if (sixthNumber % 2 == 0)
  
  {
  System.out.println("Your sixth number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your sixth number was odd.");
  oddNumbers++;
  }

 //Seventh number section
  
  System.out.println("Please enter the seventh number.");
  
  seventhNumber = inputRegister.nextInt();
  
  if (seventhNumber % 2 == 0)
  
  {
  System.out.println("Your seventh number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your seventh number was odd.");
  oddNumbers++;
  }

 //Eight number section
  
  System.out.println("Please enter the eighth number.");
  
  eighthNumber = inputRegister.nextInt();
  
  if (eighthNumber % 2 == 0)
  
  {
  System.out.println("Your eighth number was even.");
  evenNumbers++;
  }
  
  else
  {
  System.out.println("Your eighth number was odd.");
  oddNumbers++;
  }
  
  sumTotal = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber);   //Generating the sum total
    
  //Final print-out section
  
  System.out.println("The total number of even numbers you entered is: " + evenNumbers);
  
  System.out.println("The total number of odd numbers you entered is: " + oddNumbers);
  
  System.out.println("The sum total of the numbers you entered is: " + sumTotal);
  
  System.out.println("Thank you for using the Eight Number Sorter Program.");
  
  }
  
  //End of program
  
  }