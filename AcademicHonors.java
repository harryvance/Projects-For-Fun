import java.util.Scanner;
public class AcademicHonors

{

//Public static void section

public static void main(String[] args)

{

//Double variable declaration section

double gradePointAverage;

double academicHonorAwarded;

//Scanner section

Scanner keyboard = new Scanner(System.in);

System.out.println("Welcome to the Academic Honors Calculation Program.");

System.out.println("What is your grade point average?");
gradePointAverage = keyboard.nextDouble();

if (gradePointAverage < 3.25)

{
   System.out.println("You have not been awarded any academic honors.");
   }

else if (gradePointAverage == 3.25)

{
   System.out.println("You have been awarded Cum Laude academic honors. Congratulations!");
   }

else if (gradePointAverage > 3.25 && gradePointAverage < 3.5)

{
   System.out.println("You have been awarded Cum Laude academic honors. Congratulations!");
   }

else if (gradePointAverage == 3.5)

{
   System.out.println("You have been awarded Magna Cum Laude academic honors. Congratulstions!");
   }


else if (gradePointAverage > 3.5 && gradePointAverage < 3.75)

{
   System.out.println("You have been awarded Magna Cum Laude academic honors. Congratulations!");
   }
   
else if (gradePointAverage == 3.75)

{
   System.out.println("You have been awarded Summa Cum Laude academic honors. Congratulations!");
   }
   
else if (gradePointAverage > 3.75)

{
   System.out.println("You have been awarded Summa Cum Laude academic honors. Congratulations!");
   }

//Closing section

System.out.println("Thank you for using the Academic Honors Calculation Program.");

//End of program

   }

}