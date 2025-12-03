package dev.gabrielsales.carinfo.controller;

import dev.gabrielsales.carinfo.dto.CarDto;
import dev.gabrielsales.carinfo.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car-info")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<CarDto> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/")
    public List<CarDto> getCarByBrandAndModel(
            @RequestParam("brand") String brand,
            @RequestParam("model") String model){
        return carService.getCarByBrandAndModel(brand, model);
    }

}
