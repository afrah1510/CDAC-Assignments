class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No.: " + rollNo + "\nMarks: " + marks);
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        Person p = new Person("Aliza", 22);
        p.displayInfo();

        Student s = new Student("Dante", 23, 120402, 99);
        s.displayInfo();
    }
}
