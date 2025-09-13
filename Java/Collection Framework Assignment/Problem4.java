import java.util.*;

public class Problem4 implements Comparable<Integer> {

    static void displaySet(Collection<?> col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    public int compareTo(Integer i) {
        if (i > 0) {
            return 1;
        } else if (i < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();

        s.add(101);
        s.add(15);
        s.add(520);
        s.add(12);
        s.add(4);
        s.add(17);
        s.add(13);

        System.out.println("Set--");
        displaySet(s);

        System.out.println("\nSet in increasing order--");
        displaySet(s);

        System.out.println("\nRemove 4 from set--");
        s.remove(4);
        displaySet(s);

        System.out.println("\nCheck if 17 in set--");
        int res = s.contains(17) ? 1 : -1;
        System.out.println(res);

        System.out.println("\nSize of set--");
        System.out.println(s.size());
    }
}
