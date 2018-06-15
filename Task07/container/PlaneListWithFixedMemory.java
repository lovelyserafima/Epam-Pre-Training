package by.epam.preTraining.ArthurLyup.tasks.task07.container;

/**
 * PlaneList is the class-container builded on arrays with fixed memory.
 *
 * 15 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.entities.Plane;

import java.util.Arrays;
import java.util.Objects;

public class PlaneListWithFixedMemory {
    //array of planes and size of current number of planes
    private Plane[] planes;
    private int size = 0;
    //constant values
    private static int DEFAULT_MEMORY = 10;
    private static int GET_NEXT_ELEMENT = 1;
    private static int CALCULATING_HASH_CODE = 31;

    //constructor with no args
    public PlaneListWithFixedMemory(){
            planes = new Plane[DEFAULT_MEMORY];
    }

    //constructor with specific size
    public PlaneListWithFixedMemory(int size){
        if (size > 0){
            planes = new Plane[size];
        }
    }

    //copy constructor
    public PlaneListWithFixedMemory(PlaneListWithFixedMemory planeList) {
        planes = planeList.planes;
        size = planeList.size;
    }

    //get-methods
    public int getSize(){
        return size;
    }

    public Plane[] getPlanes() {
        return planes;
    }

    //set-methods
    public void setPlanes(Plane[] planes) {
        this.planes = planes;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //add planes
    public void addPlanes(Plane...planes) throws Exception {
        if (planes.length > (this.planes.length - size)){
            throw new Exception("Not enough memory to add planes");
        }
        for (int i = 0; i < planes.length; i++){
            this.planes[size + i] = planes[i];
        }
        size += planes.length;
    }

    //check whether airline is empty
    public boolean isEmpty(){
        return size == 0;
    }

    //get plane by index
    public Plane getByIndex(int index) throws Exception {
        this.checkEmpty();
        this.checkIndexOutOfBounds(index);
        return planes[index];
    }

    //delete plane by index
    public void deleteByIndex(int index) throws Exception {
        this.checkEmpty();
        this.checkIndexOutOfBounds(index);
        for (int i = index; i < size; i++){
            planes[i] = planes[i + GET_NEXT_ELEMENT];
        }
        size--;
    }

    //clear airline
    public void clearAll() throws Exception {
        this.checkEmpty();
        planes = null;
        size = 0;
    }

    //check whether planes are situated in the airline
    public boolean findPlanes(Plane...planes) throws Exception {
        this.checkEmpty();
        boolean flag = false;
        for (int i = 0; i < planes.length; i++){
            flag = false;
            for (int j = 0; j < size; j++){
                if (this.planes[j].equals(planes[i])){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                return flag;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "Nothing to print";
        }
        String result = "PlaneList:\n";
        for (int i = 0; i < size; i++){
            result += planes[i];
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneListWithFixedMemory planeList = (PlaneListWithFixedMemory) o;
        return getSize() == planeList.getSize() &&
                Arrays.equals(getPlanes(), planeList.getPlanes());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSize());
        result = CALCULATING_HASH_CODE * result + Arrays.hashCode(getPlanes());
        return result;
    }

    //check the size of airline
    private void checkEmpty() throws Exception {
        if (size == 0){
            throw new Exception("The airline is empty!");
        }
    }

    //check index valid
    private void checkIndexOutOfBounds(int index) throws Exception {
        if (index > size || index < 0){
            throw new Exception("IndexOutOfBounds");
        }
    }
}
