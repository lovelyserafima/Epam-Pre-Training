package by.epam.preTraining.ArthurLyup.tasks.task07.business_logic;

/**
 * Airline is the class of business logic which solves following tasks:
 * 1)makes the airline
 * 2)count gather passenger capacity and carrying capacity
 * 3)find planes with max and min passenger capacity and carrying capacity
 *
 * 15 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.container.PlaneListWithFixedMemory;
import by.epam.preTraining.ArthurLyup.tasks.task07.entities.Plane;
import java.util.Objects;

public class Airline {
    //fields of airline
    private PlaneListWithFixedMemory planes;

    //constant values
    private static int DEFAULT_MEMORY = 10;
    private static int GET_FIRST_ELEMENT = 1;
    //constructor with no args
    public Airline(){
        planes = new PlaneListWithFixedMemory(DEFAULT_MEMORY);
    }

    //constructor with planelist
    public Airline(PlaneListWithFixedMemory planes) {
        this.planes = planes;
    }

    //copy constructor
    public Airline(Airline airline){
        planes = airline.planes;
    }

    //getter
    public PlaneListWithFixedMemory getPlanes() {
        return planes;
    }

    //setter
    public void setPlanes(PlaneListWithFixedMemory planes) {
        this.planes = planes;
    }

    //count total passenger capacity
    public int countTotalPassengerCapacity() throws Exception {
        checkNumberOfPlanes();
        int totalPassengerCapacity = 0;
        for (int i = 0; i < planes.getSize(); i++){
            totalPassengerCapacity += planes.getByIndex(i).getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }

    //find plane with max passenger capacity
    public Plane getPlaneWithMaxPassengerCapacity() throws Exception {
        checkNumberOfPlanes();
        Plane result = planes.getByIndex(0);
        for (int i = GET_FIRST_ELEMENT; i < planes.getSize(); i++){
            if (planes.getByIndex(i).getPassengerCapacity() > result.getPassengerCapacity()){
                result = planes.getByIndex(i);
            }
        }
        return result;
    }

    //find plane with min passenger capacity
    public Plane getPlaneWithMinPassengerCapacity() throws Exception {
        checkNumberOfPlanes();
        Plane result = planes.getByIndex(0);
        for (int i = GET_FIRST_ELEMENT; i < planes.getSize(); i++){
            if (planes.getByIndex(i).getPassengerCapacity() < result.getPassengerCapacity()){
                result = planes.getByIndex(i);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "planes=" + planes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(getPlanes(), airline.getPlanes());
    }

    @Override
    public int hashCode() {
       return Objects.hash(getPlanes());
    }

    private void checkNumberOfPlanes() throws Exception {
        if (planes.isEmpty()){
            throw new Exception("The airline is empty!");
        }
    }
}
