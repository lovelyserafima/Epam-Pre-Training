package by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.containers;

/**
 * PlaneListWithDynamicMemory is the class-container of planes builded on arrays with dynamic memory. It is the child of
 * the class PlaneList, so it has the same functional as PlaneList with some changes: add planes and delete all planes.
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.Plane;
import java.util.Arrays;
import java.util.Objects;


public class PlaneListWithDynamicMemory extends PlaneList {
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

    //getters and setters/////////////////////////////////////////////////////////////

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws NegativeNumberException {
        if (capacity < 0){
            throw new NegativeNumberException("Capacity can't be < 0!: ", capacity);
        }
        this.capacity = capacity;
    }

    ///////////////////////////////////////////////////////////////////////////////////

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
    public void clearAll() throws EmptyContainerException {
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
        sb.append(",\ncapacity = ");
        sb.append(capacity);
        return sb.toString();
    }
}
