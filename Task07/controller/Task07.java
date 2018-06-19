package by.epam.preTraining.ArthurLyup.tasks.task07.controller;

/**
 * Task07 is the class-tester which tests class of business logic and different events.
 *
 * 19 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers.PlaneList;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.containers.PlaneListWithDynamicMemory;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses.CargoPlane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses.PassengerPlane;
import by.epam.preTraining.ArthurLyup.tasks.task07.util.PlaneInitializer;
import by.epam.preTraining.ArthurLyup.tasks.task07.view.ConsoleWriter;

public class Task07 {
    public static void main(String[] args) throws Exception {
        //initialization of planes
        PassengerPlane passengerPlane1 = PlaneInitializer.initPassengerPlane();
        PassengerPlane passengerPlane2 = PlaneInitializer.initPassengerPlane();
        CargoPlane cargoPlane1 = PlaneInitializer.initCargoPlane();
        CargoPlane cargoPlane2 = PlaneInitializer.initCargoPlane();

        //printing planes
        ConsoleWriter.printPlanes(passengerPlane1, cargoPlane1, passengerPlane2, cargoPlane2);

        //testing planelist with fixed memory/////////////////////////////////////////////

        int size = 5;
        PlaneList planeList = new PlaneList(size);

        //trying to print empty planelist
        ConsoleWriter.printPlaneList(planeList);

        //adding planes to planelist
        planeList.addPlanes(passengerPlane1, cargoPlane1, passengerPlane2, cargoPlane2);
        //printing planelist after adding
        ConsoleWriter.printPlaneList(planeList);

        //testing business-logic
        ConsoleWriter.printTotalPassengerCapacity(planeList);
        ConsoleWriter.printTotalCarryingCapacity(planeList);
        ConsoleWriter.printPlaneWithMaxPassengerCapacity(planeList);
        ConsoleWriter.printPlaneWithMinPassengerCapacity(planeList);
        ConsoleWriter.printPlaneWithMaxCarryingCapacity(planeList);
        ConsoleWriter.printPlaneWithMinCarryingCapacity(planeList);

        //////////////////////////////////////////////////////////////////////////////////

        //testing planelist with dynamic memory
        //initialization of planes
        PassengerPlane passengerPlane3 = PlaneInitializer.initPassengerPlane();
        PassengerPlane passengerPlane4 = PlaneInitializer.initPassengerPlane();
        PassengerPlane passengerPlane5 = PlaneInitializer.initPassengerPlane();
        PassengerPlane passengerPlane6 = PlaneInitializer.initPassengerPlane();
        CargoPlane cargoPlane3 = PlaneInitializer.initCargoPlane();
        CargoPlane cargoPlane4 = PlaneInitializer.initCargoPlane();
        CargoPlane cargoPlane5 = PlaneInitializer.initCargoPlane();
        CargoPlane cargoPlane6 = PlaneInitializer.initCargoPlane();

        PlaneListWithDynamicMemory planeListWithDynamicMemory = new PlaneListWithDynamicMemory();

        //trying to print empty planeListWithDynamicMemory
        ConsoleWriter.printPlaneList(planeListWithDynamicMemory);

        //adding planes
        planeListWithDynamicMemory.addPlanes(passengerPlane1, passengerPlane2, passengerPlane3, passengerPlane4,
                passengerPlane5, passengerPlane6, cargoPlane1, cargoPlane2, cargoPlane3, cargoPlane4, cargoPlane5,
                cargoPlane6);

        //print planelist with dynamic memory
        ConsoleWriter.printPlaneList(planeListWithDynamicMemory);

        //testing business-logic
        ConsoleWriter.printTotalPassengerCapacity(planeListWithDynamicMemory);
        ConsoleWriter.printTotalCarryingCapacity(planeListWithDynamicMemory);
        ConsoleWriter.printPlaneWithMaxPassengerCapacity(planeListWithDynamicMemory);
        ConsoleWriter.printPlaneWithMinPassengerCapacity(planeListWithDynamicMemory);
        ConsoleWriter.printPlaneWithMaxCarryingCapacity(planeListWithDynamicMemory);
        ConsoleWriter.printPlaneWithMinCarryingCapacity(planeListWithDynamicMemory);
    }
}
