package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.typesOfSort;

/**
 * SelectionSort is the class which sorts planelist by name using selection sort.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

public class SelectionSort {
    private static final int NEXT_OR_PREV = 1;

    //start
    public static void sort(PlaneList planeList) throws EmptyContainerException, ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to sort!");
        }
        sort(planeList, 0);
    }

    //main algorithm
    private static void sort(PlaneList planeList, int left) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (left < planeList.getNumberOfPlanes() - NEXT_OR_PREV){
            swap(planeList, left, findMin(planeList, left));
            sort(planeList, left + NEXT_OR_PREV);
        }
    }

    //find index of min element by name (alphabet)
    private static int findMin(PlaneList planeList, int index) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        int min = index - NEXT_OR_PREV;
        if (index < planeList.getNumberOfPlanes() - NEXT_OR_PREV){
            min = findMin(planeList, index + NEXT_OR_PREV);
        }
        if (planeList.getPlaneByIndex(index).compareTo(planeList.getPlaneByIndex(min)) < 0){
            min = index;
        }
        return min;
    }

    //swap two elements
    private static void swap(PlaneList planeList, int index1, int index2) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        Plane temp = planeList.getPlaneByIndex(index1);
        planeList.setPlaneByIndex(index1, planeList.getPlaneByIndex(index2));
        planeList.setPlaneByIndex(index2, temp);
    }
}