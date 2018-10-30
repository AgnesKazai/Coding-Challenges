package com.webtown.webshop.services;

import com.webtown.webshop.models.Bill;
import com.webtown.webshop.models.Product;

import java.util.List;

public interface BillService {

    int originalPricePerProduct(Product product);

    int buyThreeGetOneFreePricePerProduct(Product product);

    int megapackPricePerProduct(Product product);

    Bill generateBill(List<Product> products, Bill bill);
}
