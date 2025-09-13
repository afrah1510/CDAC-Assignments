class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
        System.out.println("Type: " + type);
    }
}

class FourWheeler extends Vehicle {
    String brand;

    FourWheeler(String type, String brand) {
        super(type);
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }
}

class Car extends FourWheeler {
    String model;
    int price;

    Car(String type, String brand, String model, int price) {
        super(type, brand);
        this.model = model;
        this.price = price;
        System.out.println("Model: " + model + "\nPrice: " + price);
    }
}

public class ConstructorChaining3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Bus");
        System.out.println();
        FourWheeler f = new FourWheeler("Four Wheeler", "Maruti Suzuki");
        System.out.println();
        Car c = new Car("Car", "Hyundai", "Creta", 1111000);
    }
}
