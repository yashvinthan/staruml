public class Customer {
    private String customerId;
    private String name;

    public Customer() {
    }

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void login() {
        System.out.println("Customer '" + name + "' (ID: " + customerId + ") logged in for online shopping.");
    }

    public void onlinePurchase(String productId) {
        System.out.println("Customer '" + name + "' requesting online purchase of product ID: " + productId);
        ProductDatabase p = ProductDatabase.findProduct(productId);
        if (p != null) {
            p.purchaseProduct();
        } else {
            System.out.println("Item not found in online store.");
        }
    }
}
