package com.jetcar.car.controller;

import com.jetcar.car.model.Car;
import com.jetcar.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "http://localhost:5173")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
public ResponseEntity<List<Car>> getCars(
        @RequestParam(required = false) String brand,
        @RequestParam(required = false) String price,
        @RequestParam(required = false) String year
) {
    if (brand != null || price != null || year != null) {
        return ResponseEntity.ok(carService.getFilteredCars(brand, price, year));
    } else {
        return ResponseEntity.ok(carService.getAllCars());
    }
}

    // Получение конкретного автомобиля по идентификатору
    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Integer id) {
        Optional<Car> car = carService.getCarById(id);
        return car.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Создание нового автомобиля
    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car savedCar = carService.saveCar(car);
        return ResponseEntity.ok(savedCar);
    }

    // Обновление данных автомобиля
    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Integer id, @RequestBody Car carDetails) {
        Car updatedCar = carService.updateCar(id, carDetails);
        if(updatedCar != null){
            return ResponseEntity.ok(updatedCar);
        }
        return ResponseEntity.notFound().build();
    }

    // Удаление автомобиля
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }

}
