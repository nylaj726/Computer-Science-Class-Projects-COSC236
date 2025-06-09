//Author:Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab3Task2{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter test score 1:");
    double score1 = keyboard.nextDouble();
    System.out.println("Enter test score 2:");
    double score2 = keyboard.nextDouble();
    System.out.println("Enter test score 3:");
    double score3=keyboard.nextDouble();
    double average=(score1+score2+score3)/3.0;
    System.out.println("Test Score 1:"+score1);
    System.out.println("Test Score 2:"+score2);
    System.out.println("Test Score 3"+score3);
    System.out.println("Average Score"+average);
  }
}
    