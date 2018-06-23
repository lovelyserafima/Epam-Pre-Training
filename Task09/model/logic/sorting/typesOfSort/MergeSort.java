package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.typesOfSort;

/**
 * MergeSort is the class which sort 2 planelists using merge sort
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;

public class MergeSort {
    public static PlaneList sort(PlaneList planeList1, PlaneList planeList2) throws NegativeNumberException,
            EmptyContainerException, ContainerIndexOutOfBoundsException {
        if (planeList1.isEmpty() || planeList2.isEmpty()){
            throw new EmptyContainerException("Planelists are empty! Nothing to sort!");
        }
        InsertionSort.sort(planeList1);
        InsertionSort.sort(planeList2);
        int length1 = planeList1.getNumberOfPlanes(), length2 = planeList2.getNumberOfPlanes();
        int length3 = length1 + length2;
        PlaneList result = new PlaneList(length1 + length2);
        result.setNumberOfPlanes(length3);
        int i = 0, j = 0;
        int length1WithoutLast1 = length1 - 1;
        int length1WithoutLast2 = length2 - 1;
        for (int k = 0; k < length3; k++) {
            if (i > length1WithoutLast1) {
                result.setPlaneByIndex(k, planeList2.getPlaneByIndex(j));
                j++;
            } else if (j > length1WithoutLast2) {
                result.setPlaneByIndex(k, planeList1.getPlaneByIndex(i));
                i++;
            } else if (planeList1.getPlaneByIndex(i).compareTo(planeList2.getPlaneByIndex(j)) < 0) {
                result.setPlaneByIndex(k, planeList1.getPlaneByIndex(i));
                i++;
            } else {
                result.setPlaneByIndex(k, planeList2.getPlaneByIndex(j));
                j++;
            }
        }
        return result;
    }
}
