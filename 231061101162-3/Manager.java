public class Manager extends Employee {

    public Manager() {
        super();
    }

    public Manager(String name, String id) {
        super(name, id);
    }

    public void adding() {
        System.out.println("Manager '" + name + "' added a new product line to the system.");
    }

    public void adding(String id, String prodName, double price, int qty) {
        new ProductDatabase(id, prodName, price, qty);
        System.out.println("Manager '" + name + "' successfully added product: " + prodName + " (ID: " + id + ")");
    }

    public void updating() {
        System.out.println("Manager '" + name + "' updated stock inventory records.");
    }

    public void updating(String productId, int newQty) {
        ProductDatabase p = ProductDatabase.findProduct(productId);
        if (p != null) {
            p.setQuantity(newQty);
            System.out.println("Manager '" + name + "' updated stock for " + p.getName() + " to: " + newQty);
        }
    }

    public void deleting() {
        System.out.println("Manager '" + name + "' deleted obsolete inventory entries.");
    }
}
