class Employee {
    String name;
    int year;
    String address;

    Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public void display() {
        System.out.printf("%-12s %-20d %-20s\n", name, year, address);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C-WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68C-WallsStreat");
        Employee e3 = new Employee("John", 1999, "26C-WallsStreat");

        System.out.printf("%-12s %-20s %-20s\n", "Name", "Year of Joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
