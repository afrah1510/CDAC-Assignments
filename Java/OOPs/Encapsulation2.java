class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setName("Aliza");
        stud1.setMarks(95);
        System.out.println("Student 1\nName: " + stud1.getName() + "\nMarks: " + stud1.getMarks());

        Student stud2 = new Student();
        stud2.setName("Dante");
        stud2.setMarks(87);
        System.out.println("Student 2\nName: " + stud2.getName() + "\nMarks: " + stud2.getMarks());
    }
}
