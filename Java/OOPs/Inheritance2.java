class Vehicle {
    String brand;
    double speed;

    Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayCarDetails() {
        System.out.println("Brand: " + brand + "\nSpeed (km/h): " + speed);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, double speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public void displayCarDetails() {
        System.out.println("Brand: " + brand + "\nSpeed (km/h): " + speed + "\nFuel type: " + fuelType);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", 100);
        v.displayCarDetails();

        Car c = new Car("Hyundai", 150, "Petrol");
        c.displayCarDetails();
    }
}
