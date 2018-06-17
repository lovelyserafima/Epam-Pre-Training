package by.epam.preTraining.ArthurLyup.tasks.task07.controller;

/**
 * Task07 is the class-tester which tests class of business logic and different events.
 *
 * 18 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.Plane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.containers.PlaneListWithDynamicMemory;
import by.epam.preTraining.ArthurLyup.tasks.task07.util.PlaneInitializer;
import by.epam.preTraining.ArthurLyup.tasks.task07.view.ConsolePrinter;

public class Task07 {
    public static void main(String[] args) throws Exception {
        //initializations of planes
        Plane plane1 = PlaneInitializer.initPlane();
        Plane plane2 = PlaneInitializer.initPlane();
        Plane plane3 = PlaneInitializer.initPlane();

        //printing planes
        ConsolePrinter.printPlanes(plane1, plane2, plane3);

        //testing container with fixed memory

        int size = 3;
        PlaneList planeList = new PlaneList(size);
        planeList.addPlanes(plane1, plane2, plane3);
        ConsolePrinter.printPlaneList(planeList);

        //testing business-logic
        ConsolePrinter.printTotalPassengerCapacityOfPlanes(planeList);
        ConsolePrinter.printPlaneWithMaxPassengerCapacity(planeList);
        ConsolePrinter.printPlaneWithMinPassengerCapacity(planeList);

        //////////////////////////////////////////////////////////////
        //testing container with dynamic memory

        //initializations of planes
        Plane plane4 = PlaneInitializer.initPlane();
        Plane plane5 = PlaneInitializer.initPlane();
        Plane plane6 = PlaneInitializer.initPlane();
        Plane plane7 = PlaneInitializer.initPlane();
        Plane plane8 = PlaneInitializer.initPlane();
        Plane plane9 = PlaneInitializer.initPlane();
        Plane plane10 = PlaneInitializer.initPlane();
        Plane plane11 = PlaneInitializer.initPlane();

        //printing planes
        ConsolePrinter.printPlanes(plane1, plane2, plane3, plane4, plane5, plane6, plane7, plane8, plane9, plane10,
                plane11);

        //container with dynamic memory
        PlaneListWithDynamicMemory planeListWithDynamicMemory = new PlaneListWithDynamicMemory();
        planeListWithDynamicMemory.addPlanes(plane1, plane2, plane3, plane4, plane5, plane6, plane7, plane8, plane9,
                plane10, plane11);
        ConsolePrinter.printPlaneList(planeListWithDynamicMemory);

        //testing business-logic
        ConsolePrinter.printTotalPassengerCapacityOfPlanes(planeListWithDynamicMemory);
        ConsolePrinter.printPlaneWithMaxPassengerCapacity(planeListWithDynamicMemory);
        ConsolePrinter.printPlaneWithMinPassengerCapacity(planeListWithDynamicMemory);

        //testing special events

        //test1
        int badValue = -50;
        plane1.setPassengerCapacity(badValue); //there will be an exception

        //test2
        planeList.addPlanes(plane4);//there will be an exception because size of planeList is 3

        //test3
        int badIndex = 3;
        planeList.getPlaneByIndex(badIndex);//there will be an exception because planeList has only [0, 1, 2]

        //test4
        planeList.deletePlaneByIndex(badIndex);//there will be an exception because planeList has only [0, 1, 2]

        //test5
        PlaneList planeList1 = new PlaneList();
        planeList1.clearAll();//there will be an exception because it is empty already

        //test6
        ConsolePrinter.printPlaneList(planeList1);//there will be an exception because it is empty

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //testing findPlanes
        ConsolePrinter.printIndexesOfPlanesWhichWereFound(planeList, plane2, plane1, plane10);
    }
}
