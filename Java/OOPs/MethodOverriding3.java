class Bank {
    public void getInterestRate() {
        System.out.println("Banks have interest rate");
    }
}

class SBI extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("SBI interest rate: 2.89%");
    }
}

class HDFC extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("HDFC interest rate: 3%");
    }
}

class ICICI extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("ICICI interest rate: 3.5%");
    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        Bank a = new Bank();
        a.getInterestRate();

        SBI s = new SBI();
        s.getInterestRate();

        HDFC h = new HDFC();
        h.getInterestRate();

        ICICI i = new ICICI();
        i.getInterestRate();
    }
}
