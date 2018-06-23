package by.epam.preTraining.ArthurLyup.tasks.task09.controller;

/**
 * Task09 is the class-tester which tests business-logic.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.NoMemoryException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.subclasses.CargoPlane;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.subclasses.PassengerPlane;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.Sorter;
import by.epam.preTraining.ArthurLyup.tasks.task09.util.PlaneInitializer;
import by.epam.preTraining.ArthurLyup.tasks.task09.util.PlaneListEditer;
import by.epam.preTraining.ArthurLyup.tasks.task09.view.ConsoleWriter;

public class Task09 {
    public static void main(String[] args) throws NegativeNumberException {
        //initialization of planes
        PassengerPlane passengerPlane1 = PlaneInitializer.initPassengerPlane();
        CargoPlane cargoPlane1 = PlaneInitializer.initCargoPlane();
        PassengerPlane passengerPlane2 = PlaneInitializer.initPassengerPlane();
        CargoPlane cargoPlane2 = PlaneInitializer.initCargoPlane();
        PassengerPlane passengerPlane3 = PlaneInitializer.initPassengerPlane();
        CargoPlane cargoPlane3 = PlaneInitializer.initCargoPlane();

        try {
            //add planes to planelist and printing them
            int numberOfPlanes = 6;
            PlaneList planeList =  new PlaneList(numberOfPlanes);
            planeList.addPlanes(passengerPlane1, passengerPlane2, passengerPlane3, cargoPlane1, cargoPlane2,
                    cargoPlane3);
            System.out.println("Planelist before sort:");
            ConsoleWriter.printPlaneList(planeList);

            //all sorts///////////////////////////////////////////////////////////////////////////////////////////////
            //sort using bubble sort
            System.out.println("\nPlanelist after bubble sort");
            Sorter.sortPlanesByNameUsingBubbleSort(planeList);
            ConsoleWriter.printPlaneList(planeList);

            //clearing and adding
            planeList = PlaneListEditer.makePlaneListReadyForSort(planeList, numberOfPlanes, passengerPlane1,
                    passengerPlane2, passengerPlane3, cargoPlane1, cargoPlane2, cargoPlane3);

            //sort using insertion sort
            Sorter.sortPlanesByNameUsingInsertionSort(planeList);
            System.out.println("\nAfter insertion sort:");
            ConsoleWriter.printPlaneList(planeList);

            //clearing and adding
            planeList = PlaneListEditer.makePlaneListReadyForSort(planeList, numberOfPlanes, passengerPlane1,
                    passengerPlane2, passengerPlane3, cargoPlane1, cargoPlane2, cargoPlane3);

            //sort using selection sort
            Sorter.sortPlanesByNameUsingSelectionSort(planeList);
            System.out.println("\nAfter selection sort:");
            ConsoleWriter.printPlaneList(planeList);

            //clearing and adding
            numberOfPlanes = 3;
            planeList = PlaneListEditer.makePlaneListReadyForSort(planeList, numberOfPlanes, passengerPlane1,
                    cargoPlane1, passengerPlane2);
            PlaneList planeList2 = new PlaneList(numberOfPlanes);
            planeList2.addPlanes(cargoPlane1, cargoPlane2, cargoPlane3);
            System.out.println("\nFirst planelist before merge sort:");
            ConsoleWriter.printPlaneList(planeList);
            System.out.println("\nSecond planelist before merge sort:");
            ConsoleWriter.printPlaneList(planeList2);
            System.out.println("\nResult planelist after merge sort:");
            ConsoleWriter.printPlaneList(Sorter.sortPlanesByNameUsingMergeSort(planeList, planeList2));

            //clearing and adding
            numberOfPlanes = 6;
            planeList = PlaneListEditer.makePlaneListReadyForSort(planeList, numberOfPlanes, passengerPlane1,
                    passengerPlane2, passengerPlane3, cargoPlane1, cargoPlane2, cargoPlane3);

            //sort using quick sort
            Sorter.sortPlanesByNameUsingQuickSort(planeList);
            System.out.println("\nAfter quick sort:");
            ConsoleWriter.printPlaneList(planeList);

            //////////////////////////////////////////////////////////////////////////////////////////////////////////

            //searching///////////////////////////////////////////////////////////////////////////////////////////////
            //linear search
            ConsoleWriter.printResultOfSearchingPlaneUsingLinearSearching(planeList, passengerPlane1);
            //binary search
            ConsoleWriter.printResultOfSearchingPlaneUsingBinarySearching(planeList, passengerPlane1);
        } catch (NoMemoryException e) {
            System.out.println(e.getMessage() + "Available memory = " + e.getAvailableMemory()
                    + ", required memory = " + e.getRequiredMemory());
        } catch (ContainerIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + e.getIndex());
        } catch (EmptyContainerException e) {
            System.out.println(e.getMessage());
        } catch (NegativeNumberException e){
            System.out.println(e.getMessage() + e.getNumber());
        } finally {
            System.out.println("\nThe application was stopped! Thank you for working with us:)");
        }
    }
}
