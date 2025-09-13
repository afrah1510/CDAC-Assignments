class Calculator {
    public void multiply(int a, int b) {
        System.out.println("Product of " + a + " and " + b + ": " + (a * b));
    }

    public void multiply(double a, double b) {
        System.out.println("Product of " + a + " and " + b + ": " + (a * b));
    }

    public void multiply(double a, int b) {
        System.out.println("Product of " + a + " and " + b + ": " + (a * b));
    }
}

public class MethodOverloading3 {
    public static void main(String[] args) {
        Calculator m1 = new Calculator();
        m1.multiply(225, 15);
        Calculator m2 = new Calculator();
        m2.multiply(21.33, 89.25);
        Calculator m3 = new Calculator();
        m3.multiply(13.17, 2);
    }
}
