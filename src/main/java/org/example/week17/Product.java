package org.example.week17;

public class Product {
    private String productName;
    private double price;
    private int stock;


    public Product(String productName, double price, int stock) {
        setProductName(productName);
        setPrice(price);
        setStock(stock);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + getProductName() + '\'' +
                ", price=" + getPrice() +
                ", stock=" + getStock() +
                '}';
    }
}
