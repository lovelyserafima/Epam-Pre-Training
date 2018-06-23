package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.search.typesOfSearch;

/**
 * BinarySearch is the class which search plane in planelist using binary search
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

public class BinarySearch {
    //constant values
    private static final int ERROR_CASE = -1;
    //search plane in planelist
    public static int findPlane(PlaneList planeList, Plane plane) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to find!");
        }
        int i = ERROR_CASE;
        int low = 0, high = planeList.getNumberOfPlanes(), mid;
        while (low < high) {
            mid = (low + high) >>> 1;
            if (plane.compareTo(planeList.getPlaneByIndex(mid)) == 0) {
                i = mid;
                break;
            } else if (plane.compareTo(planeList.getPlaneByIndex(mid)) < 0) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return i;
    }
}
