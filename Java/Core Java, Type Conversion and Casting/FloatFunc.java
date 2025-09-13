import java.util.Scanner;

public class FloatFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float b = sc.nextFloat();
        System.out.println("Minimum of two float: " + Float.min(a, b));
        System.out.println("Maximum of two float: " + Float.max(a, b));
        System.out.println("Sum of two float: " + Float.sum(a, b));
        sc.close();
    }
}
