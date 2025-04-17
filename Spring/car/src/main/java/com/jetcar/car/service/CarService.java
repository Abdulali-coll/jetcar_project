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

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car carDetails) {
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

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
