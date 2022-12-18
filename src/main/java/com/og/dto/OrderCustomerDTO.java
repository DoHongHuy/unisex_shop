package com.og.dto;

import java.time.LocalDateTime;

public class OrderCustomerDTO {
    private int id;
    private String nameCustomer;
    private int phone;
    private String address;
    private int idOrder;
    private int quantity;
    private LocalDateTime createdAt;
    public OrderCustomerDTO() {
    }

    public OrderCustomerDTO(int id, String nameCustomer, int phone, String address, int idOrder, int quantity, LocalDateTime createdAt) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.phone = phone;
        this.address = address;
        this.idOrder = idOrder;
        this.quantity = quantity;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
