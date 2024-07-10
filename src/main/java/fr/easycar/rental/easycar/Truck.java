package fr.easycar.rental.easycar;

import java.time.LocalDate;

public class Truck extends MotorizedVehicule{
    private double cargoCapacity;

    public Truck(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            FuelType fuelType, int fuelConsumption, boolean integratedGPS, double cargoCapacity){
                super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);

                this.cargoCapacity = cargoCapacity;
            }
            public double getCargoCapacity(){
                return cargoCapacity;
            }
            public void setCargoCapacity (double cargoCapacity){
                this.cargoCapacity = cargoCapacity;
            }



}

