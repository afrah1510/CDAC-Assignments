class Triangle {
    int a;
    int b;
    int c;

    Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public int getPerimeter() {
        return (a + b + c);
    }

    public double getArea() {
        double semiperi = (a + b + c) / 2;
        return Math.sqrt(semiperi * (semiperi - a) * (semiperi - b) * (semiperi - c));
    }
}

public class Question3 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area of Triangle: " + t.getArea());
        System.out.println("Perimeter of Triangle: " + t.getPerimeter());
    }
}
