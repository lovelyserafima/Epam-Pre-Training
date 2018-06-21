package by.epam.preTraining.ArthurLyup.tasks.task09.exceptions;

/**
 * NotNaturalNumber is a class-exception which throws the exception when user tries to work not with a natural number.
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

public class NotNaturalNumberException extends Exception {
    private int number;

    public NotNaturalNumberException(String msg, int number){
        super(msg);
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
