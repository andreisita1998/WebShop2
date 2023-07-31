package com.example.webShop.database;

public class OrderDetails {
    private String productName;
    private int quantity;
    private double totalPrice;
    private double pricePerUnit;
    private String category;

    public String getProductName() {
        return productName;
    }

    public OrderDetails setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderDetails setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public OrderDetails setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public OrderDetails setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public OrderDetails setCategory(String category) {
        this.category = category;
        return this;
    }
}
