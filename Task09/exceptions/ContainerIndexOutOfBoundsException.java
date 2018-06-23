package by.epam.preTraining.ArthurLyup.tasks.task09.exceptions;

/**
 * ContainerIndexOutOfBoundsException is the class-exception which throws exception when user tries to work with plane
 * by illegal index (this plane doesn't exist in planelist with entered index)
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

public class ContainerIndexOutOfBoundsException extends Exception {
    private int index;

    public ContainerIndexOutOfBoundsException(String msg, int index){
        super(msg);
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
