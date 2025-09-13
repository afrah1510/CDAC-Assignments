import java.util.Scanner;

class Area {
    int length;
    int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return (2 * length + 2 * breadth);
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();

        Area r1 = new Area(l, b);
        System.out.println("Area of rectangle: " + r1.returnArea());

        sc.close();
    }
}
