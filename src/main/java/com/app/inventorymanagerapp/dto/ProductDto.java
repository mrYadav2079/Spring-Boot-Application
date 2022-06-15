package com.app.inventorymanagerapp.dto;

import com.app.inventorymanagerapp.entity.Product;
import lombok.Data;

@Data
public class ProductDto {
    private int productId;
    private String productName;
    private String brand;
    private String expiryDate;
    private int price;
    private int quantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public Product toProduct(){
        return new Product(productId,productName,productName,expiryDate,price,quantity);
    }
}
