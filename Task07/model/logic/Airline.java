package by.epam.preTraining.ArthurLyup.tasks.task07.model.logic;

/**
 * Airline is the class of business-logic which solves the following tasks:
 * 1)count total passenger and carrying capacity
 * 2)find planes with max and min passenger and carrying capacities
 *
 * 24 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses.CargoPlane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses.PassengerPlane;

public class Airline {
    private static final int ERROR_CASE = -1;

    //count total passenger capacity
    public static int countTotalPassengerCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
        int totalPassengerCapacity = 0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            if (planeList.getPlaneByIndex(i) instanceof PassengerPlane){
                totalPassengerCapacity += ((PassengerPlane) planeList.getPlaneByIndex(i)).getPassengerCapacity();
            }
        }
        return totalPassengerCapacity;
    }

    //count total carrying capacity
    public static double countTotalCarryingCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
        double totalCarryingCapacity = 0.0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            if (planeList.getPlaneByIndex(i) instanceof CargoPlane){
                totalCarryingCapacity += ((CargoPlane) planeList.getPlaneByIndex(i)).getCarryingCapacity();
            }
        }
        return totalCarryingCapacity;
    }

    //find plane with max passenger capacity
    public static PassengerPlane findPlaneWithMaxPassengerCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
        int indexOfPlaneWithMaxPassengerCapacity = ERROR_CASE;
        int maxPassengerCapacity = 0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            if (planeList.getPlaneByIndex(i) instanceof PassengerPlane){
                if (((PassengerPlane) planeList.getPlaneByIndex(i)).getPassengerCapacity() > maxPassengerCapacity){
                    maxPassengerCapacity = ((PassengerPlane) planeList.getPlaneByIndex(i)).getPassengerCapacity();
                    indexOfPlaneWithMaxPassengerCapacity = i;
                }
            }
        }
        if (indexOfPlaneWithMaxPassengerCapacity != ERROR_CASE) {
            return (PassengerPlane) planeList.getPlaneByIndex(indexOfPlaneWithMaxPassengerCapacity);
        } else {
            return null;
        }
    }

    //find plane with min passenger capacity
    public static PassengerPlane findPlaneWithMinPassengerCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
        int indexOfPlaneWithMinPassengerCapacity = ERROR_CASE;
        int minPassengerCapacity = Integer.MAX_VALUE;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            if (planeList.getPlaneByIndex(i) instanceof PassengerPlane){
                if (((PassengerPlane) planeList.getPlaneByIndex(i)).getPassengerCapacity() < minPassengerCapacity){
                    minPassengerCapacity = ((PassengerPlane) planeList.getPlaneByIndex(i)).getPassengerCapacity();
                    indexOfPlaneWithMinPassengerCapacity = i;
                }
            }
        }
        if (indexOfPlaneWithMinPassengerCapacity != ERROR_CASE) {
            return (PassengerPlane) planeList.getPlaneByIndex(indexOfPlaneWithMinPassengerCapacity);
        } else {
            return null;
        }
    }

    //find plane with max carrying capacity
    public static CargoPlane findPlaneWithMaxCarryingCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
        int indexOfPlaneWithMaxCarryingCapacity = ERROR_CASE;
        double maxCarryingCapacity = 0.0;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            if (planeList.getPlaneByIndex(i) instanceof CargoPlane){
                if (((CargoPlane) planeList.getPlaneByIndex(i)).getCarryingCapacity() > maxCarryingCapacity){
                    maxCarryingCapacity = ((CargoPlane) planeList.getPlaneByIndex(i)).getCarryingCapacity();
                    indexOfPlaneWithMaxCarryingCapacity = i;
                }
            }
        }
        if (indexOfPlaneWithMaxCarryingCapacity != ERROR_CASE) {
            return (CargoPlane) planeList.getPlaneByIndex(indexOfPlaneWithMaxCarryingCapacity);
        } else {
            return null;
        }
    }

    //find plane with min passenger capacity
    public static CargoPlane findPlaneWithMinCarryingCapacity(PlaneList planeList) throws EmptyContainerException,
            ContainerIndexOutOfBoundsException {
        if (planeList.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
        int indexOfPlaneWithMinCarryingCapacity = ERROR_CASE;
        double minCarryingCapacity = Double.MAX_VALUE;
        int numberOfPlanes = planeList.getNumberOfPlanes();
        for (int i = 0; i < numberOfPlanes; i++){
            if (planeList.getPlaneByIndex(i) instanceof CargoPlane){
                if (((CargoPlane) planeList.getPlaneByIndex(i)).getCarryingCapacity() < minCarryingCapacity){
                    minCarryingCapacity = ((CargoPlane) planeList.getPlaneByIndex(i)).getCarryingCapacity();
                    indexOfPlaneWithMinCarryingCapacity = i;
                }
            }
        }
        if (indexOfPlaneWithMinCarryingCapacity != ERROR_CASE) {
            return (CargoPlane) planeList.getPlaneByIndex(indexOfPlaneWithMinCarryingCapacity);
        } else {
            return null;
        }
    }
}
