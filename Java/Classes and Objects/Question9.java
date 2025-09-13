import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void printComplex() {
        System.out.println(real + "+" + imag + "i");
    }

    public static Complex sum(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }
}

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Complex Number:");
        System.out.print("Enter real term: ");
        int x = sc.nextInt();
        System.out.print("Enter imaginary term: ");
        int y = sc.nextInt();

        Complex c1 = new Complex(x, y);

        System.out.println("\nSecond Complex Number");
        System.out.print("Enter real term: ");
        int u = sc.nextInt();
        System.out.print("Enter imaginary term: ");
        int v = sc.nextInt();

        Complex c2 = new Complex(u, v);

        Complex add = Complex.sum(c1, c2);
        Complex sub = Complex.diff(c1, c2);
        Complex mul = Complex.product(c1, c2);

        System.out.println("\nSum of complex numbers: ");
        add.printComplex();
        System.out.println("Difference of complex numbers: ");
        sub.printComplex();
        System.out.println("Product of complex numbers: ");
        mul.printComplex();

        sc.close();
    }
}
