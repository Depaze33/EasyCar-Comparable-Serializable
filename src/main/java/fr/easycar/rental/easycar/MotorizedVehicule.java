package fr.easycar.rental.easycar;

import java.time.LocalDate;

public abstract class MotorizedVehicule extends Vehicle {
    public enum FuelType {
        ESSENCE,
        DIESEL,
        ELECTRIC;
    }

    private FuelType fuelType;
    private int fuelConsumption;
    private boolean integratedGPS;

    protected MotorizedVehicule(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            FuelType fuelType, int fuelConsumption, boolean integratedGPS) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.integratedGPS = integratedGPS;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public boolean getIntegratesGPS() {
        return integratedGPS;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setIntegratedGPS(boolean integratedGPS) {
        this.integratedGPS = integratedGPS;
    }
}
