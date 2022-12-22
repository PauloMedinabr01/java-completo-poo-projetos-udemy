package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public Product() {
    }
    public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    }
    public Product(String name, double price) {
    this.name = name;
    this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(double quantity2) {
        this.quantity += quantity2;
    }

    public void removeProducts(double quantity2) {
        this.quantity -= quantity2;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}