package by.epam.preTraining.ArthurLyup.tasks.task09.view;

/**
 * ConsoleWriter is the class which prints results to console.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

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

    //check whether planelist is empty
    private static boolean checkEmpty(PlaneList planeList){
        return planeList.isEmpty();
    }
}
