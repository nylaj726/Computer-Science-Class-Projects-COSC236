//Nyla D
//Purpose:
import java.util.Scanner;

public class Lab7Task3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfDays;

        do {
            System.out.print("Enter the number of days worked (must be 1 or greater): ");
            numberOfDays = keyboard.nextInt();
            if (numberOfDays < 1) {
                System.out.println("Number of days worked cannot be less than 1. Please re-enter.");
            }
        } while (numberOfDays < 1);

        double dailySalaryPennies = 1.0;
        double totalPayDollars = 0.0;

        System.out.println("\nDay\t\tDaily Pay ($)\tTotal Pay ($)");
        System.out.println("----------------------------------------------");

        for (int day = 1; day <= numberOfDays; day++) {
            double dailySalaryDollars = dailySalaryPennies / 100.0;
            totalPayDollars += dailySalaryDollars;

            System.out.printf("%d\t\t$%.2f\t\t$%.2f%n", day, dailySalaryDollars, totalPayDollars);
            dailySalaryPennies *= 2;
        }

        System.out.println("\nTotal pay at the end of " + numberOfDays + " days: $" + String.format("%.2f", totalPayDollars));

        keyboard.close();
    }
}