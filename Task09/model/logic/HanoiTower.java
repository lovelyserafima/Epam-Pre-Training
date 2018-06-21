package by.epam.preTraining.ArthurLyup.tasks.task09.model.logic;

import by.epam.preTraining.ArthurLyup.tasks.task09.exceptions.NotNaturalNumberException;

/**
 * Hanoi tower is the class for solving classical task "Hanoi Tower".
 *
 * 21 June 2018
 * @author Arthur Lyup
 */

public class HanoiTower {
    //constant values
    private static final int MIN_NATURAL_NUMBER = 1;

    //solving Hanoi Tower task
    //start
    public static void solveHanoiTower(int numberOfRings, char letter1, char letter2, char letter3)
            throws NotNaturalNumberException {
        checkNumberOfRings(numberOfRings);
        mainAlgorithm(numberOfRings, letter1, letter2, letter3);
    }

    //main algorithm
    private static void mainAlgorithm(int numberOfRings, char letter1, char letter2, char letter3){
        if (numberOfRings == MIN_NATURAL_NUMBER){
            System.out.println(String.format("%s-->%s", letter1, letter2));
        } else {
            mainAlgorithm(numberOfRings - MIN_NATURAL_NUMBER, letter1, letter3, letter2);
            System.out.println(String.format("%s-->%s", letter1, letter2));
            mainAlgorithm(numberOfRings - MIN_NATURAL_NUMBER, letter3, letter2, letter1);
        }
    }

    //exception method (check whether number of rings > 0)
    private static void checkNumberOfRings(int numberOfRings) throws NotNaturalNumberException {
        if (numberOfRings < MIN_NATURAL_NUMBER){
            throw new NotNaturalNumberException("Exception! Number of rings must be > 0: ", numberOfRings);
        }
    }
}
