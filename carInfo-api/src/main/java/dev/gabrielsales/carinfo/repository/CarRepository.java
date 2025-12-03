package dev.gabrielsales.carinfo.repository;

import dev.gabrielsales.carinfo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
