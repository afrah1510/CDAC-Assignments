class Patient {
    private final int id;
    private String name;
    private String disease;

    public Patient(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}

public class Encapsulation5 {
    public static void main(String[] args) {
        Patient p1 = new Patient(1024);
        p1.setName("Theo");
        p1.setDisease("Fracture");
        System.out.println("ID: " + p1.getID() + "\nName: " + p1.getName() + "\nDisease: " + p1.getDisease());

        Patient p2 = new Patient(1935);
        p2.setName("Sally");
        p2.setDisease("Malaria");
        System.out.println("ID: " + p2.getID() + "\nName: " + p2.getName() + "\nDisease: " + p2.getDisease());
    }
}
