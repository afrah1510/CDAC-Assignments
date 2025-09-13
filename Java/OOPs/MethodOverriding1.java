class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog speaks woof-woof");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat speaks meow-meow");
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();

        Dog d = new Dog();
        d.speak();

        Cat c = new Cat();
        c.speak();
    }
}
