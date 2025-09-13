class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void display() {
        System.out.println("Name: " + name + "\nRoll No.: " + roll_no);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Student s = new Student("John", 2);
        s.display();
    }
}