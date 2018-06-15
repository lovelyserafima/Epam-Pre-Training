package by.epam.preTraining.ArthurLyup.tasks.task07.testing;

import by.epam.preTraining.ArthurLyup.tasks.task07.business_logic.Airline;
import by.epam.preTraining.ArthurLyup.tasks.task07.container.PlaneListWithFixedMemory;
import by.epam.preTraining.ArthurLyup.tasks.task07.entities.Plane;

/**
 * Task07 is the class with the main method (String[] args)
 *
 * 15 June 2018
 * @author Arthur Lyup
 */

public class Task07 {
    public static void main (String[] args) throws Exception {
        //initialization blocks
        Plane a = new Plane();
        a.setName("Adam");
        a.setPassengerCapacity(850);
        a.setCarryingCapacity(1000);
        a.setCountryOfProduction("Belarus");
        a.setWeight(273);
        a.setFuelConsumption(300);

        Plane b = new Plane();
        b.setName("Boeing");
        b.setPassengerCapacity(500);
        b.setCarryingCapacity(150.0);
        b.setCountryOfProduction("Russia");
        b.setWeight(45);
        b.setFuelConsumption(1000);

        Plane c = new Plane();
        c.setName("Ikarus");
        c.setPassengerCapacity(500);
        c.setCarryingCapacity(150.0);
        c.setCountryOfProduction("The USA");
        c.setWeight(120);
        c.setFuelConsumption(1000);

        Plane d = new Plane();
        d.setName("Sukhoi");
        d.setPassengerCapacity(400);
        d.setCarryingCapacity(125);
        d.setCountryOfProduction("The USSR");
        c.setWeight(100);
        c.setFuelConsumption(350);

        ////////////////////////////////////////

        //initialization airline
        int numberOfPlanes = 5;
        PlaneListWithFixedMemory planes = new PlaneListWithFixedMemory(numberOfPlanes);

        //printing when there are no planes in airline
        System.out.println(planes);

        //added 1 object to airline and print it
        planes.addPlanes(a);
        System.out.println("\n" + planes);

        //added some objects to airline and print it
        planes.addPlanes(b, c);
        System.out.println(planes);

        //get total number of planes
        System.out.println("Total number of planes = " + planes.getSize());

        //checks whether the airline is empty
        System.out.println("\nAirline is empty -> " + planes.isEmpty());

        //get plane by index
        int index = 2;
        System.out.println("\nElement with index " + index + ":\n" + planes.getByIndex(index));

        //delete plane by index
        System.out.println("\nAfter deleting plane by index=" + index);
        planes.deleteByIndex(index);
        System.out.println(planes);

        //clear all
        System.out.println("\nClear airline");
        planes.clearAll();
        System.out.println(planes);

        planes = new PlaneListWithFixedMemory(numberOfPlanes);
        planes.addPlanes(a, b, c, d);

        //find plane
        System.out.println("\nSearching plane in the airline:");
        System.out.println(b);
        System.out.println(planes.findPlanes(b));

        //find some planes
        System.out.println("\nSearching planes in the airline:");
        System.out.println(b + "" + d);
        System.out.println(planes.findPlanes(b, d));

        Airline airline = new Airline(planes);
        System.out.println("Total passenger capacity = " + airline.countTotalPassengerCapacity());
        System.out.println("Plane with max passenger capacity: " + airline.getPlaneWithMaxPassengerCapacity());
        System.out.println("Plane with min passenger capacity: " + airline.getPlaneWithMinPassengerCapacity());
    }
}
