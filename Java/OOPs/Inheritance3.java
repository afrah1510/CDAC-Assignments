class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nSalary: Rs. " + salary + "\n");
    }
}

class Manager extends Employee {
    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int totalSalary() {
        return salary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + "\nSalary: Rs. " + salary + "\nBonus: Rs. " + bonus + "\nTotal Salary: "
                + totalSalary());
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Employee e = new Employee("Aliza", 45000);
        e.displayInfo();

        Manager m = new Manager("Dante", 65000, 15000);
        m.displayInfo();
    }
}
