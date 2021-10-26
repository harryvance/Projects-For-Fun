import java.util.Scanner;
public class AverageFoodBudget

{

public static void main(String[] args)

{

//Double variable declaration section

double foodBudgetCostPerMonth;

double foodBudgetCostPerWeek;

double annualFoodBudgetCost;

double foodBudgetCostPerDay;

double foodBudgetSavings;

//Scanner section

Scanner keyboard = new Scanner(System.in);

//Scanner section

System.out.println("Welcome to the Average Food Budget Calculation Program.");

System.out.println("Please enter how much you spend on food a month.");

foodBudgetCostPerMonth = keyboard.nextDouble();

foodBudgetCostPerWeek = (foodBudgetCostPerMonth / 4);

annualFoodBudgetCost = (foodBudgetCostPerMonth * 12);

foodBudgetCostPerDay = (foodBudgetCostPerMonth / 30);

foodBudgetSavings = (foodBudgetCostPerMonth / 100) * 20;

System.out.println("Every week, the amount you spend on groceries is " + foodBudgetCostPerWeek);
System.out.println("Every month, the amount you spend on groceries is " + foodBudgetCostPerMonth);
System.out.println("Every year, the amount you spend on groceries is " + annualFoodBudgetCost);
System.out.println("Additionally, the amount you spend on groceries every day is " + foodBudgetCostPerDay);
System.out.println("If you cut your monthly grocery bill by 20 percent, every month you would save: " + foodBudgetSavings);

//Closing message

System.out.println("Thank you for using the Average Food Budget Calculation Program.");

   }
   
}

