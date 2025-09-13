abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car starting.....");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike starting.....");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();

        Vehicle b = new Bike();
        b.start();
    }
}
