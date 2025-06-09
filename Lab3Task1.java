//Author: Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab3Task1 {
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of miles drovem:");
    double milesDriven=keyboard.nextDouble();
    System.out.println("Enter the gallons used:");
    double gallonsUsed=keyboard.nextDouble();
    double mpg=milesDriven/gallonsUsed;
    System.out.println("Your car MPG is:"+mpg);
    keyboard.close();
  }
}