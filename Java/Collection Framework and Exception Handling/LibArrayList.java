import java.util.*;

class Book {
    String title;
    String author;
    int ISBN;

    Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String toString() {
        return "\nTitle: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN;
    }
}

public class LibArrayList {

    static void displayList(Collection<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    static Book findBookByTitle(List<Book> list, String bookTitle) {
        for (Book book : list) {
            if (book.title.equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> list1 = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n\nChoose your option");
            System.out.println("1. Add new book");
            System.out.println("2. Remove a book by ISBN");
            System.out.println("3. Search for book by Title");
            System.out.println("4. Display list of all books");
            System.out.println("5. To quit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n\nEnter the total number of books you want to add: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < num; i++) {
                        System.out.print("\nEnter book title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter book author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter ISBN number: ");
                        int isbn = sc.nextInt();
                        sc.nextLine();

                        list1.add(new Book(title, author, isbn));
                    }
                    break;

                case 2:
                    System.out.println("\nEnter the ISBN of book you wish to remove: ");
                    int removeISBN = sc.nextInt();
                    sc.nextLine();
                    Book toRemove = null;
                    for (Book book : list1) {
                        if (book.ISBN == removeISBN) {
                            toRemove = book;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        list1.remove(toRemove);
                    } else {
                        System.out.println("\nBook with ISBN " + removeISBN + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter title of book you want to search for: ");
                    String searchBook = sc.nextLine();
                    Book findBook = findBookByTitle(list1, searchBook);
                    if (findBook != null) {
                        System.out.println(findBook);
                    } else {
                        System.out.println("\nBook not found");
                    }
                    break;

                case 4:
                    System.out.println("List of books:");
                    displayList(list1);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}