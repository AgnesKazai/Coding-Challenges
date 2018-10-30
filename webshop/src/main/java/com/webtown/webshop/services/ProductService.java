package com.webtown.webshop.services;

import com.webtown.webshop.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product findOneProductByName(String name);
}

