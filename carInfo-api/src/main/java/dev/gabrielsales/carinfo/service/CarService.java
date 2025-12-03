package dev.gabrielsales.carinfo.service;

import dev.gabrielsales.carinfo.dto.CarDto;
import dev.gabrielsales.carinfo.model.CarInfo;
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
        List<CarInfo> carInfos = repository.findAll();

        return carInfos.stream().map(CarInfo::toDto).toList();

    }

    public List<CarDto> getCarByBrandAndModel(String brand, String model) {
        List<CarInfo> carInfos = repository.findCarByBrandAndModel(brand, model);

        return carInfos.stream().map(CarInfo::toDto).toList();

    }

}
