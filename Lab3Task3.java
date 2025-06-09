//Nyla Dickerson
import java.util.Scanner; // cite: 5 
public class Lab3Task3 { 
    public static void main(String[] args){ 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the retail price of the circuit board: ");
        double retailPrice = keyboard.nextDouble();
        double profit = retailPrice * 0.40;
        System.out.println("Profit earned: $" + profit);
        keyboard.close();
    } 
} 