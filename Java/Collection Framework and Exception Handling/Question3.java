class Vehicle {
    private String make;
    private String model;
    private int year;

    Vehicle(String make, String model, int year) {
        if (make == null) {
            this.make = null;
        } else {
            this.make = make;
        }

        if (model == null) {
            this.model = null;
        } else {
            this.model = model;
        }

        if (year < 1990 || year > 2025) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) {
            this.make = null;
        } else {
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = null;
        } else {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1990 || year > 2025) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public String toString() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\n";
    }
}

class Car extends Vehicle {
    int noOfDoors;

    Car(String make, String model, int year, int noOfDoors) {
        super(make, model, year);
        if (noOfDoors < 2 || noOfDoors > 5) {
            this.noOfDoors = 0;
        } else {
            this.noOfDoors = noOfDoors;
        }
    }

    Car(String make, String model) {
        super(make, model, 0);
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        if (noOfDoors < 2 || noOfDoors > 5) {
            this.noOfDoors = 0;
        } else {
            this.noOfDoors = noOfDoors;
        }
    }

    public String toString() {
        return "Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nNumber of Doors: "
                + getNoOfDoors() + "\n";
    }
}

public class Question3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", "Yaris Cross", 2020);
        System.out.println(v.toString());

        Car c1 = new Car("Hyundai", "Creta");
        System.out.println(c1.toString());

        Car c2 = new Car("Toyota", "Crown", 1979, 4);
        System.out.println(c2.toString());

        Car c3 = new Car("Mahindra", "Thar", 2010, 8);
        System.out.println(c3.toString());
    }
}