package task_06;

import java.util.Random;

/**
 * MatrInitializer is the class which initialize array by randoming.
 *
 * 24 June 2018
 * @author Arthur Lyup
 */

public class MatrInitializer {
    public static void initializeMatrix(double[][] matr, double leftBorder, double rightBorder){
        Random random = new Random();
        for (int i = 0; i < matr.length; i++){
            for (int j = 0; j < matr[i].length; j++){
                matr[i][j] = random.nextDouble()*(rightBorder - leftBorder) + leftBorder;
            }
        }
    }
}
