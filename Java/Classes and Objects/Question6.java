class Rectangle {
    int length;
    int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return (2 * length + 2 * breadth);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setDim(12, 30);
        System.out.println("Area of rectangle (12, 30): " + r1.getArea());

        Rectangle r2 = new Rectangle();
        r2.setDim(17, 10);
        System.out.println("Area of rectangle (17, 10): " + r2.getArea());
    }
}
