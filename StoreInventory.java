import java.util.*;

public class StoreInventory<T> {
    private List<Product> inventory = new ArrayList<>();

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        this.inventory.add(product);
    }

    // Method to remove a product from the inventory based on the product name
    public void removeProduct(String productName) {
        inventory.removeIf(product -> product.getName().equals(productName));
    }

    // Method to find a product in the inventory based on the product name
    public Product findProduct(String productName) {
        for (Product product : inventory) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    // Method to list all products in the inventory
    public List<Product> listAllProducts() {
        return new ArrayList<>(inventory);
    }

    // Method to calculate the total value of all products in the inventory
    public double getTotalValue() {
        double total = 0.0;
        for (Product product : inventory) {
            total += product.getQuantity() * ((Number) product.getPrice()).doubleValue();
        }
        return total;
    }
}
