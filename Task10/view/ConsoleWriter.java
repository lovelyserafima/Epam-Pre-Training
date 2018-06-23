package by.epam.preTraining.ArthurLyup.tasks.task10.view;

/**
 * ConsoleWriter is the class for printing results to console.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NotNaturalNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.ZeroBaseException;
import by.epam.preTraining.ArthurLyup.tasks.task10.model.logic.ActionWithNumber;
import by.epam.preTraining.ArthurLyup.tasks.task10.model.logic.Equivalence;
import by.epam.preTraining.ArthurLyup.tasks.task10.model.logic.HanoiTower;

public class ConsoleWriter {
    //print summary of digits of number
    public static void printSummaryOfDigitsOfNumber(int number) throws NotNaturalNumberException {
        System.out.println("Summary of digits of number " + number + " = "
                + ActionWithNumber.calculateSummaryOfDigitsOfNumber(number));
    }

    //print pow(x, n)
    public static void printUserPow(double number, int exponent) throws ZeroBaseException, NegativeNumberException {
        System.out.println(number + "^" + exponent + " = " + ActionWithNumber.userPow(number, exponent));
    }

    //print equals(number1, number2)
    public static void printUserEquals(int number1, int number2) throws NegativeNumberException {
        System.out.println("Summary of digits of " + number1 + " = " + number2 + " -> "
                + Equivalence.userEquals(number1, number2));
    }

    //print number fibonacci
    public static void printNumberOfFibonacci(int number){
        System.out.println("The number of Fibonacci with ordinal number " + number + " = "
                + ActionWithNumber.findNumberOfFibonacci(number));
    }

    public static void printHanoiTower(int numberOfRings, char letter1, char letter2, char letter3)
            throws NotNaturalNumberException {
        System.out.println("Hanoi Tower(" + numberOfRings + "," + letter1 + "," + letter2 + "," + letter3 + "):");
        HanoiTower.solveHanoiTower(numberOfRings, letter1, letter2, letter3);
    }
}

