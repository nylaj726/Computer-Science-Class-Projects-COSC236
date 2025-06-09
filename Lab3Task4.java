//Nyla Dickerson
import java.util.Scanner;
public class Lab3Task4 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of the purchase: "); 
        double purchaseAmount = keyboard.nextDouble();
        double stateSalesTaxRate = 0.04; 
        double countySalesTaxRate = 0.02;
        double stateSalesTax = purchaseAmount * stateSalesTaxRate;
        double countySalesTax = purchaseAmount * countySalesTaxRate; 
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalSale = purchaseAmount + totalSalesTax; 
        System.out.println("Purchase Amount: $" + String.format("%.2f", purchaseAmount));
        System.out.println("State Sales Tax: $" + String.format("%.2f", stateSalesTax));
        System.out.println("County Sales Tax: $" + String.format("%.2f", countySalesTax));
        System.out.println("Total Sales Tax: $" + String.format("%.2f", totalSalesTax));
        System.out.println("Total of the Sale: $" + String.format("%.2f", totalSale));
        keyboard.close(); 
    } 
} 