class Product {
    static double discount = 10.0; // percentage
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) {
            double totalCost = (price * quantity) * (1 - discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Cost after Discount: " + totalCost);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 45000, 2, 111);
        p1.displayDetails();
        Product.updateDiscount(15);
        p1.displayDetails();
    }
}