//Nyla Dickerson
//Purpose:
import java.util.Scanner;
public class Lab4Task4{ 
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter test score 1: ");
        double score1 = keyboard.nextDouble();
        System.out.print("Enter test score 2: ");
        double score2 = keyboard.nextDouble();
        System.out.print("Enter test score 3: ");
        double score3 = keyboard.nextDouble();
        double average = (score1 + score2 + score3) / 3.0;
        char letterGrade;
        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
        } else if (average >= 80 && average <= 89) {
            letterGrade = 'B';
        } else if (average >= 70 && average <= 79) {
            letterGrade = 'C';
        } else if (average >= 60 && average <= 69) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        } 
        System.out.println("Average Test Score: " + String.format("%.2f", average));
        System.out.println("Letter Grade: " + letterGrade);
        keyboard.close(); 
    } 
} 