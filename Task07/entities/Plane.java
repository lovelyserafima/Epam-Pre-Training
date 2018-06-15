package by.epam.preTraining.ArthurLyup.tasks.task07.entities;

/**
 * Plane is the entity class which has information about plane:
 * 1)name
 * 2)passenger capacity
 * 3)carrying capacity
 * 4)country of production
 * 5)weight
 * 6)fuel consumption
 *
 * 15 June 2018
 * @author Arthur Lyup
 */

import java.util.Objects;

public class Plane {
    //fields of plane
    private String name;
    private int passengerCapacity;
    private double carryingCapacity;
    private String countryOfProduction;
    private double weight;
    private double fuelConsumption;

    //constructor with no args
    public Plane(){}

    //constructor with args
    public Plane(String name, int passengerCapacity, double carryingCapacity, String countryOfProduction, double weight,
                 double fuelConsumption) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.carryingCapacity = carryingCapacity;
        this.countryOfProduction = countryOfProduction;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
    }

    //copy constructor
    public Plane(Plane plane){
        this.name = plane.name;
        this.passengerCapacity = plane.passengerCapacity;
        this.carryingCapacity = plane.carryingCapacity;
        this.countryOfProduction = plane.countryOfProduction;
        this.weight = plane.weight;
        this.fuelConsumption = plane.fuelConsumption;
    }

    //get-methods
    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public double getWeight() {
        return weight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    //set-methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPassengerCapacity(int passengerCapacity) throws Exception {
        if (passengerCapacity < 0){
            throw new Exception("Passenger capacity can't be < 0");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) throws Exception {
        if (carryingCapacity < 0){
            throw new Exception("Carrying capacity can't be < 0");
        }
        this.carryingCapacity = carryingCapacity;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public void setWeight(double weight) throws Exception {
        if (weight < 0){
            throw new Exception("Weight can't be < 0");
        }
        this.weight = weight;
    }

    public void setFuelConsumption(double fuelConsumption) throws Exception {
        if (fuelConsumption < 0){
            throw new Exception("Fuel consumption can't be < 0");
        }
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return getPassengerCapacity() == plane.getPassengerCapacity() &&
                Double.compare(plane.getCarryingCapacity(), getCarryingCapacity()) == 0 &&
                Double.compare(plane.getWeight(), getWeight()) == 0 &&
                Double.compare(plane.getFuelConsumption(), getFuelConsumption()) == 0 &&
                Objects.equals(getName(), plane.getName()) &&
                Objects.equals(getCountryOfProduction(), plane.getCountryOfProduction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPassengerCapacity(), getCarryingCapacity(), getCountryOfProduction(),
                getWeight(), getFuelConsumption());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", passenger capacity=" + passengerCapacity +
                ", carrying capacity=" + carryingCapacity +
                ", country of production='" + countryOfProduction + '\'' +
                ", weight=" + weight +
                ", fuel consumption=" + fuelConsumption +
                "\n";
    }
}
