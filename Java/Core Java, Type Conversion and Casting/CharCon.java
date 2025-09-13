import java.util.Scanner;

public class CharCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char charVar = sc.next().charAt(0);

        if (Character.isDigit(charVar)) {
            System.out.println("It is a digit.\nValue: " + Character.getNumericValue(charVar));
            System.out.println("Code Point: " + (int) charVar);
        } else if (Character.isLetter(charVar)) {
            System.out.println("It is a letter.");
            if (Character.isLowerCase(charVar)) {
                char upperVar = Character.toUpperCase(charVar);
                System.out.println("Character is lowercase.\nUppercase: " + upperVar);
                System.out.println("Code Point: " + (int) upperVar);
            } else if (Character.isUpperCase(charVar)) {
                char lowerVar = Character.toLowerCase(charVar);
                System.out.println("Character is uppercase.\nLowercase: " + lowerVar);
                System.out.println("Code Point: " + (int) lowerVar);
            }
        }
        sc.close();
    }
}
