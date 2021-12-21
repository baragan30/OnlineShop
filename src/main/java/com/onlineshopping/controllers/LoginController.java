package com.onlineshopping.controllers;

import com.onlineshopping.services.UserService;
import com.onlineshopping.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private final UserService userService;

    @Autowired
    public LoginController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/goToRegister")
    public String registerPage() {
        return "register";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/succ")
    public String succ(){return "client";}

    @RequestMapping("/loginCheck")
    public String check(@ModelAttribute("username") String username,@ModelAttribute("password") String password,final Model model){
        User u= userService.findByUsername(username);
        if(u==null){
            return loginError(model);
        }
        if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
            if(u.getRole().equals("Client"))
                return "client";
            if(u.getRole().equals("Worker"))
                return "worker";
            if(u.getRole().equals("Admin"))
                return "admin";
        }
        return loginError(model);
    }

    @RequestMapping("/login-error")
    public String loginError(final Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}