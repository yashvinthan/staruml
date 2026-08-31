import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    private String name;
    private String id;
    private double price;
    private int quantity;
    private static Map<String, ProductDatabase> catalog = new HashMap<>();

    public ProductDatabase() {
    }

    public ProductDatabase(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        catalog.put(id, this);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void purchaseProduct() {
        if (quantity > 0) {
            quantity--;
            System.out.println("[ProductDatabase] Purchased 1 unit of '" + name + "'. Remaining stock: " + quantity);
        } else {
            System.out.println("[ProductDatabase] Product '" + name + "' is out of stock!");
        }
    }

    public static ProductDatabase findProduct(String id) {
        return catalog.get(id);
    }

    public static void displayCatalog() {
        System.out.println("----- PRODUCT CATALOG -----");
        for (ProductDatabase p : catalog.values()) {
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName() + " | Price: $" + p.getPrice() + " | Stock: " + p.getQuantity());
        }
    }
}
