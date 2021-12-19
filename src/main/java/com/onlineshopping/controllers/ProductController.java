package com.onlineshopping.controllers;

import com.onlineshopping.model.Product;
import com.onlineshopping.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getPersons(@RequestParam("id") long id,Model model){
        Product p =  productService.findProductById(id);
        model.addAttribute("product",p);
        return "product";
    }
}
