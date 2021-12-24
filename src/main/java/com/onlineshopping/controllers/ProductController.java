package com.onlineshopping.controllers;

import com.onlineshopping.model.Product;
import com.onlineshopping.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        ArrayList<String> pics=new ArrayList<>();
        pics.add(p.getPic1());
        if(p.getPic2()!=null){
            pics.add(p.getPic2());
            if(p.getPic3()!=null){
                pics.add(p.getPic3());
            }
        }
        model.addAttribute("products",p.getName());
        model.addAttribute("pics",pics);
        return "product";
    }
}
