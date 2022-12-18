package com.og.dto;

public class OrderTableDTO {
    private int table;
    private String name;
    private Double price;
    private int quantity;
    private double total;
    private String information;
    private String dob;
    private String createBy;

    public OrderTableDTO() {
    }

    public OrderTableDTO(int table, String name, Double price, int quantity, double total, String information, String dob, String createBy) {
        this.table = table;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.information = information;
        this.dob = dob ;
        this.createBy = createBy;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public String getName() {
        return name;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
