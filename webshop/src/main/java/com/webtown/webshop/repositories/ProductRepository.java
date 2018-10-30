package com.webtown.webshop.repositories;

import com.webtown.webshop.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products = new ArrayList<Product>(Arrays.asList(
            new Product("téliszalámi", 2000, false),
            new Product("gumikacsa", 3000, false),
            new Product("megapack uborka", 2800, true),
            new Product("megapack gesztenye", 1000, true)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product findProductByName(String name) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return products.get(index);
    }
}
