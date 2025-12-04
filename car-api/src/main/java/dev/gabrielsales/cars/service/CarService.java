package dev.gabrielsales.cars.service;

import dev.gabrielsales.cars.client.CarInfoClient;
import dev.gabrielsales.cars.dto.CarInfoDto;
import dev.gabrielsales.cars.dto.CarResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarInfoClient carInfoClient;

    public CarService(CarInfoClient carInfoClient) {
        this.carInfoClient = carInfoClient;
    }

    public CarResponseDto getCarInfo(final String brand, final String model) {
        List<CarInfoDto> carInfoDtoList = carInfoClient.getCarByBrandAndModel(brand, model);
        return new CarResponseDto(carInfoDtoList.size(), carInfoDtoList);
    }

}
