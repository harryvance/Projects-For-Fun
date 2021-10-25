import java.util.*;
public class FiveNumberTotal

{

public static void main(String[] args)

{

//Double variable declaration

double firstNumber;

double secondNumber;

double thirdNumber;

double fourthNumber;

double fifthNumber;

double sumTotal;

//Scanner section

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter the first of your five numbers.");
firstNumber = keyboard.nextDouble();

System.out.println("Enter the second of your five numbers.");
secondNumber = keyboard.nextDouble();

System.out.println("Enter the third of your five numbers.");
thirdNumber = keyboard.nextDouble();

System.out.println("Enter the fourth of your five numbers.");
fourthNumber = keyboard.nextDouble();

System.out.println("Enter the fifth of your five numbers.");
fifthNumber = keyboard.nextDouble();

sumTotal = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber);

//Closing message

System.out.println("The sum total of your five numbers is " + sumTotal);

//End program

}

}