package by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers;

/**
 * PlaneList is the class-container builded on arrays with fixed memory and implements interface Editable. It has
 * following functional:
 * 1)add planes
 * 2)get current number of planes
 * 3)check whether planelist is empty
 * 4)get plane by index
 * 5)delete plane by index
 * 6)delete all planes
 * 7)find planes in planelist
 *
 * 20 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.ContainerIndexOutOfBoundsException;
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.EmptyContainerException;
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task07.exception.NoMemoryException;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;
import java.util.Arrays;
import java.util.Objects;

public class PlaneList implements Editable {
    protected Plane[] planes;//array of planes
    protected int numberOfPlanes = 0;//current number of planes in array
    //constant values
    private static final int DEFAULT_MEMORY = 10;

    //constructor with no args
    public PlaneList(){
        planes = new Plane[DEFAULT_MEMORY];
    }

    //constructor with specific memory
    public PlaneList(int size) {
        planes = new Plane[size];
    }

    //constructor with two args
    public PlaneList(Plane[] planes, int numberOfPlanes) {
        this.planes = planes;
        this.numberOfPlanes = numberOfPlanes;
    }

    //copy constructor
    public PlaneList(PlaneList planeList){
        planes = planeList.planes;
        numberOfPlanes = planeList.numberOfPlanes;
    }

    //getters and setters

    public Plane[] getPlanes() {
        return planes;
    }

    public void setPlanes(Plane[] planes) {
        this.planes = planes;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public void setNumberOfPlanes(int numberOfPlanes) throws NegativeNumberException {
        if (numberOfPlanes < 0){
            throw new NegativeNumberException("Number of planes can't be < 0!: ", numberOfPlanes);
        }
        this.numberOfPlanes = numberOfPlanes;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    //add planes
    public void addPlanes(Plane... planes) throws NoMemoryException {
        checkMemory(this, planes);//enough memory
        for (int i = 0; i < planes.length; i++){
            this.planes[numberOfPlanes + i] = planes[i];
        }
        numberOfPlanes += planes.length;
    }

    //exception method: check whether is enough memory to add planes
    private static void checkMemory(PlaneList planeList, Plane... planes) throws NoMemoryException {
        if (planeList.planes.length - planeList.numberOfPlanes < planes.length){
            throw new NoMemoryException("Not enough memory to add planes! ", planeList.planes.length
                    - planeList.numberOfPlanes, planes.length);
        }
    }

    //check whether the container is empty
    public boolean isEmpty(){
        return numberOfPlanes == 0;
    }

    //get plane by index
    public Plane getPlaneByIndex(int index) throws EmptyContainerException, ContainerIndexOutOfBoundsException {
        checkEmpty(this);
        checkContainerIndexOutOfBounds(this, index);//legal indexes
        return planes[index];
    }

    //delete plane by index
    public void deletePlaneByIndex(int index) throws EmptyContainerException, ContainerIndexOutOfBoundsException {
        checkEmpty(this);
        checkContainerIndexOutOfBounds(this, index);//legal indexes
        int length = numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE;
        for (int i = index; i < length; i++){
            planes[i] = planes[i + GET_NEXT_OR_PREVIOUS_PLANE];
        }
    }

    //clears all planes
    public void clearAll() throws EmptyContainerException {
        checkEmpty(this);
        planes = null;
        numberOfPlanes = 0;
    }

    //find whether planes entered are in planelist
    public String findPlanes(Plane... planes) throws EmptyContainerException {
        checkEmpty(this);
        String indexesResultsOfSearching = "";
        for (int i = 0; i < planes.length; i++){
            String index = ERROR_CASE;
            for (int j = 0; j < numberOfPlanes; j++){
                if (this.planes[j].equals(planes[i])){
                    index = j + " ";
                    break;
                }
            }
            indexesResultsOfSearching += index;
        }
        return indexesResultsOfSearching;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaneList)) return false;
        PlaneList planeList = (PlaneList) o;
        return getNumberOfPlanes() == planeList.getNumberOfPlanes() &&
                Arrays.equals(getPlanes(), planeList.getPlanes());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNumberOfPlanes());
        result = CALCULATING_HASH_CODE * result + Arrays.hashCode(getPlanes());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPlaneList:\n");
        for (int i = 0; i < numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE; i++){
            sb.append(planes[i]);
            sb.append(",\n");
        }
        sb.append(planes[numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE]);
        sb.append(",\nnumber of planes = ");
        sb.append(numberOfPlanes);
        return sb.toString();
    }

    //exception method: check whether the container is empty
    protected static void checkEmpty(PlaneList planeListWithFixedMemory) throws EmptyContainerException {
        if (planeListWithFixedMemory.isEmpty()){
            throw new EmptyContainerException("The container is empty!");
        }
    }

    //exception method: checks whether index out of bounds
    protected static void checkContainerIndexOutOfBounds(PlaneList planeListWithFixedMemory, int index)
            throws ContainerIndexOutOfBoundsException {
        if (index < 0 || index > planeListWithFixedMemory.numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE){
            throw new ContainerIndexOutOfBoundsException("Container index out of bounds!: ", index);
        }
    }
}
