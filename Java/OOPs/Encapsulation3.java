class Car {
    private String model;
    private int year;
    private long price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        if (year > 0) {
            return year;
        } else {
            return 0;
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Enter valid year");
        }
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel("Tata Punch");
        c1.setYear(2025);
        c1.setPrice(90000l);
        System.out.println("Model: " + c1.getModel() + "\nYear: " + c1.getYear() + "\nPrice: Rs. " + c1.getPrice());
        Car c2 = new Car();
        c2.setModel("Maruti Suzuki Breeza");
        c2.setYear(-2025);
        c2.setPrice(1400000l);
        System.out.println("Model: " + c2.getModel() + "\nYear: " + c2.getYear() + "\nPrice: Rs. " + c2.getPrice());
    }
}
