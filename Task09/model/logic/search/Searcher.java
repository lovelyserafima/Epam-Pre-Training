package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.search;

/**
 * LinearSearch is the class which searchs plane using different types of searching.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.search.typesOfSearch.BinarySearch;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.search.typesOfSearch.LinearSearch;

public class Searcher {
    //search plane using linear search
    public static String findPlaneUsingLinearSearch(PlaneList planeList, Plane plane) throws EmptyContainerException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to search");
        }
        return LinearSearch.findPlane(planeList, plane);
    }

    //search plane using binary search
    public static int findPlaneUsingBinarySearch(PlaneList planeList, Plane plane) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to search");
        }
        return BinarySearch.findPlane(planeList, plane);
    }
}
