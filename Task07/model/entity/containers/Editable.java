package by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers;

/**
 * Editable is interface which has methods for add planes to different containers.
 *
 * 19 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;

public interface Editable {
    //constant values
    int CALCULATING_HASH_CODE = 31;
    int GET_NEXT_OR_PREVIOUS_PLANE = 1;
    String ERROR_CASE = "-1 ";
    //methods
    void addPlanes(Plane... planes) throws Exception;
    void clearAll() throws Exception;
}
