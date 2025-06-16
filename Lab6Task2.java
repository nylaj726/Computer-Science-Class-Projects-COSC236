//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab6Task2{
  public static void main(String []args){
    Scanner keyboard=new Scanner(System.in);
    double speed;
    int hours;
    do {
      System.out.print("Enter the speed of the vehicle (in miles per hour): ");
      speed = keyboard.nextDouble();
      if(speed<0){
        System.out.println("Speed cannot be negative.Please enter a non-negative vaule: ");
      }
    } while (speed<0);
    do {
      System.out.print("Enter the number of hours traveled: ");
      hours= keyboard.nextInt();
      if (hours <1){
        System.out.println("Time traveled must be at least 1 hour.Please enter a value of 1 or greater.");
      }
    } while (hours<1);
    System.out.println("\nHours\t\tDistance");
    System.out.println("-------------------------");
        for (int i = 1; i <= hours; i++) {
            double distance = speed * i;
            System.out.println(i + "\t\t" + distance);
        }
        keyboard.close();
    }
}
