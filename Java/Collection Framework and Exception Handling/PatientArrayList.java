import java.util.*;

class Patient {
    int patientID;
    String name;
    String diagnosis;
    int noOfDaysAdmitted;

    Patient(int patientID, String name, String diagnosis, int noOfDaysAdmitted) {
        this.patientID = patientID;
        this.name = name;
        this.diagnosis = diagnosis;
        this.noOfDaysAdmitted = noOfDaysAdmitted;
    }

    public String toString() {
        return "\nPatient ID: " + patientID + "\nName: " + name + "\nDiagnosis: " + diagnosis
                + "\nNumber of days admitted: "
                + noOfDaysAdmitted;
    }
}

public class PatientArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> list1 = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n\nChoose your option");
            System.out.println("1. Add patient");
            System.out.println("2. Remove patient");
            System.out.println("3. Find all patient with specific diagnosis");
            System.out.println("4. Find all patient admitted for more than given number of days");
            System.out.println("5. To quit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n\nEnter the total number of patient details you want to add: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < num; i++) {
                        System.out.print("\nEnter patient ID: ");
                        int patientID = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter patient name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter diagnosis: ");
                        String diagnosis = sc.nextLine();

                        System.out.print("Enter number of days admitted: ");
                        int daysAdmitted = sc.nextInt();
                        sc.nextLine();

                        list1.add(new Patient(patientID, name, diagnosis, daysAdmitted));
                    }
                    break;

                case 2:
                    System.out.println("\nEnter the ID of patient you wish to remove: ");
                    int removeID = sc.nextInt();
                    sc.nextLine();
                    Patient toRemove = null;
                    for (Patient pat : list1) {
                        if (pat.patientID == removeID) {
                            toRemove = pat;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        list1.remove(toRemove);
                        System.out.println("Patient removed successfully!");
                    } else {
                        System.out.println("\nPatient with ID " + removeID + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter the diagnosis to find all patients: ");
                    String findDiagnosis = sc.nextLine();
                    boolean findPatient = false;
                    for (Patient pat : list1) {
                        if (pat.diagnosis.equalsIgnoreCase(findDiagnosis)) {
                            System.out.println(pat);
                            findPatient = true;
                        }
                    }
                    if (findPatient == false) {
                        System.out.println("\nPatient with " + findDiagnosis + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nEnter number of days to filter patients: ");
                    int days = sc.nextInt();
                    sc.nextLine();
                    boolean patientAdmitted = false;
                    System.out.println("\nPatient admitted for more than " + days + " days");
                    for (Patient pat : list1) {
                        if (pat.noOfDaysAdmitted > days) {
                            System.out.println(pat);
                            patientAdmitted = true;
                        }
                    }
                    if (patientAdmitted == false) {
                        System.out.println("\nNo patient admitted more than " + days + " days");
                    }
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