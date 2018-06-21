package by.epam.preTraining.ArthurLyup.tasks.task08.controller;

/**
 * Task08 is the class which tests business-logic.
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.NoMemoryException;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.subclasses.CargoPlane;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.subclasses.PassengerPlane;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.logic.Sorter;
import by.epam.preTraining.ArthurLyup.tasks.task08.util.PlaneInitializer;
import by.epam.preTraining.ArthurLyup.tasks.task08.view.ConsoleWriter;

public class Task08 {
    public static void main(String[] args) {
        try {
            //initialization of planes
            PassengerPlane passengerPlane1 = PlaneInitializer.initPassengerPlane();
            CargoPlane cargoPlane1 = PlaneInitializer.initCargoPlane();
            PassengerPlane passengerPlane2 = PlaneInitializer.initPassengerPlane();
            CargoPlane cargoPlane2 = PlaneInitializer.initCargoPlane();
            PassengerPlane passengerPlane3 = PlaneInitializer.initPassengerPlane();
            CargoPlane cargoPlane3 = PlaneInitializer.initCargoPlane();

            //adding them to planelist
            int numberOfPlanes = 6;
            PlaneList planeList = new PlaneList(numberOfPlanes);
            planeList.addPlanes(passengerPlane1, cargoPlane1, passengerPlane2, cargoPlane2, passengerPlane3,
                    cargoPlane3);

            //printing planelist before sorting
            System.out.println("Before sorting:");
            ConsoleWriter.printPlaneList(planeList);

            //printing planelist after sorting by selection sort
            System.out.println("\nAfter selection sorting:");
            Sorter.sortPlanesByNameUsingSelectionSort(planeList);
            ConsoleWriter.printPlaneList(planeList);

        } catch (NegativeNumberException e){
            System.out.println(e.getMessage() + e.getNumber());
        } catch (NoMemoryException e) {
            System.out.println(e.getMessage() + "Available memory = " + e.getAvailableMemory()
                    + ", required memory = " + e.getRequiredMemory());
        } catch (ContainerIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + e.getIndex());
        } catch (EmptyContainerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nThe applications was stopped! Thank you for working with us");
        }
    }
}
