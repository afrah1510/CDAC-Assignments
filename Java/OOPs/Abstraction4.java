abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    public void calculateSalary() {
        System.out.println("Full time employee salary: Rs. 45000");
    }
}

class PartTimeEmployee extends Employee {
    public void calculateSalary() {
        System.out.println("Part time employee salary: Rs. 15000");
    }
}

public class Abstraction4 {
    public static void main(String[] args) {
        Employee ft = new FullTimeEmployee();
        ft.calculateSalary();

        Employee pt = new PartTimeEmployee();
        pt.calculateSalary();
    }
}
