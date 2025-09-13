import java.util.*;

public class Problem1 {

    static void displayList(Collection<?> col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(99);
        list1.add(520);
        list1.add(6);

        System.out.println("\nArray List--");
        displayList(list1);

        System.out.println("\nSorted Array List--");
        Collections.sort(list1);
        displayList(list1);

        System.out.println("\nReverse Array List--");
        Collections.sort(list1, Collections.reverseOrder());
        displayList(list1);

        System.out.println("\nArray List Size--");
        System.out.println(list1.size());
    }
}