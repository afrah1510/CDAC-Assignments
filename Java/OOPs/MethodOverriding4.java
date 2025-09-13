class Phone {
    public void call() {
        System.out.println("Phone is used for calling");
    }
}

class Smartphone extends Phone {
    @Override
    public void call() {
        System.out.println("Smartphone has touchscreen");
    }
}

class Landline extends Phone {
    @Override
    public void call() {
        System.out.println("Landline has keypad");
    }
}

public class MethodOverriding4 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();

        Smartphone s = new Smartphone();
        s.call();

        Landline l = new Landline();
        l.call();
    }
}
