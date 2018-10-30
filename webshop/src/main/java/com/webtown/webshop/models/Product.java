package com.webtown.webshop.models;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private String name;
    private int price;
    private int quantity;
    private boolean megapack;

    public Product() {
    }

    public Product(String name, int price, boolean megapack) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
        this.megapack = megapack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isMegapack() {
        return megapack;
    }

    public void setMegapack(boolean megapack) {
        this.megapack = megapack;
    }
}
