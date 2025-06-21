//Nyla D
//Purpose:
import java.util.Scanner;

public class Lab7Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter a series of integers. Enter -99 to stop.");

        do {
            System.out.print("Enter an integer: ");
            number = keyboard.nextInt();

            if (number == -99) {
                break;
            }

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

        } while (true);

        if (largest == Integer.MIN_VALUE && smallest == Integer.MAX_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largest);
            System.out.println("The smallest number entered is: " + smallest);
        }

        keyboard.close();
    }
}