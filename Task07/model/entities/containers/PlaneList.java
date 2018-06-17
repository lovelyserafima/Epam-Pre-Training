package by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.containers;

/**
 * PlaneListWithFixedMemory is the class-container of planes builded on arrays with fixed memory.
 *
 * 16 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.Plane;
import java.util.Arrays;
import java.util.Objects;

public class PlaneList {
    protected Plane[] planes;//array of planes
    protected int numberOfPlanes = 0;//current number of planes in array
    //constant values
    private static final int DEFAULT_MEMORY = 10;
    protected static final int CALCULATING_HASH_CODE = 31;
    protected static final int GET_NEXT_OR_PREVIOUS_PLANE = 1;
    protected static final String ERROR_CASE = "-1 ";

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

    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    /////////////////////////////////////////////////////

    //add planes
    public void addPlanes(Plane... planes) throws Exception {
        checkMemory(this, planes);
        for (int i = 0; i < planes.length; i++){
            this.planes[numberOfPlanes + i] = planes[i];
        }
        numberOfPlanes += planes.length;
    }

    //exception method: check whether is enough memory to add planes
    private static void checkMemory(PlaneList planeList, Plane... planes) throws Exception {
        if (planeList.planes.length - planeList.numberOfPlanes < planes.length){
            throw new Exception("Not enough memory to add planes! Select more memory");
        }
    }

    //check whether the container is empty
    public boolean isEmpty(){
        return numberOfPlanes == 0;
    }

    //get plane by index
    public Plane getPlaneByIndex(int index) throws Exception {
        checkEmpty(this);
        checkContainerIndexOutOfBounds(this, index);
        return planes[index];
    }

    public void deletePlaneByIndex(int index) throws Exception {
        checkEmpty(this);
        checkContainerIndexOutOfBounds(this, index);
        int length = numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE;
        for (int i = index; i < length; i++){
            planes[i] = planes[i + GET_NEXT_OR_PREVIOUS_PLANE];
        }
    }

    public void clearAll() throws Exception {
        checkEmpty(this);
        planes = null;
        numberOfPlanes = 0;
    }

    public String findPlanes(Plane... planes) throws Exception {
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
        String result = "\nPlaneList:\n";
        for (int i = 0; i < numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE; i++){
            result += planes[i] + ",\n";
        }
        result += planes[numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE] + ",\nnumber of planes = " + numberOfPlanes + ".";
        return result;
    }

    //exception method: check whether the container is empty
    private static void checkEmpty(PlaneList planeList) throws Exception {
        if (planeList.isEmpty()){
            throw new Exception("The container is empty!");
        }
    }

    //exception method: checks whether index out of bounds
    private static void checkContainerIndexOutOfBounds(PlaneList planeList, int index) throws Exception {
        if (index < 0 || index > planeList.numberOfPlanes - GET_NEXT_OR_PREVIOUS_PLANE){
            throw new Exception("Container index out of bounds!");
        }
    }
}
