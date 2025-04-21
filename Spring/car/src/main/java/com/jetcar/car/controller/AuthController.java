package com.jetcar.car.controller;

import com.jetcar.car.dto.RegistrationRequest;
import com.jetcar.car.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173") // Можно сузить для продакшна
public class AuthController {
    @Autowired
    private UserService userService;

        // AuthController.java
    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody RegistrationRequest req,
                                        BindingResult br) {
        if (br.hasErrors()) {
            // Возвращаем первый message ошибки
            String err = br.getAllErrors().get(0).getDefaultMessage();
            return ResponseEntity.badRequest().body(err);
        }
        boolean success = userService.register(req.getName(), req.getPassword());
        if (!success) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                                .body("Пользователь уже существует");
        }
        return ResponseEntity.ok("Регистрация прошла успешно");
    }


    @PostMapping("/login")
public ResponseEntity<String> login(@RequestBody Map<String,String> body) {
    String name = body.get("name");
    String pass = body.get("password");
    boolean ok = userService.login(name, pass);
    if (!ok) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                             .body("Неверные данные");
    }
    return ResponseEntity.ok("Успешный вход");
}

}
