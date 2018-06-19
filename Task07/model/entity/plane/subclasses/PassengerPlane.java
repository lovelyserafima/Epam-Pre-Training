package by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses;

/**
 * PassengerPlane is the subclass of Plane with additional parameters.
 *
 * 19 June 2018
 * @author Arthur Lyup
 */


import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;

import java.util.Objects;

public class PassengerPlane extends Plane {
    //fields
    private int passengerCapacity;
    private double prisePerBusinessClass;
    private double prisePerEconomyClass;

    //the empty constructor
    public PassengerPlane(){
        super();
    }

    //constructor with args
    public PassengerPlane(String name, String countryOfProduction, boolean inWorkingCondition, int passengerCapacity,
                          double prisePerBusinessClass, double prisePerEconomyClass) {
        super(name, countryOfProduction, inWorkingCondition);
        this.passengerCapacity = passengerCapacity;
        this.prisePerBusinessClass = prisePerBusinessClass;
        this.prisePerEconomyClass = prisePerEconomyClass;
    }

    //copy constructor
    public PassengerPlane(PassengerPlane passengerPlane){
        super(passengerPlane.name, passengerPlane.countryOfProduction, passengerPlane.inWorkingCondition);
        passengerCapacity = passengerPlane.passengerCapacity;
        prisePerBusinessClass = passengerPlane.prisePerBusinessClass;
        prisePerEconomyClass = passengerPlane.prisePerEconomyClass;
    }

    //getters and setters

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getPrisePerBusinessClass() {
        return prisePerBusinessClass;
    }

    public void setPrisePerBusinessClass(double prisePerBusinessClass) {
        this.prisePerBusinessClass = prisePerBusinessClass;
    }

    public double getPrisePerEconomyClass() {
        return prisePerEconomyClass;
    }

    public void setPrisePerEconomyClass(double prisePerEconomyClass) {
        this.prisePerEconomyClass = prisePerEconomyClass;
    }

    //////////////////////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return getPassengerCapacity() == that.getPassengerCapacity() &&
                Double.compare(that.getPrisePerBusinessClass(), getPrisePerBusinessClass()) == 0 &&
                Double.compare(that.getPrisePerEconomyClass(), getPrisePerEconomyClass()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPassengerCapacity(), getPrisePerBusinessClass(),
                getPrisePerEconomyClass());
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                super.toString() +
                ", passengerCapacity=" + passengerCapacity +
                ", prisePerBusinessClass=" + prisePerBusinessClass +
                ", prisePerEconomyClass=" + prisePerEconomyClass +
                '}';
    }
}
