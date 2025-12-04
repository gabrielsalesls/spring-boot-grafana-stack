package dev.gabrielsales.cars.dto;

import java.util.List;

public record CarResponseDto(Integer count, List<CarInfoDto> carInfoDtoList) {
}
