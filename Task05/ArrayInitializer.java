package task_05;

/**
 * ArrayInitializer is the class which initialize array by randoming numbers.
 *
 * 24 June 2018
 * @author Arthur Lyup
 */

import java.util.Random;

public class ArrayInitializer {
    //initialize array by randoming
    public static void initializeArray(double[] array, double leftBorder, double rightBorder){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextDouble()*(rightBorder - leftBorder) + leftBorder;
        }
    }
}
