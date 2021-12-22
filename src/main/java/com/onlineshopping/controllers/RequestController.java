package com.onlineshopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

    @RequestMapping("/login")
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping("/register")
    public String goToregisterPage() {
        return "register";
    }

    @RequestMapping("/")
    public String GoToIndex() {
        return "index";
    }

    @RequestMapping("/index")
    public String GoToIndex2() {
        return "index";
    }

    @RequestMapping("/home")
    public String goToHome() {
        return "home";
    }

    @RequestMapping("/contact")
    public String goToContact() {
        return "contact";
    }

    @RequestMapping("/accountSettings")
    public String goToAccountSettings() {
        return "accountSettings";
    }

    @RequestMapping("/logOut")
    public String goToLogOut() {
        return "logOut";
    }

    @RequestMapping("/product")
    public String goToProduct() {
        return "product";
    }

    @RequestMapping("/productList")
    public String goToProductList() {
        return "productList";
    }
}