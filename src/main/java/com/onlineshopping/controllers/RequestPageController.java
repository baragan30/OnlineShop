package com.onlineshopping.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestPageController {

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
        return "home";
    }

    @RequestMapping("/home")
    public String goToHome() {
        return "home";
    }

    @RequestMapping("/accountSettings")
    public String goToAccountSettings(Authentication authentication, @RequestParam(name="username", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("username", authentication.getName());
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