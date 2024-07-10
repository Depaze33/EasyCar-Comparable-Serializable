package fr.easycar.rental.easycar;

import java.time.LocalDate;

public class Skate extends Vehicle {
    private double size;

    public Skate(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, double size) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    

    
}
