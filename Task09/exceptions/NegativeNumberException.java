package by.epam.preTraining.ArthurLyup.tasks.task09.exceptions;

/**
 * NegativeNumberException is the class-exception which throws exceptions when user tries to set negative value to field
 * which can't be negative theoretically.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

public class NegativeNumberException extends Exception{
    private double number;

    public double getNumber(){
        return number;
    }

    public NegativeNumberException(String msg, double number){
        super(msg);
        this.number = number;
    }
}
