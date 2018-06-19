package by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.subclasses;

/**
 * CargoPlane is the subclass of Plane with additional parametres.
 *
 * 19 June 2018
 * @author Arthur Lyup
 */

import by.epam.preTraining.ArthurLyup.tasks.task07.model.entity.plane.Plane;

import java.util.Objects;

public class CargoPlane extends Plane {
    //new fields
    private double carryingCapacity;
    private double prisePerTone;

    //the empty constructor
    public CargoPlane(){
        super();
    }

    //constructor with args
    public CargoPlane(String name, String countryOfProduction, boolean inWorkingCondition, double carryingCapacity,
                      double prisePerTone) {
        super(name, countryOfProduction, inWorkingCondition);
        this.carryingCapacity = carryingCapacity;
        this.prisePerTone = prisePerTone;
    }

    //copy constructor
    public CargoPlane(CargoPlane cargoPlane){
        super(cargoPlane.name, cargoPlane.countryOfProduction, cargoPlane.inWorkingCondition);
        carryingCapacity = cargoPlane.carryingCapacity;
        prisePerTone = cargoPlane.prisePerTone;
    }

    //getters and setters
    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public double getPrisePerTone() {
        return prisePerTone;
    }

    public void setPrisePerTone(double prisePerTone) {
        this.prisePerTone = prisePerTone;
    }
    /////////////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return Double.compare(that.getCarryingCapacity(), getCarryingCapacity()) == 0 &&
                Double.compare(that.getPrisePerTone(), getPrisePerTone()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCarryingCapacity(), getPrisePerTone());
    }

    @Override
    public String toString(){
        return "CargoPlane{" +
                super.toString() +
                ", carryingCapacity=" + carryingCapacity +
                ", prisePerTone=" + prisePerTone +
                '}';
    }
}
