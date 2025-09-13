import java.util.*;

class Employee {
    String name;
    int empID;
    String department;

    Employee(String name, int empID, String department) {
        this.name = name;
        this.empID = empID;
        this.department = department;
    }

    public String toString() {
        return "\nName: " + name + "\nEmployee ID: " + empID + "\nDepartment: " + department;
    }
}

public class EmpArrayList {
    static void displayList(Collection<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list1 = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n\nChoose your option");
            System.out.println("1. Add new employee");
            System.out.println("2. Update employee department by ID");
            System.out.println("3. Remove employee by ID");
            System.out.println("4. Display list of all employees");
            System.out.println("5. To quit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n\nEnter the total number of employee details you want to add: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < num; i++) {
                        System.out.print("\nEnter employee name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter employee ID: ");
                        int empID = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter department: ");
                        String department = sc.nextLine();

                        list1.add(new Employee(name, empID, department));
                    }
                    break;

                case 2:
                    System.out.println("\nEnter the ID of the employee whose department you wish to update: ");
                    int updateID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new department name: ");
                    String updateDepartment = sc.nextLine();
                    boolean findID = false;
                    for (Employee emp : list1) {
                        if (emp.empID == updateID) {
                            emp.department = updateDepartment;
                            findID = true;
                            break;
                        }
                    }
                    if (findID == true) {
                        System.out.println("\nDepartment updated successfully");
                    } else {
                        System.out.println("\nEmployee with ID " + updateID + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter the ID of employee you wish to remove: ");
                    int removeID = sc.nextInt();
                    sc.nextLine();
                    Employee toRemove = null;
                    for (Employee emp : list1) {
                        if (emp.empID == removeID) {
                            toRemove = emp;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        list1.remove(toRemove);
                        System.out.println("Employee removed successfully!");
                    } else {
                        System.out.println("\nEmployee with ID " + removeID + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("List of employees:");
                    displayList(list1);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}