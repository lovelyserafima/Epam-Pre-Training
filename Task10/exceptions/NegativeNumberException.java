package by.epam.preTraining.ArthurLyup.tasks.task10.exceptions;

/**
 * NegativeExponentException is the class-exception which throws the exception when user tries to raise to a negative
 * degree.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

public class NegativeNumberException extends Exception {
    private int negativeNumber;

    public NegativeNumberException(String msg, int negativeNumber){
        super(msg);
        this.negativeNumber = negativeNumber;
    }

    public int getNegativeNumber(){
        return negativeNumber;
    }
}

