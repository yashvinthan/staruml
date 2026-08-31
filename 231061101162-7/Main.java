public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 7: LIBRARY MANAGEMENT SYSTEM        ");
        System.out.println("==================================================");

        new LibraryDb("BK-101", "Design Patterns: Elements of Reusable Object-Oriented Software", 5);
        new LibraryDb("BK-102", "Clean Code: A Handbook of Agile Software Craftsmanship", 3);
        new LibraryDb("BK-103", "Software Engineering - A Practitioner's Approach", 2);

        LibraryDb.displayInventory();

        Librarian librarian = new Librarian("Mrs. Davis", "Library Main Desk", "+1-555-4321", "2026-09-30");
        Student student = new Student("Alex Turner", "STU-2024-089", null, "+1-555-8899", "North Campus Dorm");

        librarian.verify(student);
        librarian.search("BK-101");
        librarian.burrow(student, "BK-101");

        LibraryDb.displayInventory();

        librarian.renewal(student, "BK-101");
        librarian.fine(student, 2);

        student.returnBook();
        LibraryDb.displayInventory();

        System.out.println("Experiment 7 completed successfully.");
    }
}
