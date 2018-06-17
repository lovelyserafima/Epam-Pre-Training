package by.epam.preTraining.ArthurLyup.tasks.task07.model.logic;

/**
 * Airline is the class of business logic which solves the following tasks:
 * 1)count total passenger capacity
 * 2)find plane with max and min passenger capacity
 *
 * 17 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.Plane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.containers.PlaneListWithDynamicMemory;

public class Airline {
    //constant values
    private static final int ERROR_CASE = -1;
    private static final int FIRST_INDEX_OF_PLANE_LIST = 1;

    //count total passenger capaicity in PlaneList
    public static int countTotalPassengerCapacity(PlaneList planeList) throws Exception {
        isEmpty(planeList);
        int totalPassengerCapacity = 0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            totalPassengerCapacity += planeList.getPlaneByIndex(i).getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }

    //find plane with max passenger capacity
    public static Plane findPlaneWithMaxPassengerCapacity(PlaneList planeList) throws Exception {
        isEmpty(planeList);
        int maxPassengerCapacity = planeList.getPlaneByIndex(0).getPassengerCapacity();
        int indexOfPlaneWithMaxPassengerCapacity = 0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = FIRST_INDEX_OF_PLANE_LIST; i < numberOfPlanes; i++){
            if (maxPassengerCapacity < planeList.getPlaneByIndex(i).getPassengerCapacity()){
                maxPassengerCapacity = planeList.getPlaneByIndex(i).getPassengerCapacity();
                indexOfPlaneWithMaxPassengerCapacity = i;
            }
        }
        return planeList.getPlaneByIndex(indexOfPlaneWithMaxPassengerCapacity);
    }

    //find plane with max passenger capacity
    public static Plane findPlaneWithMinPassengerCapacity(PlaneList planeList) throws Exception {
        isEmpty(planeList);
        int minPassengerCapacity = planeList.getPlaneByIndex(0).getPassengerCapacity();
        int indexOfPlaneWithMinPassengerCapacity = 0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = FIRST_INDEX_OF_PLANE_LIST; i < numberOfPlanes; i++){
            if (minPassengerCapacity > planeList.getPlaneByIndex(i).getPassengerCapacity()){
                minPassengerCapacity = planeList.getPlaneByIndex(i).getPassengerCapacity();
                indexOfPlaneWithMinPassengerCapacity = i;
            }
        }
        return planeList.getPlaneByIndex(indexOfPlaneWithMinPassengerCapacity);
    }

    /*//count total passenger capaicity in PlaneListWithDynamicMemory
    public static int countTotalPassengerCapacity(PlaneListWithDynamicMemory planeListWithDynamicMemory)
            throws Exception {
        if (isEmpty(planeListWithDynamicMemory)){
            return ERROR_CASE;
        }
        int totalPassengerCapacity = 0;
        for (int i = 0; i < planeListWithDynamicMemory.getNumberOfPlanes(); i++){
            totalPassengerCapacity += planeListWithDynamicMemory.getPlaneByIndex(i).getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }*/

    //check whether planelist is empty
    private static void isEmpty(PlaneList planeList) throws Exception {
        if (planeList.isEmpty()){
            throw new Exception("PlaneList is empty!");
        }
    }

    /*//check whether planelistwithdynamic memory is empty
    private static boolean isEmpty(PlaneListWithDynamicMemory planeListWithDynamicMemory){
        return planeListWithDynamicMemory.isEmpty();
    }*/
}
