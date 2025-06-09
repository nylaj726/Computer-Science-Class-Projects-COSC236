//Nyla Dickerosn
//Purpose:
import java.util.Scanner;
public class Lab4Task2{
  public static void main(String[] args){
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter a whole number(integer)between 1 and 5:");
  int number = keyboard.nextInt();
  if(number==1){
    System.out.println("The Roman numeral for"+number+"is I.");
  } else if (number == 2) {
    System.out.println("The Roman numeral for " + number + " is II.");
  } else if(number==3) {
    System.out.println("The Roman numeral for " + number + " is III.");
  } else if(number ==4){
    System.out.println("The Roman numeral for " + number + " is IV.");
  } else if (number==5){
    System.out.println("The Roman numeral for " + number + " is V.");
  } else{
    System.out.println("Error: The number is outside the range of 1 through 5.");
  }
  keyboard.close();
}
}
    
    
  
  