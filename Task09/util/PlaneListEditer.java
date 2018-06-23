package by.epam.preTraining.ArthurLyup.tasks.task09.util;

/**
 * PlaneListEditer is the class for deleting and adding planes anew.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.NoMemoryException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

public class PlaneListEditer {
    public static void makePlaneListReadyForSort(PlaneList planeList, int numberOfPlanes, Plane... planes) throws
            EmptyContainerException, NoMemoryException {
        planeList.clearAll();
        planeList = new PlaneList(numberOfPlanes);
        planeList.addPlanes(planes);
    }
}
