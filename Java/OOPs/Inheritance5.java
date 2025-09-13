class Shape {
    public double calculateArea(double area) {
        return area;
    }
}

class Circle extends Shape {
    public double calculateArea(double radius) {
        return (2 * 3.142 * radius * radius);
    }
}

class Rectangle extends Shape {
    public double calculateArea(double length, double breadth) {
        return (2 * length + 2 * breadth);
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of Circle: " + c.calculateArea(12.25));

        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle: " + r.calculateArea(62.39, 28.74));
    }
}
