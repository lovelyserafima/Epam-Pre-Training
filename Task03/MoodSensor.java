package task_03;

/**
 * MoodSensor is the class which solves the following task:
 * Generate random number which corresponds to any smile.
 *
 * 7 June 2018
 * @author Arthur Lyup
 */

import java.util.Random;

public class MoodSensor {
    //smiles
    private static final String BAD_SMILE = ":(";
    private static final String SOSO_SMILE = ":|";
    private static final String EXCELLENT_SMILE = ":)";

    //borders of randoming
    private static final int leftBorder = 0;
    private static final int rightBorder = 0;
    private static final int VALUE_FOR_FORMULA = 1;
    private static final int BAD_BORDER = 4;
    private static final int SOSO_BORDER = 8;

    //the main method
    public static String getMood(){
        int number = new Random().nextInt(rightBorder - leftBorder + VALUE_FOR_FORMULA) + leftBorder;
        if (number < BAD_BORDER){
            return BAD_SMILE;
        } else if (number < SOSO_BORDER){
            return SOSO_SMILE;
        } else return EXCELLENT_SMILE;
    }
}
