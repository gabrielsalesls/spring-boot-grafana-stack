package dev.gabrielsales.carinfo.repository;

import dev.gabrielsales.carinfo.model.CarInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<CarInfo, Long> {

    @Query("select c from CarInfo c where c.brand = :brand and c.model = :model")
    List<CarInfo> findCarByBrandAndModel(
            @Param("brand") String brand,
            @Param("model") String model
    );

}
