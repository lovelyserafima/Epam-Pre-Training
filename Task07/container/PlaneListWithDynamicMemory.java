/*package by.epam.preTraining.ArthurLyup.tasks.task07.container;

*//**
 * PlaneListWithDynamicMemory is the class-container with dynamic memory
 *
 * 15 June 2018
 * @author Arthur Lyup
 *//*

import by.epam.preTraining.ArthurLyup.tasks.task07.entities.Plane;

public class PlaneListWithDynamicMemory {
    //array of planes and size of current number of planes
    private Plane[] planes;
    private int size = 0;
    //constant values
    private static int DEFAULT_MEMORY = 10;
    private static int GET_NEXT_ELEMENT = 1;
    private static int CALCULATING_HASH_CODE = 31;

    //constructor with no args
    public PlaneListWithDynamicMemory(){
        planes = new Plane[DEFAULT_MEMORY];
    }

    //constructor with size
    public PlaneListWithDynamicMemory(int size){
        if (size > 0) {
            planes = new Plane[size];
        }
    }

    //copy constructor
    public PlaneListWithDynamicMemory(PlaneListWithDynamicMemory planeList) {
        planes = planeList.planes;
        size = planeList.size;
    }

    //get-methods
    public Plane[] getPlanes() {
        return planes;
    }

    public int getSize() {
        return size;
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

        }
        for (int i = 0; i < planes.length; i++){
            this.planes[size + i] = planes[i];
        }
        size += planes.length;
    }
}*/
