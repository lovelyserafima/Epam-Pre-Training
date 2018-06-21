package by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.subclasses;

/**
 * CargoPlane is the subclass of Plane with additional parameters:
 * double carryingCapacity
 * double pricePerTone
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task08.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task08.model.entity.plane.Plane;
import java.util.Objects;

public class CargoPlane extends Plane {
    //new fields
    private double carryingCapacity;
    private double pricePerTone;

    //the empty constructor
    public CargoPlane(){
        super();
    }

    //constructor with args
    public CargoPlane(String name, String countryOfProduction, boolean inWorkingCondition, double carryingCapacity,
                      double pricePerTone) {
        super(name, countryOfProduction, inWorkingCondition);
        this.carryingCapacity = carryingCapacity;
        this.pricePerTone = pricePerTone;
    }

    //copy constructor
    public CargoPlane(CargoPlane cargoPlane){
        super(cargoPlane.name, cargoPlane.countryOfProduction, cargoPlane.inWorkingCondition);
        carryingCapacity = cargoPlane.carryingCapacity;
        pricePerTone = cargoPlane.pricePerTone;
    }

    //getters and setters////////////////////////////////////////////////////////////////////////////////////////
    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) throws NegativeNumberException {
        if (carryingCapacity < 0){
            throw new NegativeNumberException("Illegal carrying capacity! It can't be < 0: ", carryingCapacity);
        }
        this.carryingCapacity = carryingCapacity;
    }

    public double getPricePerTone() {
        return pricePerTone;
    }

    public void setPricePerTone(double pricePerTone) throws NegativeNumberException {
        if (pricePerTone < 0){
            throw new NegativeNumberException("Illegal pricePerTone! It can't be < 0: ", pricePerTone);
        }
        this.pricePerTone = pricePerTone;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return Double.compare(that.getCarryingCapacity(), getCarryingCapacity()) == 0 &&
                Double.compare(that.getPricePerTone(), getPricePerTone()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCarryingCapacity(), getPricePerTone());
    }

    @Override
    public String toString(){
        return "CargoPlane{" +
                super.toString() +
                ", carryingCapacity=" + carryingCapacity +
                ", prisePerTone=" + pricePerTone +
                '}';
    }
}
