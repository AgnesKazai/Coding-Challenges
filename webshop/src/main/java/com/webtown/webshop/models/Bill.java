package com.webtown.webshop.models;

public class Bill {
    private int originalAmount;
    private int discountedAmount;
    private String tyeOfDiscount = "";

    public Bill() {
    }

    public String getTyeOfDiscount() {
        return tyeOfDiscount;
    }

    public void setTyeOfDiscount(String tyeOfDiscount) {
        this.tyeOfDiscount = tyeOfDiscount;
    }

    public int getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(int originalAmount) {
        this.originalAmount = originalAmount;
    }

    public int getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(int discountedAmount) {
        this.discountedAmount = discountedAmount;
    }
}
