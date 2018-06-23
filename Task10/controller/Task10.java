package by.epam.preTraining.ArthurLyup.tasks.task10.controller;

/**
 * Task10 is the class which tests business-logic.
 *
 * 23 June 2018
 * @author Arthur Lyup
 */

//import statements
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NegativeNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.NotNaturalNumberException;
import by.epam.preTraining.ArthurLyup.tasks.task10.exceptions.ZeroBaseException;
import by.epam.preTraining.ArthurLyup.tasks.task10.util.NumberInitializer;
import by.epam.preTraining.ArthurLyup.tasks.task10.view.ConsoleWriter;

public class Task10 {
    public static void main(String[] args) {
        try{
            //task1
            //init
            int number = NumberInitializer.initIntegerNumber();

            //printing summary of digits of number
            ConsoleWriter.printSummaryOfDigitsOfNumber(number);

            //task2
            //init
            double number2 = NumberInitializer.initDoubleNumber();

            //printing pow(x, n)
            ConsoleWriter.printUserPow(number2, number);

            //task3
            //init number
            int number3 = NumberInitializer.initIntegerNumber();

            //printing equals(number1, number2)
            ConsoleWriter.printUserEquals(number3,number);

            //task4
            //print the number fibonacci
            ConsoleWriter.printNumberOfFibonacci(number3);

            //task*
            //print Hanoi Tower
            ConsoleWriter.printHanoiTower(number,'A', 'B', 'C');
        } catch (NotNaturalNumberException e) {
            System.out.println(e.getNumber() + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage() + e.getNegativeNumber());
        } catch (ZeroBaseException e) {
            System.out.println(e.getMessage());
        }
    }
}

