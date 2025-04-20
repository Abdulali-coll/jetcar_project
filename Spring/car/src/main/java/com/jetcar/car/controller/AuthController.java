package com.jetcar.car.controller;

import com.jetcar.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173") // Можно сузить для продакшна
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        String password = body.get("password");

        boolean success = userService.register(name, password);
        return success ? "Регистрация прошла успешно" : "Пользователь уже существует";
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        String password = body.get("password");

        boolean success = userService.login(name, password);
        return success ? "Успешный вход" : "Неверные данные";
    }
}
