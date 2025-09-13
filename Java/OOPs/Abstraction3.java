abstract class Payment {
    abstract void payAmount();
}

class CreditCardPayment extends Payment {
    void payAmount() {
        System.out.println("Credit Card Payment Method");
    }
}

class UPIPayment extends Payment {
    void payAmount() {
        System.out.println("UPI Payment Method");
    }
}

public class Abstraction3 {
    public static void main(String[] args) {
        Payment cc = new CreditCardPayment();
        cc.payAmount();

        Payment upi = new UPIPayment();
        upi.payAmount();
    }
}
