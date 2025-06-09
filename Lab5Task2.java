//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab5Task2{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    final double RETAIL_PRICE=99.0;
    System.out.println("Enter the number of packages purchased:");
    int quantity=keyboard.nextInt();
    double discountPercentage =0.0;
    if(quantity>=100){
      discountPercentage=0.50;
    } else if(quantity>=50){
      discountPercentage=0.40;
    } else if(quantity>=20){
      discountPercentage=0.30;
    } else if(quantity>=10){
      discountPercentage=0.20;
    }
    double totalBeforeDiscount =quantity*RETAIL_PRICE;
    double discountAmount= totalBeforeDiscount*discountPercentage;
    double toalCost= totalBeforeDiscount-discountAmount;
    
    System.out.printf("Amount of Discount: $%.2f%n",discountAmount);
    System.out.printf("Total Amount of Purchase after Discount: $%.2f%n",toalCost);
    
    keyboard.close();
  }
}