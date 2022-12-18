package com.og.service;

import com.og.model.Product;

import java.util.List;

public interface productService extends IGeneralService<Product>{
    Product findById(int id);
    boolean existByid(int id);
    public List<Product> searchByKey(String key);
}
