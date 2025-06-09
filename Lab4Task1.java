//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab4Task1{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a whole number(integer):");
    int number = keyboard.nextInt();
    if(number%2==0){
      System.out.println(number+"is an even number.");
    }
    else{
      System.out.println(number+"is an odd number.");
  }
    keyboard.close();
  }
}


  
  
  