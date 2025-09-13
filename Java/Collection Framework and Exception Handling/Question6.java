class Employee {
    private String name;
    private int employeeID;
    private String department;

    Employee(String name, int employeeID, String department) {
        if (name == null || name.isEmpty()) {
            System.out.println("\nName cannot be empty");
            this.name = "N/A";
        } else {
            this.name = name;
        }

        if (employeeID < 0) {
            System.out.println("\nEmployee ID cannot be empty");
            this.employeeID = 0;
        } else {
            this.employeeID = employeeID;
        }

        if (department == null || department.isEmpty()) {
            System.out.println("\nDepartment cannot be empty");
            this.department = "N/A";
        } else {
            this.department = department;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("\nName cannot be empty");
            this.name = "N/A";
        } else {
            this.name = name;
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID < 1) {
            System.out.println("\nEmployee ID cannot be empty");
            this.employeeID = 0;
        } else {
            this.employeeID = employeeID;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            System.out.println("\nDepartment cannot be empty");
            this.department = "N/A";
        } else {
            this.department = department;
        }
    }

    public void display() {
        System.out.println("\nName: " + name + "\nEmployee ID: " + employeeID + "\nDepartment: " + department);
    }
}

class Manager extends Employee {
    int numberOfTeams;

    Manager(String name, int employeeID, String department, int numberOfTeams) {
        super(name, employeeID, department);
        if (numberOfTeams < 1) {
            System.out.println("\nNumber of teams cannot be empty");
            this.numberOfTeams = 0;
        } else {
            this.numberOfTeams = numberOfTeams;
        }
    }

    Manager(String name, int employeeID) {
        super(name, employeeID, "N/A");
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        if (numberOfTeams < 1) {
            System.out.println("\nNumber of teams cannot be empty");
            this.numberOfTeams = 0;
        } else {
            this.numberOfTeams = numberOfTeams;
        }
    }

    public void display() {
        System.out.println(
                "\nName: " + getName() + "\nEmployee ID: " + getEmployeeID() + "\nDepartment: " + getDepartment()
                        + "\nNumber of Teams managed: " + getNumberOfTeams());
    }
}

public class Question6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aliza", 1510, "Research");
        e1.display();
        Employee e2 = new Employee("Aliza", 0, "");
        e2.display();

        Manager m1 = new Manager("Dante", 1204);
        m1.display();
        Manager m2 = new Manager("Sebastian", 3004, "Design and Development", 2);
        m2.display();
    }
}
