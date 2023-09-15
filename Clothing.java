public class Clothing extends Product {
    private String sizes;

    // Constructor for Clothing class without sizes parameter
    public Clothing(String name, double price, int quantity){
        super(name, price, quantity);
    }
    
    // Constructor for Clothing class with sizes parameter
    public Clothing(String name, double price, int quantity, String sizes){
        super(name, price, quantity);
        this.sizes = sizes;
    }
}
