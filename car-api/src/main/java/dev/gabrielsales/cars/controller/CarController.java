package dev.gabrielsales.cars.controller;

import dev.gabrielsales.cars.dto.CarResponseDto;
import dev.gabrielsales.cars.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public CarResponseDto getCarInfo(
            @RequestParam("brand") String brand,
            @RequestParam("model") String model
    ) {
        return carService.getCarInfo(brand, model);
    }
}
