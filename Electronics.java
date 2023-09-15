public class Electronics extends Product{
    private double voltage;

    // Constructor for Electronics class without voltage parameter
    public Electronics(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Constructor for Electronics class with voltage parameter
    public Electronics(String name, double price, int quantity, double voltage){
        super(name, price, quantity);
        this.voltage = voltage;
    }
}
