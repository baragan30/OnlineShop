package com.onlineshopping.controllers;

import com.onlineshopping.model.User;
import com.onlineshopping.repositories.UserRepository;
import com.onlineshopping.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    private final UserService userService;
    private final UserRepository userRepository;

    public RegisterController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/goToLogin")
    public String goToLogin(){return "login";}

    @RequestMapping("/registerCheck")
    public String check(@ModelAttribute("username") String username, @ModelAttribute("password") String password, final Model model){
        User u = new User(username,password,"client");
        userRepository.save(u);
        return "succsess";
    }

    @RequestMapping("/register-error")
    public String registerError(final Model model) {
        model.addAttribute("registerError", true);
        return "register";
    }
}
