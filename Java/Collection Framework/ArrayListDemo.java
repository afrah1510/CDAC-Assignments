import java.util.*;

public class ArrayListDemo {

    static void displayList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        movies.add("Gumnaam");
        movies.add("My Rainy Days");
        movies.add("Chalti Ka Naam Gaadi");
        movies.add("Madhumati");
        movies.add("A Moment to Remember");
        movies.add("Nezha");
        movies.add("Nezha 2");

        // print the collection
        System.out.println("Printing list--");
        for (String s : movies) {
            System.out.println(s);
        }

        System.out.println("\nAfter insert at first position--");
        movies.add(0, "Mr. and Mrs. '55");
        displayList(movies);

        System.out.println("\nElement at index 5--");
        System.out.println(movies.get(5));

        System.out.println("\nUpdate element at index 7--");
        movies.set(7, "Nezha: The Demon Child Conquers the Dragon King");
        displayList(movies);

        System.out.println("\nRemove element at index 3--");
        movies.remove(3);
        displayList(movies);

        System.out.println("\nCheck if 'Gumnaam'' in list or not--");
        boolean b = movies.contains("Gumnaam");
        System.out.println(b);

        System.out.println("\nSort list--");
        Collections.sort(movies);
        displayList(movies);

        System.out.println("\nReverse list--");
        Collections.sort(movies, Collections.reverseOrder());
        displayList(movies);

        System.out.println("\nEmpty the list--");
        movies.clear();
        displayList(movies);
    }
}