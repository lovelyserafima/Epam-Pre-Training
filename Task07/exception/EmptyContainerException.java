package by.epam.preTraining.ArthurLyup.tasks.task07.exception;

/**
 * EmptyContainerException is the class-exception which throws exception when user tries to work with empty container.
 *
 * 20 June 2018
 * @author Arthur Lyup
 */

public class EmptyContainerException extends Exception {
    public EmptyContainerException(String msg){
        super(msg);
    }
}
