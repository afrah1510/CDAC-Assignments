import java.util.Scanner;

public class IntFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Minimum of two integer: " + Integer.min(a, b));
        System.out.println("Maximum of two integer: " + Integer.max(a, b));
        System.out.println("Sum of two integer: " + Integer.sum(a, b));
        sc.close();
    }
}