package by.epam.preTraining.ArthurLyup.tasks.task07.view;

/**
 * ConsoleWriter is the class which prints results to console.
 *
 * 20 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.logic.Airline;

public class ConsoleWriter {
    //fields
    private static final int GET_PREV_ELEMENT = 1;

    //print planes
    public static void printPlanes(Plane... planes){
        int length = planes.length - GET_PREV_ELEMENT;
        System.out.println();
        for (int i = 0; i < length; i++){
            System.out.print(planes[i] + ",\n");
        }
        System.out.println(planes[length] + ".");
    }

    //print planelist
    public static void printPlaneList(PlaneList planeList){
        if (!planeList.isEmpty()) {
            System.out.println(planeList);
        } else {
            System.out.println("\nNothing to print!");
        }
    }

    //print total passenger capacity
    public static void printTotalPassengerCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (!planeList.isEmpty()){
            System.out.println("\nTotal passenger capacity = " + Airline.countTotalPassengerCapacity(planeList));
        } else {
            System.out.println("\nNothing to do! PlaneList is empty!");
        }
    }

    //print total carrying capacity
    public static void printTotalCarryingCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (!planeList.isEmpty()){
            System.out.println("Total carrying capacity = " + Airline.countTotalCarryingCapacity(planeList));
        } else {
            System.out.println("Nothing to do! PlaneList is empty!");
        }
    }

    //print plane with max passenger capacity
    public static void printPlaneWithMaxPassengerCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (!planeList.isEmpty()){
            System.out.println("Plane with max passenger capacity: "
                    + Airline.findPlaneWithMaxPassengerCapacity(planeList));
        } else {
            System.out.println("Nothing to do! PlaneList is empty!");
        }
    }

    //print plane with min passenger capacity
    public static void printPlaneWithMinPassengerCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (!planeList.isEmpty()){
            System.out.println("Plane with min passenger capacity: "
                    + Airline.findPlaneWithMinPassengerCapacity(planeList));
        } else {
            System.out.println("Nothing to do! PlaneList is empty!");
        }
    }

    //print plane with max carrying capacity
    public static void printPlaneWithMaxCarryingCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (!planeList.isEmpty()){
            System.out.println("Plane with max carrying capacity: "
                    + Airline.findPlaneWithMaxCarryingCapacity(planeList));
        } else {
            System.out.println("Nothing to do! PlaneList is empty!");
        }
    }

    //print plane with min carrying capacity
    public static void printPlaneWithMinCarryingCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (!planeList.isEmpty()){
            System.out.println("Plane with min carrying capacity: "
                    + Airline.findPlaneWithMinCarryingCapacity(planeList));
        } else {
            System.out.println("Nothing to do! PlaneList is empty!");
        }
    }

    //check whether planelist is empty
    private static boolean checkEmpty(PlaneList planeList){
        return planeList.isEmpty();
    }
}
