import java.util.*;

public class LinkedListDemo {

    static void displayList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(111);
        myLinkedList.add(23);
        myLinkedList.add(3);
        myLinkedList.add(245);
        myLinkedList.add(111);
        myLinkedList.add(9);

        System.out.println("Linked List--");
        displayList(myLinkedList);

        System.out.println("\nElement added to last--");
        myLinkedList.addLast(101);
        displayList(myLinkedList);

        System.out.println("\nList iterating from index 3--");
        myLinkedList.listIterator(3);
        displayList(myLinkedList);

        System.out.println("\nReverse List--");
        Collections.sort(myLinkedList, Collections.reverseOrder());
        displayList(myLinkedList);

        System.out.println("\nAdd 15 at index 2--");
        myLinkedList.add(2, 15);
        displayList(myLinkedList);

        System.out.println("\nAdd element at first--");
        myLinkedList.addFirst(24);
        displayList(myLinkedList);

        System.out.println("\nAdd element at last--");
        myLinkedList.addLast(12);
        displayList(myLinkedList);

        System.out.println("\nAdd specified element at first--");
        myLinkedList.addFirst(84);
        displayList(myLinkedList);

        System.out.println("\nAdd 303 at index 6--");
        myLinkedList.add(6, 303);
        displayList(myLinkedList);

        System.out.println("\nFirst and Last occurrence of 111--");
        System.out.println("\nFirst occurrence of 111: " + myLinkedList.indexOf(111));
        System.out.println("\nFirst occurrence of 111: " + myLinkedList.lastIndexOf(111));

        System.out.println("\nRemove first element--");
        myLinkedList.removeFirst();
        displayList(myLinkedList);

        System.out.println("\nRemove last element--");
        myLinkedList.removeLast();
        displayList(myLinkedList);

        System.out.println("\nSwap elements at index 5 and 8--");
        Collections.swap(myLinkedList, 5, 8);
        displayList(myLinkedList);

        LinkedList<Integer> myLinkedList2 = new LinkedList<>();

        System.out.println("\nLinked List 2--");
        myLinkedList2.add(1110);
        myLinkedList2.add(2045);
        myLinkedList2.add(11001);
        myLinkedList2.add(19);
        displayList(myLinkedList2);

        System.out.println("\nJoin two linked list--");
        myLinkedList.addAll(myLinkedList2);
        displayList(myLinkedList);

        System.out.println("\nCheck list contains 245--");
        boolean b = myLinkedList.contains(245);
        System.out.println(b);

        System.out.println("\nConvert to Array--");
        Object[] obj = myLinkedList.toArray();
        for (Object o : obj) {
            System.out.println(o);
        }

        System.out.println("\nCompare two linked lists--");
        boolean b1 = myLinkedList.equals(myLinkedList2);
        System.out.println(b1);

        System.out.println("\nCheck whether empty--");
        System.out.println(myLinkedList.isEmpty());

        System.out.println("\nReplace an element--");
        myLinkedList.set(8, 1510);
        displayList(myLinkedList);
    }
}
