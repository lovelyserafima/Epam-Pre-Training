package by.epam.preTraining.ArthurLyup.tasks.task08.exceptions;

/**
 * EmptyContainerException is the class-exception which throws exception when user tries to work with empty container.
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

public class EmptyContainerException extends Exception {
    public EmptyContainerException(String msg){
        super(msg);
    }
}
