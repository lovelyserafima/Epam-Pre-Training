package task_05;

import java.util.Random;

/**
 * ArrayInitializer is the class which initialize array by randoming numbers.
 *
 * 5 June 2018
 * @author Arthur Lyup
 */

public class ArrayInitializer {
    //initialize array by randoming
    public static void initializeArray(double[] array, double leftBorder, double rightBorder){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextDouble()*(rightBorder - leftBorder) + leftBorder;
        }
    }

    //check input
    private static void checkArray(double[] array) throws Exception {
        if (array.length == 0){
            throw new Exception("Wrong Input! Array is empty!");
        }
    }
}
