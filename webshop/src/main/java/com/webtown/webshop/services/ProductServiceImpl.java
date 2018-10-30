package com.webtown.webshop.services;

import com.webtown.webshop.models.Product;
import com.webtown.webshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Product findOneProductByName(String name) {
        return productRepository.findProductByName(name);
    }

}
