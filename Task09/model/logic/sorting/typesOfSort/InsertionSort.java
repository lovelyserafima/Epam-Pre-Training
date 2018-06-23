package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.typesOfSort;

/**
 * InsertionSort is the class which sorts planelist using insertion sort
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

public class InsertionSort {
    //sort planelist using insertion sort
    public static void sort(PlaneList planeList) throws EmptyContainerException, ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to sort!");
        }
        Plane temp;
        int j;
        int length = planeList.getNumberOfPlanes() - 1;
        for (int i = 0; i < length; i++) {
            if (planeList.getPlaneByIndex(i).compareTo(planeList.getPlaneByIndex(i + 1)) > 0) {
                temp = planeList.getPlaneByIndex(i + 1);
                planeList.setPlaneByIndex(i + 1, planeList.getPlaneByIndex(i));
                j = i;
                while (j > 0 && temp.compareTo(planeList.getPlaneByIndex(j - 1)) < 0) {
                    planeList.setPlaneByIndex(j, planeList.getPlaneByIndex(j - 1));
                    j--;
                }
                planeList.setPlaneByIndex(j, temp);
            }
        }
    }
}
