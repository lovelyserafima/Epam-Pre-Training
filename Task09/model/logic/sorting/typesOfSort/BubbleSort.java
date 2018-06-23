package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.typesOfSort;

/**
 * BubbleSort is the class which sorts planelist using bubble sort
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

public class BubbleSort {
    //sort planelist using bubble sort
    public static void sort(PlaneList planeList) throws EmptyContainerException, ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to sort!");
        }
        boolean isSorted = false;
        int length = planeList.getNumberOfPlanes() - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < length; i++) {
                if(planeList.getPlaneByIndex(i).compareTo(planeList.getPlaneByIndex(i + 1)) > 0){
                    isSorted = false;
                    swap(planeList, i, i + 1);
                }
            }
        }
    }

    //swap two elements
    private static void swap(PlaneList planeList, int index1, int index2) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        Plane tmp = planeList.getPlaneByIndex(index1);
        planeList.setPlaneByIndex(index1, planeList.getPlaneByIndex(index2));
        planeList.setPlaneByIndex(index2, tmp);
    }
}
