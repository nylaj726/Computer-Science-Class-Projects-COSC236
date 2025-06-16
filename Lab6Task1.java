//Nyla Dickerson
//Purpose:
  import java.util.Scanner;
  public class Lab6Task1{
    public static void main(String []args){
      Scanner keyboard=new Scanner(System.in);
      int number;
      do{
      System.out.print("Enter a positive nonzero integer value:");
      number=keyboard.nextInt();
      } while(number<=0);
      int sum=0;
      int i=1;
      while(i<=number){
        sum+=i;
        i++;
      }
      System.out.println("The sum of integers from 1 to "+number+" is: "+sum);
      keyboard.close();
    }
  }