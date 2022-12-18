package com.og.model;

import java.time.LocalDate;

public class Product extends OrderTable {
    private int id;
    private String name;
    private Double price;
    private String information;
    private String img;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Product() {
    }

    public Product(int id, String name, Double price, String information, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
        this.img = img;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Product(int id, String name, Double price, String information, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
        this.img = img;
    }

    public Product(int id, String name, Double price, String information) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
    }

    public Product(String name, Double price, String information) {
        this.name = name;
        this.price = price;
        this.information = information;
    }

    public Product(int id, String name, String price, String information) {
        this.id = id;
        this.name = name;
        this.price = Double.valueOf(price);
        this.information = information;
    }

    public Product(String name, Double price, String information, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.price = price;
        this.information = information;
        this.img = img;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Product(String name, Double price, String information, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
        this.img = img;
        this.createdAt = createdAt;
    }

    public Product(int id, String name, Double price, String information, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
        this.updatedAt = updatedAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", information='" + information + '\'' +
                ", img='" + img + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
