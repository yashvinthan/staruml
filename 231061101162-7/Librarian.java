public class Librarian {
    private String name;
    private String address;
    private String phone;
    private String lastDate;

    public Librarian() {
    }

    public Librarian(String name, String address, String phone, String lastDate) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.lastDate = lastDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public void search(String query) {
        System.out.println("Librarian '" + name + "' searching catalog for: " + query);
        LibraryDb book = LibraryDb.findBook(query);
        if (book != null) {
            System.out.println("Found: " + book.getBookName() + " (Qty: " + book.getQuantity() + ")");
        } else {
            System.out.println("No matching book found.");
        }
    }

    public void update(String bookId, int newQuantity) {
        LibraryDb book = LibraryDb.findBook(bookId);
        if (book != null) {
            book.setQuantity(newQuantity);
            System.out.println("Librarian '" + name + "' updated stock of " + book.getBookName() + " to: " + newQuantity);
        }
    }

    public void burrow(Student student, String bookId) {
        System.out.println("Librarian '" + name + "' processing borrow request for student: " + student.getName());
        student.borrow(bookId);
    }

    public void renewal(Student student, String bookId) {
        System.out.println("Librarian '" + name + "' renewed book ID " + bookId + " for student: " + student.getName() + ". New Due Date: " + lastDate);
    }

    public void fine(Student student, int overdueDays) {
        double fineAmount = overdueDays * 2.50;
        System.out.println("Librarian '" + name + "' calculated fine for " + student.getName() + " (" + overdueDays + " overdue days): $" + fineAmount);
    }

    public void verify(Student student) {
        System.out.println("Librarian '" + name + "' verified Student ID: " + student.getId() + " [Active Status]");
    }
}
