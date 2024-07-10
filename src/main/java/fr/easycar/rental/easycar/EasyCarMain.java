package fr.easycar.rental.easycar;

import java.time.LocalDate;
import java.util.Collections;
import java.util.ArrayList;

import fr.easycar.rental.easycar.MotorizedVehicule.FuelType;

public class EasyCarMain {
	public static ArrayList<Customer> customers = new ArrayList<>();

	public static void main(String[] args) {
		Bike bike1 = new Bike("Decathlon", "Super velo", "noir", LocalDate.of(2020, 3, 5), 50.50, 'L');
		Car car1 = new Car("Peugot", "208", "blanche", LocalDate.of(2014, 1, 1), 100.20, FuelType.DIESEL, 50, false, 4);
		Truck truck1 = new Truck("Mercedes","Van mercedes", "Gris", LocalDate.of(2025, 5, 5), 150.20, FuelType.DIESEL, 150, false, 8);
		Skate skate1 = new Skate("Magenta", "Big plant", "Multi-color", LocalDate.of(2024, 1, 2), 20, 8.3);
		Car car2 = new Car("Tesla", "Model S", "Blanche", LocalDate.of(2023, 5, 8), 200.0, FuelType.ELECTRIC, 120, false, 8);
		
		Customer client1 = new Customer("Liam", "1", "25 rue des champs ", "Bordeaux", "33000");
		Customer client2 = new Customer("Chloé", "2", "25 rue des champs ", "Bordeaux", "33000");
		Customer client3 = new Customer("Lea", "3", "25 rue des champs ", "Bordeaux", "33000");
		Customer client4 = new Customer("Mathis", "4", "25 rue des champs ", "Bordeaux", "33000");
		Customer client5 = new Customer("Louis", "5", "25 rue des champs ", "Bordeaux", "33000");

		Reservation reservation1 = new Reservation(LocalDate.of(2024, 1, 20), LocalDate.of(2024, 6, 23), true,bike1);
		Reservation reservation2 = new Reservation(LocalDate.of(2024, 4, 20), LocalDate.of(2024, 7, 30), true,car1);
		Reservation reservation3 = new Reservation(LocalDate.of(2024, 5, 20), LocalDate.of(2024, 9, 10), true,truck1);
		Reservation reservation4 = new Reservation(LocalDate.of(2024, 6, 20), LocalDate.of(2024, 12, 15), true,skate1);
		Reservation reservation5 = new Reservation(LocalDate.of(2024, 2, 20), LocalDate.of(2024, 2, 25), true,car2);


	client1.addReservation(reservation1);
	client2.addReservation(reservation2);
	client3.addReservation(reservation3);
	client4.addReservation(reservation4);
	client5.addReservation(reservation5);

		for (Customer customers : customers) {
			System.out.println(customers);
		}
		customers.add(client1);
		customers.add(client2);
		customers.add(client3);
		customers.add(client4);
		customers.add(client5);
		Collections.sort(customers);
		 System.out.println(customers);
	
	
    
	
	}

}
