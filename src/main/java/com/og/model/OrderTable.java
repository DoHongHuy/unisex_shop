package com.og.model;

public class OrderTable {
    private int table;
    private int id;
    private String name;
    private Double price;
    private int quantity;
    private Double total;
    private String information;
    private String dob;
    private String createBy;
    public OrderTable() {
    }

    public OrderTable(int table, int id, String name, Double price, int quanity, Double total, String information, String dob, String createBy) {
        this.table = table;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quanity;
        this.total = total;
        this.information = information;
        this.dob = dob;
        this.createBy = createBy;
    }

    public OrderTable(int id, String name, Double price, int quanity, Double total, String information) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quanity;
        this.total = total;
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
