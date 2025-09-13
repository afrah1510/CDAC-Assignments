class Order {
    int orderId;
    String customerName;
    double totalAmount;

    Order(int orderId) {
        this.orderId = orderId;
        System.out.println("Order ID: " + orderId);
    }

    Order(int orderId, String customerName) {
        this(orderId);
        this.customerName = customerName;
        System.out.println("Customer Name: " + customerName);
    }

    Order(int orderId, String customerName, double totalAmount) {
        this(orderId, customerName);
        this.totalAmount = totalAmount;
        System.out.println("Total Amount: " + totalAmount);
    }
}

public class ConstructorChaining4 {
    public static void main(String[] args) {
        Order o1 = new Order(25364794);
        System.out.println();
        Order o2 = new Order(11456883, "Dante");
        System.out.println();
        Order o3 = new Order(65993314, "Aileen", 352500);
        System.out.println();
    }
}
