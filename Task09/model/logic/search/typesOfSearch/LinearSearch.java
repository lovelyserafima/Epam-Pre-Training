package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.search.typesOfSearch;

/**
 * LinearSearch is the class for linear searching plane in planelist.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;


public class LinearSearch {
    //search plane in planelist
    public static String findPlane(PlaneList planeList, Plane plane) throws EmptyContainerException {
        //this realization is already situated in class PlaneList (necessary condition of container)
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty! Nothing to search!");
        }
        return planeList.findPlanes(plane);
    }
}
