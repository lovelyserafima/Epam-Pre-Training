package by.epam.preTraining.ArthurLyup.tasks.task09.model.entity.plane;

/**
 * Plane is the class-entity which has information about plane. It is the superclass for it's children PassengerPlane
 * and CargoPlane.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import java.util.Objects;

public class Plane implements Comparable<Plane> {
    //fields
    protected String name;
    protected String countryOfProduction;
    protected boolean inWorkingCondition;

    public Plane(){}//the empty constructor

    //constructor with args
    public Plane(String name, String countryOfProduction, boolean inWorkingCondition) {
        this.name = name;
        this.countryOfProduction = countryOfProduction;
        this.inWorkingCondition = inWorkingCondition;
    }

    //copy constructor
    public Plane(Plane plane){
        name = plane.name;
        countryOfProduction = plane.countryOfProduction;
        inWorkingCondition = plane.inWorkingCondition;
    }

    //getters and setters/////////////////////////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return isInWorkingCondition() == plane.isInWorkingCondition() &&
                Objects.equals(getName(), plane.getName()) &&
                Objects.equals(getCountryOfProduction(), plane.getCountryOfProduction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCountryOfProduction(), isInWorkingCondition());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", countryOfProduction='" + countryOfProduction + '\'' +
                ", inWorkingCondition=" + inWorkingCondition;
    }

    @Override
    public int compareTo(Plane plane) {
        return this.getName().compareTo(plane.getName());
    }
}
