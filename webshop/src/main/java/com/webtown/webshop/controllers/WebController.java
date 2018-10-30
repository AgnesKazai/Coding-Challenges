package com.webtown.webshop.controllers;

import com.webtown.webshop.models.Bill;
import com.webtown.webshop.models.Product;
import com.webtown.webshop.services.BillService;
import com.webtown.webshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    private ProductService productService;
    private BillService billService;

    @Autowired
    public WebController(ProductService productService, BillService billService) {
        this.productService = productService;
        this.billService = billService;
    }

    @GetMapping("/")
    public String renderProductsPage(Model model) {
        model.addAttribute("productlist", productService.getAllProducts());
        return "index";
    }

    @PostMapping("/{name}")
    public String listOfProduct(@PathVariable(value = "name") String name,
                                @RequestParam("quantity") int quantity) {
        Product product = productService.findOneProductByName(name);
        product.setQuantity(quantity);
        return "redirect:/";
    }

    @GetMapping("/orders")
    private String renderOrdersPage(Model model) {
        model.addAttribute("productlist", productService.getAllProducts());
        model.addAttribute("bill", billService.generateBill(productService.getAllProducts(), new Bill()));
        return "orders";
    }
}
