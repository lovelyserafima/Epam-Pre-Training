package by.epam.preTraining.ArthurLyup.tasks.task07.util;

/**
 * PlaneInitializer is the class which initialize objects of class Plane.
 *
 * 19 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses.CargoPlane;
import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses.PassengerPlane;
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
    private static final double MAX_PRIСE_PER_BUSINESS_CLASS = 1000.0;
    private static final double MAX_PRIСE_PER_ECONOMY_CLASS = 500.0;
    private static final double MAX_CARRYING_CAPACITY = 150.0;
    private static final double MAX_PRICE_PER_TONE = 100.0;

    public static PassengerPlane initPassengerPlane() throws Exception {
        PassengerPlane passengerPlane = new PassengerPlane();
        initCommonPart(passengerPlane);
        passengerPlane.setPassengerCapacity(getRandomInt(0, MAX_PASSENGER_CAPACITY));
        passengerPlane.setPrisePerBusinessClass(getRandomDouble(0, MAX_PRIСE_PER_BUSINESS_CLASS));
        passengerPlane.setPrisePerEconomyClass(getRandomDouble(0, MAX_PRIСE_PER_ECONOMY_CLASS));
        return passengerPlane;
    }

    public static CargoPlane initCargoPlane() throws Exception {
        CargoPlane cargoPlane = new CargoPlane();
        initCommonPart(cargoPlane);
        cargoPlane.setCarryingCapacity(getRandomDouble(0, MAX_CARRYING_CAPACITY));
        cargoPlane.setPrisePerTone(getRandomDouble(0, MAX_PRICE_PER_TONE));
        return cargoPlane;
    }

    private static void initCommonPart (Plane plane){
        plane.setName(namesOfPlanes[getRandomInt(0 , namesOfPlanes.length - CALCULATE_RANDOM)]);
        plane.setCountryOfProduction(countries[getRandomInt(0,
                countries.length - CALCULATE_RANDOM)]);
        plane.setInWorkingCondition(new Random().nextBoolean());
    }

    private static int getRandomInt(int leftBorder, int rightBorder){
        return new Random().nextInt(rightBorder - leftBorder + CALCULATE_RANDOM);
    }

    private static double getRandomDouble(double leftBorder, double rightBorder){
        return new Random().nextDouble()*(rightBorder - leftBorder);
    }
}
