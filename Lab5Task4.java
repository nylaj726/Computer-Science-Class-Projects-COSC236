//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab5Task4{
  public static void main(String[] args){
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter whole number(integer)between 1 and 5:");
    int number=keyboard.nextInt();
    switch(number){
      case 1:
        System.out.println("The Roman numeral for"+number+" is I");
        break;
      case 2:
        System.out.println("The Roman numeral for"+number+" is II.");
        break; 
      case 3: 
        System.out.println("The Roman numeral for " + number + " is III."); 
        break; 
      case 4: 
        System.out.println("The Roman numeral for " + number + " is IV."); 
        break; 
      case 5: 
        System.out.println("The Roman numeral for " + number + " is V."); 
        break; 
      default: 
        System.out.println("Error: The number is outside the range of 1 through 5.");
        break;
        } 
    
        keyboard.close(); 
    } 
} 
  