class Laptop {
    private String brand;
    private long price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        if (price > 0) {
            return price;
        } else {
            return 0;
        }
    }

    public void setPrice(long price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Enter valid price");
        }
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setBrand("Hewlett Packard");
        l1.setPrice(68000l);
        System.out.println("Brand: " + l1.getBrand() + "\nPrice: " + l1.getPrice());

        Laptop l2 = new Laptop();
        l2.setBrand("Lenovo");
        l2.setPrice(98000l);
        System.out.println("Brand: " + l2.getBrand() + "\nPrice: " + l2.getPrice());
    }
}
