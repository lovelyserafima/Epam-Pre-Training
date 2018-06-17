package by.epam.preTraining.ArthurLyup.tasks.task07.util;

/**
 * PlaneInitializer is the class which initialize objects of class Plane.
 *
 * 17 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.model.entities.Plane;
import java.util.Random;

public class PlaneInitializer {
    //constant values
    //array of names
    private static final String[] namesOfPlanes = {"Wright Flyer", "Supermarine Spitfire", "Boeing 787", "Lockheed SR-71",
    "Cirrus SR22", "Learjet 23", "Locked C-130", "Douglas DC-3", "Bleriot X1", "Cessna 172", "Boeing B2 Superfortress"};
    //array of countries
    private static final String[] countries = {"Belarus", "Russia", "The USA", "China", "Japan", "Canada", "Brazil",
    "Germany", "France", "The UK", "Spain", "Italy", "Denmark", "The Ukraine", "Poland", "Lithuania", "Latvia"};

    private static final int CALCULATE_RANDOM = 1;
    private static final int MAX_PASSENGER_CAPACITY = 1000;
    private static final double MAX_CARRYING_CAPACITY = 150.0;

    public static Plane initPlane() throws Exception {
        Plane plane = new Plane();
        plane.setName(namesOfPlanes[getRandomInt(0, namesOfPlanes.length - CALCULATE_RANDOM)]);
        plane.setPassengerCapacity(getRandomInt(0, MAX_PASSENGER_CAPACITY));
        plane.setCarryingCapacity(getRandomDouble(0, MAX_CARRYING_CAPACITY));
        plane.setCountryOfProduction(countries[getRandomInt(0,
                countries.length - CALCULATE_RANDOM)]);
        plane.setInWorkingCondition(new Random().nextBoolean());
        return plane;
    }

    private static int getRandomInt(int leftBorder, int rightBorder){
        return new Random().nextInt(rightBorder - leftBorder + CALCULATE_RANDOM);
    }

    private static double getRandomDouble(double leftBorder, double rightBorder){
        return new Random().nextDouble()*(rightBorder - leftBorder);
    }
}
