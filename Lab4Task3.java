//Nyla Dickerosn
//Purpsoe:
import java.util.Scanner;
public class Lab4Task3 { 

    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length and width for Rectangle 1:");
        System.out.print("Length 1: ");
        double length1 = keyboard.nextDouble();
        System.out.print("Width 1: ");
        double width1 = keyboard.nextDouble();
        System.out.println("\nEnter the length and width for Rectangle 2:");
        System.out.print("Length 2: ");
        double length2 = keyboard.nextDouble();
        System.out.print("Width 2: ");
        double width2 = keyboard.nextDouble();
        double area1 = length1 * width1;
        double area2 = length2 * width2;
        System.out.println("\nArea of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);
        if (area1 > area2) {
            System.out.println("Rectangle 1 has the greater area.");
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has the greater area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        } 

        keyboard.close(); 
    } 
} 