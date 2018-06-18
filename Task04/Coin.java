package task_04;

/**
 * Coin is the class which solves the following task:
 * Toss a coin any times and count number of reverses and obverses.
 *
 * 18 June 2018
 * @author Arthur Lyup
 */

import java.util.Random;

public class Coin {
    private static final int FIRST_TOSS = 1;

    public static String tossCoin(int number) throws Exception {
        checkNumber(number);//check input
        Random random = new Random();
        int numberOfObverses = 0;
        for (int i = FIRST_TOSS; i <= number; i++){
            if (random.nextBoolean()){
                numberOfObverses++;
            }
        }
        return number + " tosses of the coin: " + numberOfObverses + " obverses and " + (number - numberOfObverses)
                + " reverses";
    }

    private static void checkNumber(int number) throws Exception {
        if (number < FIRST_TOSS){
            throw new Exception("Wrong input! Number of tosses must be > 0");
        }
    }
}
