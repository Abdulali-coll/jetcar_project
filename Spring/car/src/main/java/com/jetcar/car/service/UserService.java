package com.jetcar.car.service;

import com.jetcar.car.model.User;
import com.jetcar.car.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public boolean register(String name, String rawPassword) {
        if (userRepository.findByName(name).isPresent()) {
            return false;
        }
        User user = new User();
        user.setName(name);
        user.setPassword(encoder.encode(rawPassword));
        userRepository.save(user);
        return true;
    }

    public boolean login(String name, String rawPassword) {
        return userRepository.findByName(name)
            .map(user -> encoder.matches(rawPassword, user.getPassword()))
            .orElse(false);
    }
}
