package dev.gabrielsales.cars.client;

import dev.gabrielsales.cars.dto.CarInfoDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class CarInfoClient {

    private final RestClient restClient;

    public CarInfoClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<CarInfoDto> getCarByBrandAndModel(final String brand, final String model) {

        final String carInfoUri = String.format(
                "http://localhost:8081/api/v1/car-info?brand=%s&model=%s",
                brand,
                model
        );

        return restClient
                .get()
                .uri(carInfoUri)
                .retrieve()
                .body(new ParameterizedTypeReference<List<CarInfoDto>>() {});
    }

}
