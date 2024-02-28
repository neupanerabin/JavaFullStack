package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;
    private String productManfComp;
    private String productPrice;

    public Product(String productName, String productManfComp, String productPrice) {
        this.productName = productName;
        this.productManfComp = productManfComp;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productManfComp='" + productManfComp + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductManfComp(String productManfComp) {
        this.productManfComp = productManfComp;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductManfComp() {
        return productManfComp;
    }

    public String getProductPrice() {
        return productPrice;
    }

}
