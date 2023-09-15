public class InventoryTest {
    public static void main(String[] args) {
        // Create instances of different products
        Product phoneCase = new Product("IPhone 15 Pro Max Black Case", 500, 3);
        Electronics extensionSocket = new Electronics("Huawei x9 multi socket plug", 300, 6);
        Clothing Shirt = new Clothing("Nike", 30, 8, "Medium" );

        // Create an instance of StoreInventory and add products to it
        StoreInventory<Product> RogerSelection = new StoreInventory<>();
        RogerSelection.addProduct(phoneCase);
        RogerSelection.addProduct(extensionSocket);
        RogerSelection.addProduct(Shirt);

        // Calculate the total value of the inventory
        double totalValue = RogerSelection.getTotalValue();
        System.out.println("Total value: " + totalValue);
    }
}
