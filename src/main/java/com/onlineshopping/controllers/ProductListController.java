package com.onlineshopping.controllers;

import com.onlineshopping.model.Product;
import com.onlineshopping.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ProductListController {

    private final ProductService productService;

    @Autowired
    public ProductListController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/list")
    public String showProduct(Model model){
        ArrayList<Product> products=new ArrayList(productService.findProducts());
        System.out.println(products.get(0).getProduct_id());
        if(!products.isEmpty()){
            model.addAttribute("products",products);
        }
        return "listProducts";
    }

}
