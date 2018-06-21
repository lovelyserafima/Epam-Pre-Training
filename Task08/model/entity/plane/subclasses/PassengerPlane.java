package by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.subclasses;

/**
 * PassengerPlane is the subclass of Plane with additional parameters:
 * int passengerCapacity
 * double pricePerBusinessClass
 * double pricePerEconomyClass
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.Plane;
import java.util.Objects;

public class PassengerPlane extends Plane {
    //fields
    private int passengerCapacity;
    private double pricePerBusinessClass;
    private double pricePerEconomyClass;

    //the empty constructor
    public PassengerPlane(){
        super();
    }

    //constructor with args
    public PassengerPlane(String name, String countryOfProduction, boolean inWorkingCondition, int passengerCapacity,
                          double pricePerBusinessClass, double pricePerEconomyClass) {
        super(name, countryOfProduction, inWorkingCondition);
        this.passengerCapacity = passengerCapacity;
        this.pricePerBusinessClass = pricePerBusinessClass;
        this.pricePerEconomyClass = pricePerEconomyClass;
    }

    //copy constructor
    public PassengerPlane(PassengerPlane passengerPlane){
        super(passengerPlane.name, passengerPlane.countryOfProduction, passengerPlane.inWorkingCondition);
        passengerCapacity = passengerPlane.passengerCapacity;
        pricePerBusinessClass = passengerPlane.pricePerBusinessClass;
        pricePerEconomyClass = passengerPlane.pricePerEconomyClass;
    }

    //getters and setters///////////////////////////////////////////////////////////////////////////////////////////////

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) throws NegativeNumberException {
        if (passengerCapacity < 0){
            throw new NegativeNumberException("Illegal passenger capacity! It can't be < 0: ", passengerCapacity);
        }
        this.passengerCapacity = passengerCapacity;
    }

    public double getPricePerBusinessClass() {
        return pricePerBusinessClass;
    }

    public void setPricePerBusinessClass(double pricePerBusinessClass) throws NegativeNumberException {
        if (pricePerBusinessClass < 0){
            throw new NegativeNumberException("Illegal pricePerBusinessClass! It can't be < 0: ",
                    pricePerBusinessClass);
        }
        this.pricePerBusinessClass = pricePerBusinessClass;
    }

    public double getPricePerEconomyClass() {
        return pricePerEconomyClass;
    }

    public void setPricePerEconomyClass(double pricePerEconomyClass) throws NegativeNumberException {
        if (pricePerEconomyClass < 0){
            throw new NegativeNumberException("Illegal prisePerEconomyClass! It can't be < 0: ", pricePerEconomyClass);
        }
        this.pricePerEconomyClass = pricePerEconomyClass;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return getPassengerCapacity() == that.getPassengerCapacity() &&
                Double.compare(that.getPricePerBusinessClass(), getPricePerBusinessClass()) == 0 &&
                Double.compare(that.getPricePerEconomyClass(), getPricePerEconomyClass()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPassengerCapacity(), getPricePerBusinessClass(),
                getPricePerEconomyClass());
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                super.toString() +
                ", passengerCapacity=" + passengerCapacity +
                ", pricePerBusinessClass=" + pricePerBusinessClass +
                ", pricePerEconomyClass=" + pricePerEconomyClass +
                '}';
    }
}
