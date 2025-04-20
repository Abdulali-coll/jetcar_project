package com.jetcar.car.model;


import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String image;
    private String imageAny;  
    private String imageBack;
    private String price;
    private Integer mileage;
    private Integer power;
    private String engineType;
    
    @Column(length = 20480)
    private String description;
    
    private Integer year;

    public Car() {}

    public Car(String name, String image, String imageAny, String imageBack, String price, Integer mileage,
               Integer power, String engineType, String description, Integer year) {
        this.name = name;
        this.image = image;
        this.imageAny = imageAny;
        this.imageBack = imageBack;
        this.price = price;
        this.mileage = mileage;
        this.power = power;
        this.engineType = engineType;
        this.description = description;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageAny() {
        return imageAny;
    }

    public void setImageAny(String imageAny) {
        this.imageAny = imageAny;
    }

    public String getImageBack() {
        return imageBack;
    }

    public void setImageBack(String imageBack) {
        this.imageBack = imageBack;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
