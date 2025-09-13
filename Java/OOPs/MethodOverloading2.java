class Printer {
    public void print(String name) {
        System.out.println("Printing Name: " + name);
    }

    public void print(int age) {
        System.out.println("Printing Age: " + age);
    }

    public void print(double height) {
        System.out.println("Printing height: " + height);
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print("Aliza");
        Printer p2 = new Printer();
        p2.print(22);
        Printer p3 = new Printer();
        p3.print(5.425);
    }
}
