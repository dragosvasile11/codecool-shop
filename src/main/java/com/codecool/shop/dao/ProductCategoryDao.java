package com.codecool.shop.dao;

import com.codecool.shop.model.ProductCategory;

import java.util.List;
import java.util.Map;

public interface ProductCategoryDao {

    void add(ProductCategory category);
    List<String> getNames();
    Map<Integer, String> getIdsAndNames();
    ProductCategory find(int id);
    void remove(int id);

    List<ProductCategory> getAll();

}
