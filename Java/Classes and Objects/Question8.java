import java.util.Scanner;

class Average {
    int a;
    int b;
    int c;

    Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printAverage() {
        double avg = (a + b + c) / 3;
        System.out.println("Average: " + avg);
    }
}

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int n3 = sc.nextInt();

        Average a = new Average(n1, n2, n3);
        a.printAverage();

        sc.close();
    }
}
