class Vehicle {
    public void run() {
        System.out.println("Vehicle is now running");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is now running");
    }
}

class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car is now running");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();

        Bike b = new Bike();
        b.run();

        Car c = new Car();
        c.run();
    }
}
