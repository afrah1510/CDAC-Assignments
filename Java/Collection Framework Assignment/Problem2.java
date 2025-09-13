import java.util.*;

public class Problem2 {

    static void displayList(Collection<?> col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(101);
        list1.add(15);
        list1.add(12);
        list1.add(520);
        list1.add(4);
        list1.add(17);
        list1.add(13);

        System.out.println("Array List--");
        displayList(list1);

        System.out.println("\nInsert 10 at index 3--");
        list1.add(3, 10);
        displayList(list1);

        System.out.println("\n50 is last found at index--");
        System.out.println(list1.lastIndexOf(50));
    }
}
