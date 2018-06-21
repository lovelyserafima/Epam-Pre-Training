package by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.containers;

/**
 * Editable is interface which has method for adding planes to different types of containers and clearing all
 * information in planelists. Also it has some constants for some events.
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.NoMemoryException;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.Plane;

public interface Editable {
    //constant values
    int CALCULATING_HASH_CODE = 31;
    int GET_NEXT_OR_PREVIOUS_PLANE = 1;
    String ERROR_CASE = "-1 ";
    //methods
    void addPlanes(Plane... planes) throws NoMemoryException;
    void clearAll() throws EmptyContainerException;
}