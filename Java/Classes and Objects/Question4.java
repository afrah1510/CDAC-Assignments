class Triangle {
    int a;
    int b;
    int c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getPerimeter() {
        return (a + b + c);
    }

    public double getArea() {
        double semiperi = (a + b + c) / 2;
        return Math.sqrt(semiperi * (semiperi - a) * (semiperi - b) * (semiperi - c));
    }
}

public class Question4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of Triangle: " + t.getArea());
        System.out.println("Perimeter of Triangle: " + t.getPerimeter());
    }
}
