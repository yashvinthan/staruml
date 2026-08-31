public class Student {
    private String name;
    private String id;
    private String bookId;
    private String phone;
    private String address;

    public Student() {
    }

    public Student(String name, String id, String bookId, String phone, String address) {
        this.name = name;
        this.id = id;
        this.bookId = bookId;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void borrow(String requestedBookId) {
        LibraryDb book = LibraryDb.findBook(requestedBookId);
        if (book != null && book.getQuantity() > 0) {
            this.bookId = requestedBookId;
            book.setQuantity(book.getQuantity() - 1);
            System.out.println("Student '" + name + "' successfully borrowed: " + book.getBookName() + " (ID: " + requestedBookId + ")");
        } else {
            System.out.println("Student '" + name + "': Book ID " + requestedBookId + " is currently unavailable.");
        }
    }

    public void returnBook() {
        if (this.bookId != null && !this.bookId.isEmpty()) {
            LibraryDb book = LibraryDb.findBook(this.bookId);
            if (book != null) {
                book.setQuantity(book.getQuantity() + 1);
                System.out.println("Student '" + name + "' returned book: " + book.getBookName());
                this.bookId = null;
            }
        } else {
            System.out.println("Student '" + name + "' has no book to return.");
        }
    }
}
