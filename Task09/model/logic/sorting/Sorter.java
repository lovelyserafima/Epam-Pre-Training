package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting;

/**
 * Sorter is class of business-logic which sorts planelist using different types of sort.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task09.model.logic.sorting.typesOfSort.*;

public class Sorter {
    //sort planes by name using bubble sort
    public static void sortPlanesByNameUsingBubbleSort(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("Nothing to sort! PlaneList is empty.");
        }
        BubbleSort.sort(planeList);
    }

    //sort planes by name using insertion sort
    public static void sortPlanesByNameUsingInsertionSort(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("Nothing to sort! PlaneList is empty.");
        }
        InsertionSort.sort(planeList);
    }

    //sort planes by name using selection sort
    public static void sortPlanesByNameUsingSelectionSort(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("Nothing to sort! PlaneList is empty.");
        }
        SelectionSort.sort(planeList);
    }

    //sort planes by name using merge sort
    public static PlaneList sortPlanesByNameUsingMergeSort(PlaneList planeList1, PlaneList planeList2) throws
            EmptyContainerException, ContainerIndexOutOfBoundsException, NegativeNumberException {
        if (planeList1.isEmpty() || planeList2.isEmpty()){
            throw new EmptyContainerException("Nothing to sort! PlaneLists is empty.");
        }
        return MergeSort.sort(planeList1, planeList2);
    }

    //sort planes by name quick selection sort
    public static void sortPlanesByNameUsingQuickSort(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("Nothing to sort! PlaneList is empty.");
        }
        QuickSort.sort(planeList);
    }
}
