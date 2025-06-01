package Java_week3;

public class Product {
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
    }

    public void printDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setProductName("Smartphone");
        p.setProductId("SP001");
        p.setPrice(35000);
        p.restock(100);

        p.printDetails();

        p.purchase(3);

        System.out.println("\nAfter purchasing 3 units:");
        p.printDetails();
    }
}
