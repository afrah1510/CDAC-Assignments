abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double a;

    Circle(double a) {
        this.a = a;
    }

    public double calculateArea() {
        return (3.142 * a * a);
    }
}

class Rectangle extends Shape {
    double l;
    double b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double calculateArea() {
        return (l * b);
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Shape c = new Circle(22);
        System.out.println("Area of circle: " + c.calculateArea());

        Shape r = new Rectangle(22.3, 25.98);
        System.out.println("Area of rectangle: " + r.calculateArea());
    }
}