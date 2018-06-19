package by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers;

import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;

import java.util.Arrays;
import java.util.Objects;

/**
 * PlaneListWithDynamicMemory is the class-container of planes builded on arrays with dynamic memory and implements
 * interface editable.
 *
 * 19 June 2018
 * @author Arthur Lyup
 */


public class PlaneListWithDynamicMemory extends PlaneList implements Editable {
    //new fields
    private int capacity = 10;

    //constant values
    private static final int INC_MEMORY = 2;

    //constructor with no args
    public PlaneListWithDynamicMemory(){
        super();
    }

    //constructor with size
    public PlaneListWithDynamicMemory(int size){
        if (size > capacity){
            this.increaseCapacity();
            this.planes = Arrays.copyOf(planes, capacity);
        } else {
            this.planes = Arrays.copyOf(planes, size);
        }
    }

    //increase capacity if it is need
    private void increaseCapacity(){
        capacity *= INC_MEMORY;
    }

    //constructor with args
    public PlaneListWithDynamicMemory(Plane[] planes, int numberOfPlanes, int capacity){
        super(planes, numberOfPlanes);
        this.capacity = capacity;
    }

    //copy constructor
    public PlaneListWithDynamicMemory(PlaneListWithDynamicMemory planeListWithDynamicMemory){
        super(planeListWithDynamicMemory.planes, planeListWithDynamicMemory.numberOfPlanes);
        this.capacity = planeListWithDynamicMemory.capacity;
    }

    //getters and setters

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws Exception {
        if (capacity < 0){
            throw new Exception("Capacity can't be < 0!");
        }
        this.capacity = capacity;
    }

    ////////////////////////////////////////////////////////////////////

    @Override
    //add planes
    public void addPlanes(Plane... planes){
        if (planes.length > (capacity - numberOfPlanes)){
            increaseCapacity();
            this.planes = Arrays.copyOf(planes, capacity);
        }
        for (int i = 0; i < planes.length; i++){
            this.planes[numberOfPlanes + i] = planes[i];
        }
        numberOfPlanes += planes.length;
    }

    @Override
    //clears all planes
    public void clearAll() throws Exception {
        checkEmpty(this);
        planes = null;
        numberOfPlanes = 0;
        capacity = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaneListWithDynamicMemory)) return false;
        if (!super.equals(o)) return false;
        PlaneListWithDynamicMemory that = (PlaneListWithDynamicMemory) o;
        return getCapacity() == that.getCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCapacity());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        /*for (int i = 0; i < numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE; i++){
            sb.append(planes[i]);
            sb.append(",\n");
        }
        sb.append(planes[numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE]);
        sb.append(",\nnumber of planes = ");
        sb.append(numberOfPlanes);
        sb.append(".");*/
        sb.append(",\ncapacity = ");
        sb.append(capacity);
        return sb.toString();
    }


}