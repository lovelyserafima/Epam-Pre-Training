package task_03;

/**
 * MoodSensor is the class which solves the following task:
 * Generate random number which corresponds to any smile.
 *
 * 30 May 2018
 * @author lovelyserafima
 */

import java.util.Random;

public class MoodSensor {
    //smiles
    private static final String BAD_SMILE = ":(";
    private static final String SOSO_SMILE = ":|";
    private static final String EXCELLENT_SMILE = ":)";

    //the empty constructor
    public MoodSensor(){}

    //the main method
    public static String getMood(){
        Random random = new Random();
        final int leftBorder = 0;
        final int rightBorder = 10;
        int number = random.nextInt(rightBorder - leftBorder + 1) + leftBorder;
        if (number < 4){
            return BAD_SMILE;
        } else if (number < 8){
            return SOSO_SMILE;
        } else return EXCELLENT_SMILE;
    }
}
