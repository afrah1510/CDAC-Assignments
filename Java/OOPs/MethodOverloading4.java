class Shape {
    public void draw(int a, int b, int c) {
        System.out.println("This is a triangle. Perimeter: " + (a + b + c));
    }

    public void draw(int a, int b) {
        System.out.println("This is a rectangle. Perimeter: " + (2 * a + 2 * b));
    }

    public void draw(int a) {
        System.out.println("This is a square. Perimeter: " + (4 * a));
    }
}

public class MethodOverloading4 {
    public static void main(String[] args) {
        Shape m1 = new Shape();
        m1.draw(25, 15);
        Shape m2 = new Shape();
        m2.draw(89);
        Shape m3 = new Shape();
        m3.draw(13, 5, 12);
    }
}
