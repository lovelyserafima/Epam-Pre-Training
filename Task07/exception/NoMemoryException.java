package by.epam.preTraining.ArthurLyup.tasks.task07.exception;

/**
 * NoMemoryException is the class-exception which throws the exception when user tries to add planes in container where
 * there aren't available memory for adding new planes.
 *
 * 20 June 2018
 * @author Arthur Lyup
 */

public class NoMemoryException extends Exception {
    private int availableMemory;
    private int requiredMemory;

    public NoMemoryException(String msg, int availableMemory, int requiredMemory){
        super(msg);
        this.availableMemory = availableMemory;
        this.requiredMemory = requiredMemory;
    }

    public int getAvailableMemory(){
        return availableMemory;
    }

    public int getRequiredMemory(){
        return requiredMemory;
    }
}
