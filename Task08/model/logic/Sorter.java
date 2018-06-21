package by.epam.preTraining.ArthurLyup.tasks.task08.model.logic;

/**
 * Sorter is the class of business-logic which sorts planes by names using different types of sort.
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.logic.typesOfSort.SelectionSort;

public class Sorter {
    //sort planelist by name
    public static void sortPlanesByNameUsingSelectionSort(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        checkEmpty(planeList);
        SelectionSort.sort(planeList);
    }

    //check whether container is empty
    private static void checkEmpty(PlaneList planeList) throws EmptyContainerException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("Container is empty!");
        }
    }
}
