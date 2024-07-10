package fr.easycar.rental.easycar;

import java.time.LocalDate;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;
    private LocalDate buyingDate;
    private double pricePerDay;

    protected Vehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.buyingDate = buyingDate;
        this.pricePerDay = pricePerDay;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBuyingDate() {
        return buyingDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBuyingDate(LocalDate buyingDate) {
        this.buyingDate = buyingDate;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
