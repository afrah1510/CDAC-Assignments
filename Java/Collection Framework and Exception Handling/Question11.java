import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any string: ");
            String str = sc.nextLine();
            int intVal = Integer.parseInt(str);
            System.out.println("Converted integer: " + intVal);

            System.out.println();

            String str2 = null;
            System.out.println("String 2 length: " + str2.length());

        } catch (NumberFormatException ne) {
            System.out.println(ne);
        } catch (NullPointerException pe) {
            System.out.println(pe);
        } finally {
            System.out.println("\nConversion attempt completed!");
        }
    }
}
