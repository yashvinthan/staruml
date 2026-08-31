import java.util.HashMap;
import java.util.Map;

public class LibraryDb {
    private String bookId;
    private String bookName;
    private int quantity;
    private static Map<String, LibraryDb> bookStock = new HashMap<>();

    public LibraryDb() {
    }

    public LibraryDb(String bookId, String bookName, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
        bookStock.put(bookId, this);
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void Operation1() {
        System.out.println("[LibraryDb] Database synchronization and inventory scan completed.");
    }

    public static LibraryDb findBook(String bookId) {
        return bookStock.get(bookId);
    }

    public static void displayInventory() {
        System.out.println("----- LIBRARY INVENTORY -----");
        for (LibraryDb b : bookStock.values()) {
            System.out.println("Book ID: " + b.getBookId() + " | Title: " + b.getBookName() + " | Available Qty: " + b.getQuantity());
        }
    }
}
