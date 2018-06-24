package task_06;

import java.util.Random;

/**
 * MatrInitializer is the class which initialize array by randoming.
 *
 * 24 June 2018
 * @author Arthur Lyup
 */

public class MatrInitializer {
    private static final int ZERO_LINE = 0;
    private static final int ZERO_COLUMN = 0;

    public static void initializeMatrix(double[][] matr, double leftBorder, double rightBorder){
        Random random = new Random();
        for (int i = ZERO_LINE; i < matr.length; i++){
            for (int j = ZERO_COLUMN; j < matr[i].length; j++){
                matr[i][j] = random.nextDouble()*(rightBorder - leftBorder) + leftBorder;
            }
        }
    }
}
