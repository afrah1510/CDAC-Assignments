class MathOperations {
    public void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + ": " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of " + a + ", " + b + " and " + c + ": " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Sum of " + a + " and " + b + ": " + (a + b));
    }
}

public class MethodOverloading1 {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        m1.add(15, 10);
        MathOperations m2 = new MathOperations();
        m2.add(2002, 1996, 1997);
        MathOperations m3 = new MathOperations();
        m3.add(21.27, 9.25);
    }
}
