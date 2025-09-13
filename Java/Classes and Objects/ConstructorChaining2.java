class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
        System.out.println("Course: " + course);
    }
}

public class ConstructorChaining2 {
    public static void main(String[] args) {
        Student s = new Student("Dante", 25, "MBA");
    }
}
