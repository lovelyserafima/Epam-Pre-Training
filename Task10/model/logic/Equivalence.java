package by.epam.preTraining.ArthurLyup.tasks.task10.model.logic;

/**
 * Equivalence is the class of business-logic which checks whether summary of digits of the first number = second
 * number.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NegativeNumberException;

public class Equivalence {
    //constant values
    private static final int GET_DIGIT = 10;
    //summary of digits of the first number = second number ?
    //start
    public static boolean userEquals(int number1, int number2) throws NegativeNumberException {
        if (number1 < 0){
            throw new NegativeNumberException("Exception! Trying to work with negative number: ", number1);
        }
        if (number2 < 0){
            throw new NegativeNumberException("Exception! Trying to work with negative number: ", number2);
        }
        return mainMethod(number1, number2);
    }

    //main algorithm
    private static boolean mainMethod(int number1, int number2){
        if (number1 == 0){
            if (number2 == 0){
                return true;
            }
            return false;
        }
        return mainMethod(number1 / GET_DIGIT, number2 - (number1 % GET_DIGIT));
    }
}

