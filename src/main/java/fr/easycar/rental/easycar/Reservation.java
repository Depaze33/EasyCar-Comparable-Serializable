package fr.easycar.rental.easycar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean paid;
    private Vehicle vehicle;

    public Reservation(LocalDate startDate, LocalDate endDate, boolean paid, Vehicle vehicle) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.paid = paid;
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean getPaid() {
        return paid;
    }
     public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public double totalPrice() {
        LocalDate start = startDate;
        LocalDate end = endDate;

        long daysForReserved = ChronoUnit.DAYS.between(start, end);
        double pricePerDay = vehicle.getPricePerDay();

        return daysForReserved * pricePerDay;
    }

   
}
