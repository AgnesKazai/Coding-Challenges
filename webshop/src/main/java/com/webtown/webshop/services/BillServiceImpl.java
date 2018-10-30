package com.webtown.webshop.services;

import com.webtown.webshop.models.Bill;
import com.webtown.webshop.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Override
    public int originalPricePerProduct(Product product) {
        return product.getQuantity() * product.getPrice();
    }

    @Override
    public int buyThreeGetOneFreePricePerProduct(Product product) {
        int original = originalPricePerProduct(product);
        int discount = (product.getQuantity() / 3) * product.getPrice();
        return original - discount;
    }

    @Override
    public int megapackPricePerProduct(Product product) {
        int original = originalPricePerProduct(product);
        int discount = 0;
        if (product.isMegapack() && product.getQuantity() / 12 > 0) {
            discount = (product.getQuantity() / 12) * 6000;
        }
        return original - discount;
    }

    @Override
    public Bill generateBill(List<Product> products, Bill bill) {
        int origSum = 0;
        int buyThreeGetOneFreeSum = 0;
        int megapackSum = 0;
        for (int i = 0; i < products.size(); i++) {
            origSum += originalPricePerProduct(products.get(i));
            buyThreeGetOneFreeSum += buyThreeGetOneFreePricePerProduct(products.get(i));
            megapackSum += megapackPricePerProduct(products.get(i));
        }
        bill.setOriginalAmount(origSum);
        if (buyThreeGetOneFreeSum > megapackSum) {
            bill.setDiscountedAmount(megapackSum);
            bill.setTyeOfDiscount("Megapack");
        } else if (buyThreeGetOneFreeSum < megapackSum) {
            bill.setDiscountedAmount(buyThreeGetOneFreeSum);
            bill.setTyeOfDiscount("Buy Three Get One Free");
        } else if (buyThreeGetOneFreeSum == megapackSum && buyThreeGetOneFreeSum < origSum) {
            bill.setDiscountedAmount(buyThreeGetOneFreeSum);
            bill.setTyeOfDiscount("Buy Three Get One Free");
        } else {
            bill.setDiscountedAmount(origSum);
            bill.setTyeOfDiscount("Discount is not available.");
        }
        return bill;
    }
}
