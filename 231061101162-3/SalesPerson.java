public class SalesPerson extends Employee {

    public SalesPerson() {
        super();
    }

    public SalesPerson(String name, String id) {
        super(name, id);
    }

    public void maintence() {
        System.out.println("SalesPerson '" + name + "' is performing catalog and sales terminal maintenance.");
    }

    public void sellItem(String productId) {
        ProductDatabase p = ProductDatabase.findProduct(productId);
        if (p != null) {
            System.out.println("SalesPerson '" + name + "' processing sale for product: " + p.getName());
            p.purchaseProduct();
        } else {
            System.out.println("SalesPerson: Product ID " + productId + " not found.");
        }
    }
}
