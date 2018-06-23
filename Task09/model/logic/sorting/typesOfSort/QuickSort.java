package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.typesOfSort;

import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane.Plane;

/**
 * QuickSort is the class which sorts planes using quick sort
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

public class QuickSort {
    //constant values
    private static final int GET_MIDDLE = 2;
    //start
    public static void sort(PlaneList planeList) throws EmptyContainerException, ContainerIndexOutOfBoundsException {
        int startIndex = 0;
        int endIndex = planeList.getNumberOfPlanes() - 1;
        doSort(startIndex, endIndex, planeList);
    }

    //main algorithm of sort
    private static void doSort(int start, int end, PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The planelist is empty! Nothing to sort!");
        }
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / GET_MIDDLE;
        while (i < j) {
            while (i < cur && (planeList.getPlaneByIndex(i).compareTo(planeList.getPlaneByIndex(cur)) <= 0)) {
                i++;
            }
            while (j > cur && (planeList.getPlaneByIndex(cur).compareTo(planeList.getPlaneByIndex(j)) <= 0)) {
                j--;
            }
            if (i < j) {
                swap(planeList, i , j);
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        doSort(start, cur, planeList);
        doSort(cur+1, end, planeList);
    }

    //swap to elements
    private static void swap(PlaneList planeList, int index1, int index2) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        Plane tmp = planeList.getPlaneByIndex(index1);
        planeList.setPlaneByIndex(index1, planeList.getPlaneByIndex(index2));
        planeList.setPlaneByIndex(index2, tmp);
    }
}
