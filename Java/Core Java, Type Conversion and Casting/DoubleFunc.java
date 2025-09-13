import java.util.Scanner;

public class DoubleFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double a = sc.nextDouble();
        System.out.println("Enter number 2: ");
        double b = sc.nextDouble();
        System.out.println("Minimum of two double: " + Double.min(a, b));
        System.out.println("Maximum of two double: " + Double.max(a, b));
        System.out.println("Sum of two double: " + Double.sum(a, b));
        sc.close();
    }
}
