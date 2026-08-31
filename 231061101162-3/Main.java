public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPERIMENT 3: STOCK & INVENTORY SYSTEM         ");
        System.out.println("==================================================");

        Database db = new Database();
        db.addition();
        db.addRecord("Initial System Startup Log");

        Manager manager = new Manager("Alice Vance", "MGR-01");
        manager.login();
        manager.adding("P101", "Wireless Laptop", 1200.0, 15);
        manager.adding("P102", "Mechanical Keyboard", 85.0, 40);
        manager.adding("P103", "Ergonomic Mouse", 45.0, 30);

        SalesPerson sales = new SalesPerson("Bob Smith", "SP-04");
        sales.login();
        sales.maintence();

        ProductDatabase.displayCatalog();

        Customer customer = new Customer("CUST-99", "John Doe");
        customer.login();
        customer.onlinePurchase("P101");

        sales.sellItem("P102");

        manager.updating("P101", 20);
        manager.deleting();

        ProductDatabase.displayCatalog();
        System.out.println("Experiment 3 completed successfully.");
    }
}
