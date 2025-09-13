class Student {
    String name;
    int roll_no;
    long phone_no;
    String address;

    Student(String name, int roll_no, long phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public void display() {
        System.out.println(
                "Name: " + name + "\nRoll No.: " + roll_no + "\nPhone Number: " + phone_no + "\nAddress: " + address);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Student s1 = new Student("Sam", 131, 9988765422l, "Mumbai");
        s1.display();

        Student s2 = new Student("John", 152, 2269876542l, "Kolkata");
        s2.display();
    }
}