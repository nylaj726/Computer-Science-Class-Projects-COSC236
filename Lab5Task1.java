//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab5Task1{
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter the object's mass in kilograms:");
    double mass = keyboard.nextDouble();
    double weight=mass*9.8;
    System.out.println("The object's weight is:"+weight+" Newtons");
    if(weight>1000){
      System.out.println("The object is too heavy.");
    } else if(weight<10){
      System.out.println("The object is too light.");
    }
    keyboard.close();
  }
}