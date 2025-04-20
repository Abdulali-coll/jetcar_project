package com.jetcar.car.service;

import com.jetcar.car. model.User;
import com.jetcar.car.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean register(String name, String password) {
        if (userRepository.findByName(name).isPresent()) return false;

        User user = new User();
        user.setName(name);
        user.setPassword(password); // ❗ На практике хешируй пароль!
        userRepository.save(user);
        return true;
    }

    public boolean login(String name, String password) {
        Optional<User> user = userRepository.findByName(name);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}
