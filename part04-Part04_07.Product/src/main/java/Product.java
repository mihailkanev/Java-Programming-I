public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initalPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initalPrice;
        this.quantity = initialQuantity;
    

    }
        public void printProduct() {
            System.out.println(this.name + ", price " + this.price + ", " + this.quantity+" pcs");
        }

    }

