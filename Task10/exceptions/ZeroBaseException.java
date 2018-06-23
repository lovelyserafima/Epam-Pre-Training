package by.epam.preTraining.ArthurLyup.tasks.task10.exceptions;

/**
 * ZeroBaseException is the exception-class which throws exception when user tries to calculate 0^exponent.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

public class ZeroBaseException extends Exception {
    public ZeroBaseException(String msg){
        super(msg);
    }
}
