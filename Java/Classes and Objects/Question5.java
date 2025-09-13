class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return (2 * length + 2 * breadth);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        System.out.println("Area of rectangle (4, 5): " + r1.getArea());

        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Area of rectangle (5, 8): " + r2.getArea());
    }
}
