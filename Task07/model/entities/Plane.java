package by.epam.preTraining.ArthurLyup.tasks.task07.model.entities;

/**
 * Plane is the class-entity which has information about plane.
 *
 * 17 June 2018
 * @author Arthur Lyup
 */

import java.util.Objects;

public class Plane {
    //fields
    private String name;
    private int passengerCapacity;
    private double carryingCapacity;
    private String countryOfProduction;
    private boolean inWorkingCondition;

    public Plane(){}//the empty constructor

    //the constructor with args
    public Plane(String name, int passengerCapacity, double carryingCapacity, String countryOfProduction,
                 boolean inWorkingCondition) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.carryingCapacity = carryingCapacity;
        this.countryOfProduction = countryOfProduction;
        this.inWorkingCondition = inWorkingCondition;
    }

    //copy constructor
    public Plane(Plane plane){
        name = plane.name;
        passengerCapacity = plane.passengerCapacity;
        carryingCapacity = plane.carryingCapacity;
        countryOfProduction = plane.countryOfProduction;
        inWorkingCondition = plane.inWorkingCondition;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) throws Exception {
        if (passengerCapacity < 0){
            throw new Exception("Passenger capacity must be >= 0");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) throws Exception {
        if (carryingCapacity <= 0){
            throw new Exception("Carrying capacity must be >= 0");
        }
        this.carryingCapacity = carryingCapacity;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public boolean isInWorkingCondition() {
        return inWorkingCondition;
    }

    public void setInWorkingCondition(boolean inWorkingCondition) {
        this.inWorkingCondition = inWorkingCondition;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return getPassengerCapacity() == plane.getPassengerCapacity() &&
                Double.compare(plane.getCarryingCapacity(), getCarryingCapacity()) == 0 &&
                isInWorkingCondition() == plane.isInWorkingCondition() &&
                Objects.equals(getName(), plane.getName()) &&
                Objects.equals(getCountryOfProduction(), plane.getCountryOfProduction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPassengerCapacity(), getCarryingCapacity(), getCountryOfProduction(),
                isInWorkingCondition());
    }

    @Override
    public String toString() {
        /*return "Plane{" +
                "name='" + name + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", carryingCapacity=" + carryingCapacity +
                ", countryOfProduction='" + countryOfProduction + '\'' +
                ", inWorkingCondition=" + inWorkingCondition +
                '}';*/
        StringBuilder sb = new StringBuilder();
        sb.append("Plane{");
        sb.append("name='");
        sb.append(name);
        sb.append('\'');
        sb.append(", passengerCapacity=");
        sb.append(passengerCapacity);
        sb.append(", carryingCapacity=");
        sb.append(carryingCapacity);
        sb.append(", countryOfProduction='");
        sb.append(countryOfProduction);
        sb.append('\'');
        sb.append(", inWorkingCondition=");
        sb.append(inWorkingCondition);
        sb.append('}');
        return String.valueOf(sb);
    }
}
