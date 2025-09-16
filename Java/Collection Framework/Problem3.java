import java.util.*;

public class Problem3 {

    static void displayStack(Collection<?> col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.add(101);
        s.add(15);
        s.add(520);
        s.add(12);
        s.add(4);
        s.add(17);
        s.add(13);

        System.out.println("Stack--");
        displayStack(s);

        System.out.println("\nRemove middle element");
        int size = s.size();
        s.remove(size / 2);
        displayStack(s);
    }
}