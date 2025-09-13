// Encapsulation
class Book {
    private int bookID;
    private String author;
    private String title;
    private double price;

    Book(int bookID, String author, String title, double price) {
        this.bookID = bookID;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void purchaseBill() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

// Inheritance
class SpecialEditionBook extends Book {
    double discountPercentage;

    SpecialEditionBook(int bookID, String author, String title, double price, double discountPercentage) {
        super(bookID, author, title, price);
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountedPrice() {
        double discountPrice = getPrice() - (discountPercentage * getPrice() / 100);
        return discountPrice;
    }

    @Override
    public void purchaseBill() {
        System.out.println("Book ID: " + getBookID());
        System.out.println("Author: " + getAuthor());
        System.out.println("Title: " + getTitle());
        System.out.println("Price: " + getPrice());
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Price (after discount): " + getDiscountedPrice());
    }
}

// Abstraction
abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {

    void processPayment(double amount) {
        System.out.println("\nProcessing Credit Card Payment of Rs. " + amount + ".......");
        System.out.println("Enter PIN: ****");
        System.out.println("..........");
        System.out.println("Payment Received. Thank you for your order!");
        System.out.println("\n------------------------------------\n");
    }
}

class UPIPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("\nProcessing UPI Payment of Rs. " + amount + ".......");
        System.out.println("Enter UPI PIN: ******");
        System.out.println("..........");
        System.out.println("Payment Received. Thank you for your order!");
        System.out.println("\n------------------------------------\n");
    }
}

// Polymorphism
// Main class
public class BookStoreApp {
    public static void main(String[] args) {
        Book bk = new Book(30128, "Judi Picoult", "My Sister's Keeper", 350);
        bk.purchaseBill();

        Payment pay1 = new CreditCardPayment();
        pay1.processPayment(bk.getPrice());

        SpecialEditionBook specialbk = new SpecialEditionBook(41189, "Fyodor Dostoevsky", "White Nights", 1750.250, 8);
        specialbk.purchaseBill();

        Payment pay2 = new UPIPayment();
        pay2.processPayment(specialbk.getDiscountedPrice());
    }
}
