class CurrencyConverter {
    public void convert(double a) {
        System.out.println("INR to USR: " + (a * 0.011));
    }

    public void convert(double a, String b) {
        if (b == "KRW") {
            System.out.println("INR to KRW: " + (a * 15.76));
        } else if (b == "THB") {
            System.out.println("INR to THB: " + (a * 0.36));
        } else if (b == "CNY") {
            System.out.println("INR to CNY: " + (a * 0.081));
        }
    }
}

public class MethodOverloading5 {
    public static void main(String[] args) {
        CurrencyConverter m1 = new CurrencyConverter();
        m1.convert(250);
        CurrencyConverter m2 = new CurrencyConverter();
        m2.convert(12000, "THB");
        CurrencyConverter m3 = new CurrencyConverter();
        m3.convert(2500, "KRW");
        CurrencyConverter m4 = new CurrencyConverter();
        m4.convert(999, "CNY");
    }
}
