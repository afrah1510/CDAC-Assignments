import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee e) {
        int m = this.id - e.id;
        if (m > 0) {
            return 1;
        } else if (m < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class HashSetDemo {

    static void displayHashSet(Collection<?> col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        HashSet<Employee> hs = new HashSet<>();

        hs.add(new Employee(101, "Alice"));
        hs.add(new Employee(122, "Bob"));
        hs.add(new Employee(113, "Charles"));
        hs.add(new Employee(425, "David"));
        hs.add(new Employee(005, "Evan"));

        System.out.println("Hash Set--");
        displayHashSet(hs);

        System.out.println("\nNumber of elements--");
        System.out.println(hs.size());

        System.out.println("\nTo Array--");
        hs.toArray();
        displayHashSet(hs);

        System.out.println("\nTo TreeSet--");
        TreeSet<Employee> hashTree = new TreeSet<>(hs);
        displayHashSet(hashTree);

        System.out.println("\nTo List/ArrayList--");
        ArrayList<Employee> hashArr = new ArrayList<>();
        hashArr.addAll(hs);
        displayHashSet(hashArr);

        System.out.println("\nRemove all elements--");
        hs.removeAll(hs);
    }
}
