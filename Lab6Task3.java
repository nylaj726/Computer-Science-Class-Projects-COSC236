//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab6Task3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double startingOrganisms;
        double dailyIncreasePercentage;
        int numberOfDays;
        do {
            System.out.print("Enter the starting number of organisms (must be 2 or greater): ");
            startingOrganisms = keyboard.nextDouble();
            if (startingOrganisms < 2) {
                System.out.println("Starting number of organisms must be at least 2. Please re-enter.");
            }
        } while (startingOrganisms < 2);
        do {
            System.out.print("Enter the average daily population increase (as a percentage, e.g., 50 for 50%): ");
            dailyIncreasePercentage = keyboard.nextDouble();
            if (dailyIncreasePercentage < 0) {
                System.out.println("Daily increase percentage cannot be negative. Please re-enter.");
            }
        } while (dailyIncreasePercentage < 0);
        do {
            System.out.print("Enter the number of days they will multiply (must be 1 or greater): ");
            numberOfDays = keyboard.nextInt();
            if (numberOfDays < 1) {
                System.out.println("Number of days must be at least 1. Please re-enter.");
            }
        } while (numberOfDays < 1);
        double currentPopulation = startingOrganisms;
        double increaseFactor = 1 + (dailyIncreasePercentage / 100);
        System.out.println("\nDay\t\tOrganisms");
        System.out.println("-----------------------------");
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.println(day + "\t\t" + currentPopulation);
            currentPopulation *= increaseFactor;
        }
        keyboard.close();
    }
}
