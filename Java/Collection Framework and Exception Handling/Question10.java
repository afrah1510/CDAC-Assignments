import java.util.Scanner;

class NegativeGradeException extends Exception {
    NegativeGradeException(String msg) {
        super(msg);
    }
}

class GradeOutOfRangeException extends Exception {
    GradeOutOfRangeException(String msg) {
        super(msg);
    }
}

class Student {
    int studentId;
    String name;
    double grade;

    Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void updateGrade(double grade) throws NegativeGradeException, GradeOutOfRangeException {
        if (grade < 0) {
            throw new NegativeGradeException("Negative grade not accepted");
        } else if (grade > 10) {
            throw new GradeOutOfRangeException("Grades must be between 0 - 10");
        }
        this.grade = grade;

    }

    public void display() {
        System.out.println("ID: " + studentId + "\nName: " + name + "\nGrade: " + grade);
    }
}

public class Question10 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Student s = new Student(1510, "Aliza", 8.5);
            s.display();
            System.out.println("\nEnter your updated grades: ");
            double updateGrade = sc.nextDouble();
            s.updateGrade(updateGrade);
            System.out.println("\nDetails after update: ");
            s.display();

        } catch (NegativeGradeException ne) {
            System.out.println(ne);
        } catch (GradeOutOfRangeException ge) {
            System.out.println(ge);
        }
    }
}
