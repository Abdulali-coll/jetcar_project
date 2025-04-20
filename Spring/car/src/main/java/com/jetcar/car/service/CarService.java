package com.jetcar.car.service;

import com.jetcar.car.model.Car;
import com.jetcar.car.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Integer id) {
        return carRepository.findById(id);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Integer id, Car carDetails) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            Car car = optionalCar.get();
            car.setName(carDetails.getName());
            car.setImage(carDetails.getImage());
            car.setImageAny(carDetails.getImageAny());
            car.setImageBack(carDetails.getImageBack());
            car.setPrice(carDetails.getPrice());
            car.setMileage(carDetails.getMileage());
            car.setPower(carDetails.getPower());
            car.setEngineType(carDetails.getEngineType());
            car.setDescription(carDetails.getDescription());
            car.setYear(carDetails.getYear());
            return carRepository.save(car);
        }
        return null;
    }

    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }
    public List<Car> getFilteredCars(String brand, String priceOrder, String yearOrder) {
        List<Car> cars = carRepository.findAll();
    
        // Фильтрация по бренду
        if (brand != null && !brand.isEmpty()) {
            cars = cars.stream()
                    .filter(car -> car.getBrand() != null && brand.equalsIgnoreCase(car.getBrand().getName()))
                    .toList();
        }
    
        // Сортировка по цене
        if ("asc".equalsIgnoreCase(priceOrder)) {
            cars = cars.stream()
                    .sorted((a, b) -> parsePrice(a.getPrice()) - parsePrice(b.getPrice()))
                    .toList();
        } else if ("desc".equalsIgnoreCase(priceOrder)) {
            cars = cars.stream()
                    .sorted((a, b) -> parsePrice(b.getPrice()) - parsePrice(a.getPrice()))
                    .toList();
        }
    
        // Сортировка по году
        if ("asc".equalsIgnoreCase(yearOrder)) {
            cars = cars.stream()
                    .sorted((a, b) -> Integer.compare(a.getYear(), b.getYear()))
                    .toList();
        } else if ("desc".equalsIgnoreCase(yearOrder)) {
            cars = cars.stream()
                    .sorted((a, b) -> Integer.compare(b.getYear(), a.getYear()))
                    .toList();
        }
    
        return cars;
    }
    
    // Парсинг цены типа "7 500 999 руб" => 7500999
    private int parsePrice(String price) {
        if (price == null) return 0;
        return Integer.parseInt(price.replaceAll("[^0-9]", ""));
    }
    
}
