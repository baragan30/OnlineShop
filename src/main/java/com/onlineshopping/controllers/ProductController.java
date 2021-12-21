package com.onlineshopping.controllers;

import com.onlineshopping.model.Product;
import com.onlineshopping.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getPersons(@PathVariable String id, Model model){
        int idI=Integer.parseInt(id);
        Product p =  productService.findProductById(idI);
        model.addAttribute("products",p.getName());
        System.out.println(p.getName());
        return "product";
    }
}
