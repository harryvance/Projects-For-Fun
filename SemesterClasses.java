import java.util.Scanner;  //Scanner package import section
public class SemesterClasses    //Class declaration section

{
 
  public static void main(String[] args)    //Main declaration section
  
  { 
  
  //Array creation section
  
  String[] semesterSchedule = new String[5];   //Creation of a new array named semesterSchedule [5]
  
  //Variable declaration section
  
  String mondayClass;
  
  String tuesdayClass;
  
  String wednesdayClass;
  
  String thursdayClass;
  
  String fridayClass;
  
  //Scanner creation section
  
  Scanner classRegister = new Scanner(System.in);
  
  //Welcome section
  
  System.out.println("For this semester, you go to school part-time and you have one college class scheduled each day of this week.");
  
  //First input section
  
  System.out.println("Please enter your class for Monday.");
  
  mondayClass = classRegister.nextLine();
  
  semesterSchedule[0] = mondayClass;
  
  //Second input section
  
  System.out.println("Please enter your class for Tuesday.");
  
  tuesdayClass = classRegister.nextLine();
  
  semesterSchedule[1] = tuesdayClass;
  
  //Third input section
  
  System.out.println("Please enter your class for Wednesday.");
  
  wednesdayClass = classRegister.nextLine();
  
  semesterSchedule[2] = wednesdayClass;
  
  //Fourth input section
  
  System.out.println("Please enter your class for Thursday.");
  
  thursdayClass = classRegister.nextLine();
  
  semesterSchedule[3] = thursdayClass;
  
  //Final input section
  
  System.out.println("Please enter your class for Friday.");
  
  fridayClass = classRegister.nextLine();
  
  semesterSchedule[4] = fridayClass;
  
  //Array calculation section
  
  System.out.println("Here is your complete schedule for this semester.");
  
  for (int i = 0; i < 5; i++)
  
 {
    System.out.println(semesterSchedule[i]);
 }
 
 System.out.println("The total number of classes in your weekly schedule is " + semesterSchedule.length);
 
 System.out.println("Good luck with your classes this semester!");
  
  }
  
  //End of program
  
  }