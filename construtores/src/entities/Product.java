package entities;

public class Product {
    public String name;
    public double price;
    public double quantity;

    public Product(String name, double price, double quantity2) {
        this.name = name;
        this.price = price;
        this.quantity = quantity2;
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