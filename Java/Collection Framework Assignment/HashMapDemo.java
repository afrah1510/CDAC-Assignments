import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(8, "S.Coups");
        myHashMap.put(4, "Jeonghan");
        myHashMap.put(30, "Joshua");
        myHashMap.put(10, "Jun");
        myHashMap.put(15, "Hoshi");

        System.out.println("Hash Map--");
        Set<Map.Entry<Integer, String>> e = myHashMap.entrySet();
        for (Map.Entry<Integer, String> entry : e) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("\nNumber of key-value map--");
        System.out.println(myHashMap.size());

        System.out.println("\nCopy myHashMap to myHashMapCopy--");
        HashMap<Integer, String> myHashMapCopy = new HashMap<>();
        myHashMapCopy.putAll(myHashMap);

        System.out.println("\nmyHashMapCopy--");
        for (Map.Entry<Integer, String> entry1 : myHashMapCopy.entrySet()) {
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }

        System.out.println("\nRemove all from myHashMapCopy--");
        myHashMapCopy.clear();
        for (Map.Entry<Integer, String> entry1 : myHashMapCopy.entrySet()) {
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }

        System.out.println("\nCheck if map contains specified key (here, 12)--");
        System.out.println(myHashMap.containsKey(12));

        System.out.println("\nCheck if map contains specified value (here, 'Jun')--");
        System.out.println(myHashMap.containsValue("Jun"));
    }
}
