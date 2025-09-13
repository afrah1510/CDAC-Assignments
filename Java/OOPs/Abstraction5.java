abstract class Appliance {
    abstract void turnOn();

    abstract void turnOff();
}

class Fan extends Appliance {
    public void turnOn() {
        System.out.println("\nThe fan is switched on");
    }

    public void turnOff() {
        System.out.println("The fan is switched off");
    }
}

class Light extends Appliance {
    public void turnOn() {
        System.out.println("\nThe light is switched on");
    }

    public void turnOff() {
        System.out.println("The light is switched off");
    }
}

public class Abstraction5 {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOff();

        Appliance light = new Light();
        light.turnOn();
        light.turnOff();
    }
}
