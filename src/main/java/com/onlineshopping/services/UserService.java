package com.onlineshopping.services;

import com.onlineshopping.model.User;
import com.onlineshopping.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findUsers(){
        return userRepository.findAll();
    }

    public User findUserById(long id){
        return userRepository.getById((int) id);
    }

    public User findByUsername(String username){return userRepository.findByUsername(username);}
}
