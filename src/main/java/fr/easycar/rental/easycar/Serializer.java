package fr.easycar.rental.easycar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializer {

    private Serializer() {
    }

    /**
     * Sérialise une liste d'objets de la classe "Customer"
     * 
     * @param customer L'objet de la classe "Customer" à sérialiser
     */
    public static void serializeCustomer(ArrayList<Customer> customersSerilizable) {

        try {
            // Création d'un flux de sortie de données vers un nouveau fichier
            FileOutputStream outputStream = new FileOutputStream("customer.serial");

            // Création d'un flux de sortie d'un Objet
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // Sauvegarde du "Customer" dans le fichier
            objectOutputStream.writeObject(customersSerilizable);

            // Close the stream and release resources
            objectOutputStream.close();

        } catch (IOException exception) {
            // TODO plutôt metter un logger qu'un System.out
            System.out.println("Erreur lors de la sérialisation : " + exception.getMessage());
        }
    }

    /**
     * Dé-sérialise une liste d'objets de la classe "Customer"
     * 
     * @return
     */
    public static ArrayList<Customer> deserializeCustomer() {
        // TOOD à compléter

        ArrayList<Customer> customers = null;
        try {
            FileInputStream file = new FileInputStream("customer.serial");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            customers = (ArrayList<Customer>) in.readObject();

            in.close();
            file.close();
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println("Erreur lors de la desérialisation : " + exception.getMessage());
        }
        return customers;

    }

}
