import java.util.*;

public class TreeSetDemo {

    static void displayTreeSet(Collection<?> col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Custart Apple");
        fruits.add("Papaya");
        fruits.add("Guava");
        fruits.add("Sapota");
        fruits.add("Dates");

        System.out.println("Fruits Tree Set--");
        displayTreeSet(fruits);

        TreeSet<String> fruits2 = new TreeSet<>();
        fruits2.add("Orange");
        fruits2.add("Sweet Lime");
        fruits2.add("Dragon Fruit");
        fruits2.add("Banana");
        fruits2.add("Watermelon");
        fruits2.add("Grapes");

        System.out.println("\nFruits2 Tree Set--");
        displayTreeSet(fruits2);

        System.out.println("\nAdd elements of fruits2 to fruits--");
        fruits.addAll(fruits2);
        displayTreeSet(fruits);

        System.out.println("\nReverse Order View--");
        fruits.descendingSet();
        displayTreeSet(fruits);

        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(10);
        numberSet.add(4);
        numberSet.add(8);
        numberSet.add(2);
        numberSet.add(12);
        numberSet.add(6);

        System.out.println("\nNumber Tree Set--");
        displayTreeSet(numberSet);

        System.out.println("\nNumbers less than 7--");
        System.out.println(numberSet.headSet(7));
    }
}
