class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        if (name == null || name.isEmpty()) {
            System.out.println("\nName cannot be null");
        } else {
            this.name = name;
        }
        if (age < 6 || age > 120) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\n");
    }
}

class Student extends Person {
    double grade;

    Student(String name, int age, double grade) {
        super(name, age);
        if (grade < 0 || grade > 10) {
            this.grade = 0;
        } else {
            this.grade = grade;
        }
    }

    Student(String name, int age) {
        super(name, age);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void display() {
        System.out.println("\nName: " + getName() + "\nAge: " + getAge() + "\nGrade: " + getGrade() + "\n");
    }
}

public class Question9 {
    public static void main(String[] args) {
        Person p = new Person("Aliza", 22);
        p.display();

        Student s1 = new Student(null, 0);
        s1.display();

        Student s2 = new Student("Dante", 24, 9.5);
        s2.display();
    }
}
