package dev.gabrielsales.carinfo.model;

import dev.gabrielsales.carinfo.dto.CarDto;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "car_info")
public class Car {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String brand;

    private String model;

    @Column(name = "manufacture_year")
    private Integer year;

    private String color;

    public Car() {
    }

    public Car(String brand, String model, Integer year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarDto toDto() {
        return new CarDto(this.brand, this.model, this.year, this.color);
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

