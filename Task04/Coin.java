package task_04;

/**
 *Coin is the class which solves the following task:
 * Toss a coin any times and count number of reverses and obverses.
 *
 * 2 June 2018
 * @author Arthur Lyup
 */

import java.util.Random;

public class Coin {
    private static final int LEFT_BORDER_OF_RANDOMING = 0;
    private static final int RIGHT_BORDER_OF_RANDOMING = 1;

    public static String tossCoin(int number) throws Exception {
        checkNumber(number);
        Random random = new Random();
        int numberOfObverses = 0;
        int numberOfReverses = 0;
        for (int i = 1; i <= number; i++){
            if ((random.nextInt(RIGHT_BORDER_OF_RANDOMING - LEFT_BORDER_OF_RANDOMING + 1) - 1) == LEFT_BORDER_OF_RANDOMING){
                numberOfObverses++;
            } else {
                numberOfReverses++;
            }
        }
        return number + " tosses: " + numberOfObverses + " obverses and " + numberOfReverses + " reverses";
    }

    private static void checkNumber(int number) throws Exception {
        if (number < 1){
            throw new Exception("Wrong input! Number of tosses must be > 0");
        }
    }
}
