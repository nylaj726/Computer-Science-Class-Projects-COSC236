//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab5Task3{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the toal number of calories in the food item:");
    int totalCalories = keyboard.nextInt();
    System.out.println("Enter the number of fat grams in the food item:");
    int fatGrams= keyboard.nextInt();
    int caloriesFromFat = fatGrams*9;
    if (caloriesFromFat > totalCalories){
      System.out.println("Error: Calories from fat cannot be greater than total calories. Invalid input.");
    } else{
      double percentageFat= ((double)caloriesFromFat/totalCalories)*100;
      System.out.printf("Percentage of calories from fat; %.2f%%n",percentageFat);
      if (percentageFat<30){
        System.out.println("This food is low in fat.");
      }
    }
    keyboard.close();
  }
}
