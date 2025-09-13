import java.util.Scanner;

class Complex {
    double realPart;
    double imaginaryPart;

    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.getRealPart() + b.getRealPart()), (a.getImaginaryPart() + b.getImaginaryPart()));
    }

    public static Complex subtract(Complex a, Complex b) {
        return new Complex((a.getRealPart() - b.getRealPart()), (a.getImaginaryPart() - b.getImaginaryPart()));
    }

    public static Complex multiply(Complex a, Complex b) {
        return new Complex(((a.getRealPart() * b.getRealPart()) - (a.getImaginaryPart() * b.getImaginaryPart())),
                ((a.getRealPart() * b.getImaginaryPart()) + (a.getImaginaryPart() * b.getRealPart())));
    }

    public static Complex divide(Complex a, Complex b) {
        return new Complex(
                ((a.getRealPart() * b.getRealPart()) + (a.getImaginaryPart() * b.getImaginaryPart()))
                        / ((b.getRealPart() * b.getRealPart()) + (b.getImaginaryPart() * b.getImaginaryPart())),
                ((a.getImaginaryPart() * b.getRealPart()) - (a.getRealPart() * b.getImaginaryPart()))
                        / ((b.getRealPart() * b.getRealPart()) + (b.getImaginaryPart() * b.getImaginaryPart())));
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Complex Number:");
        System.out.print("Enter real term: ");
        int x = sc.nextInt();
        System.out.print("Enter imaginary term: ");
        int y = sc.nextInt();

        Complex c1 = new Complex(x, y);
        System.out.println("First Complex: " + c1.toString());

        System.out.println("\nSecond Complex Number");
        System.out.print("Enter real term: ");
        int u = sc.nextInt();
        System.out.print("Enter imaginary term: ");
        int v = sc.nextInt();

        Complex c2 = new Complex(u, v);
        System.out.println("Second Complex: " + c2.toString());

        Complex add = Complex.add(c1, c2);
        Complex sub = Complex.subtract(c1, c2);
        Complex mul = Complex.multiply(c1, c2);
        Complex div = Complex.divide(c1, c2);

        System.out.println("\nSum of complex numbers: " + add.toString());
        System.out.println("\nDifference of complex numbers: " + sub.toString());
        System.out.println("\nProduct of complex numbers: " + mul.toString());
        System.out.println("\nDivision of complex numbers: " + div.toString());

        sc.close();
    }
}