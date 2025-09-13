import java.util.Scanner;

public class LongFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        long a = sc.nextLong();
        System.out.println("Enter number 2: ");
        long b = sc.nextLong();
        System.out.println("Minimum of two long: " + Long.min(a, b));
        System.out.println("Maximum of two long: " + Long.max(a, b));
        System.out.println("Sum of two long: " + Long.sum(a, b));
        sc.close();
    }
}
