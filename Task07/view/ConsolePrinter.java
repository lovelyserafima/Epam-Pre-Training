package by.epam.preTraining.ArthurLyup.tasks.task07.view;

/**
 * ConsolePrinter is the class which prints all results to console.
 *
 * 17 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.Plane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.logic.Airline;


public class ConsolePrinter {
    //constant values
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

    //print planeList
    public static void printPlaneList(PlaneList planeList){
        System.out.println(planeList);
    }

    //print total passenger capacity
    public static void printTotalPassengerCapacityOfPlanes(PlaneList planeList) throws Exception {
        System.out.println("\nTotal passenger capacity = " + Airline.countTotalPassengerCapacity(planeList));
    }

    //print plane with max passenger capacity
    public static void printPlaneWithMaxPassengerCapacity(PlaneList planeList) throws Exception {
        System.out.println("Plane with max passenger capacity: "
                + Airline.findPlaneWithMaxPassengerCapacity(planeList));
    }

    //print plane with min passenger capacity
    public static void printPlaneWithMinPassengerCapacity(PlaneList planeList) throws Exception {
        System.out.println("Plane with min passenger capacity: "
                + Airline.findPlaneWithMinPassengerCapacity(planeList));
    }
}
