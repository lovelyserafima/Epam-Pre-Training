package by.epam.preTraining.ArthurLyup.tasks.task10.model.logic;

/**
 * ActionWithNumber is the class which solves following tasks:
 * 1)calculate summary of digits of natural number.
 * 2)calculate x^n.
 * 3)find the number of Fibonacci by the ordinal number.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NotNaturalNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.ZeroBaseException;

public class ActionWithNumber {
    //constant values
    private static final int ERROR_CASE = -1;
    private static final int MIN_NATURAL_NUMBER = 1;
    private static final int GET_DIGIT = 10;

    //constant values for the number of Fibonacci
    private static final int PREV = 1;
    private static final int PREV_PREV = 2;
    private static final int SECOND_NUMBER = 2;


    //calculate summary of digits of natural number///////////////////////////////////////////
    //start
    public static int calculateSummaryOfDigitsOfNumber(int number) throws NotNaturalNumberException {
        if (!isNaturalNumber(number)){//check input
            throw new NotNaturalNumberException(" isn't a natural number!", number);
        }
        return mainAlgorithm(number);//if it's okay, go to calculate summary
    }

    //calculating summary
    private static int mainAlgorithm(int number){
        if (number < GET_DIGIT){
            return number;
        }
        return number % GET_DIGIT + mainAlgorithm(number/GET_DIGIT);
    }
    /////////////////////////////////////////////////////////////////////////////////////////

    //realization of pow(x, n)/////////////////////////////////////////////////////////////////////////////////////
    //start
    public static double userPow(double number, int exponent) throws ZeroBaseException, NegativeNumberException {
        if (number == 0.0){
            throw new ZeroBaseException("Exception! Trying to calculate 0^exponent");
        }
        if (exponent < 0){
            throw new NegativeNumberException("Exception! Trying to raise to the negative number: ", exponent);
        }
        return mainAlgorithm(number, exponent);
    }

    //main algorithm of realization of pow(x, n)
    private static double mainAlgorithm(double number, int exponent){
        if (exponent == 0){
            return MIN_NATURAL_NUMBER;
        }
        return number*mainAlgorithm(number, exponent - MIN_NATURAL_NUMBER);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //find the digit with some ordinal number in the number of Fibonacci////////////////////
    public static int findNumberOfFibonacci (int number){
        if (number < MIN_NATURAL_NUMBER){
            return ERROR_CASE;
        }
        return mainMethod(number);
    }

    //main method of finding the number of fibonacci
    private static int mainMethod(int number){
        if (number < SECOND_NUMBER){
            return number;
        }
        return mainMethod(number - PREV) + mainMethod(number - PREV_PREV);
    }
    /////////////////////////////////////////////////////////////////////////////////////////

    //checking whether it is natural number
    private static boolean isNaturalNumber(int number) {
        return number >= MIN_NATURAL_NUMBER;
    }
}

