class Car {
    String brand;
    String model;
    int price;

    Car(String brand) {
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    Car(String brand, String model) {
        this(brand);
        this.model = model;
        System.out.println("Model: " + model);
    }

    Car(String brand, String model, int price) {
        this(brand, model);
        this.price = price;
        System.out.println("Price: " + price);
    }

}

public class ConstructorChaining1 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota");
        System.out.println();
        Car c2 = new Car("Mahindra", "Thar");
        System.out.println();
        Car c3 = new Car("Hyundai", "Creta", 1111000);
    }
}
