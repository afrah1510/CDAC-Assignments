class Employee {
    int salary;
    int noOfHours;

    public void getInfo(int salary, int noOfHours) {
        this.salary = salary;
        this.noOfHours = noOfHours;
    }

    public int addSal() {
        if (salary < 500) {
            salary += 10;
        }
        return salary;
    }

    public int addWork() {
        if (noOfHours > 6) {
            salary += 5;
        }
        return salary;
    }

    public String toString() {
        return "Salary: " + salary + ", Number of hours of work per day: " + noOfHours;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getInfo(450, 8);
        System.out.println("Before: " + e1.toString());
        e1.addSal();
        e1.addWork();
        System.out.println("After: " + e1.toString());

        System.out.println();

        Employee e2 = new Employee();
        e2.getInfo(300, 5);
        System.out.println("Before: " + e2.toString());
        e2.addSal();
        e2.addWork();
        System.out.println("After: " + e2.toString());

        System.out.println();

        Employee e3 = new Employee();
        e3.getInfo(600, 10);
        System.out.println("Before: " + e3.toString());
        e3.addSal();
        e3.addWork();
        System.out.println("After: " + e3.toString());
    }
}