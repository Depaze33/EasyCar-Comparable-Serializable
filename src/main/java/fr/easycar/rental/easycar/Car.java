package fr.easycar.rental.easycar;

import java.time.LocalDate;

public class Car extends MotorizedVehicule {
    private int seats;

    public Car(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            FuelType fuelType, int fuelConsumption, boolean integratedGPS,
            int seats) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
