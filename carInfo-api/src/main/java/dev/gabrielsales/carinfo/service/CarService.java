package dev.gabrielsales.carinfo.service;

import dev.gabrielsales.carinfo.dto.CarDto;
import dev.gabrielsales.carinfo.model.Car;
import dev.gabrielsales.carinfo.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarDto> getAllCars() {
        List<Car> cars = repository.findAll();

        return cars.stream().map(Car::toDto).toList();

    }
}
