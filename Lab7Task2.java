//Nyla D
//Purpose:
public class Lab7Task2 {
    public static void main(String[] args) {
        System.out.println("Centigrade\tFahrenheit");
        System.out.println("--------------------------");

        for (int C = 0; C <= 20; C++) {
            double F = (9.0 / 5.0) * C + 32;
            System.out.printf("%-10d\t%.2f%n", C, F);
        }
    }
}