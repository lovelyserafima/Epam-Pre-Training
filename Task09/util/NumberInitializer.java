package by.epam.preTraining.ArthurLyup.tasks.task09.util;

/**
 * NumberInitializer is the class for random initialization of input values.
 *
 * 21 June 2018
 */

import sun.java2d.pipe.ValidatePipe;

import java.util.Random;

public class NumberInitializer {
    //constant values
    private static final int LEFT_INT_BORDER = 1;
    private static final int VALUE_FOR_FORMULA = 1;
    private static final int RIGHT_INT_BORDER = 50;
    private static final double LEFT_DOUBLE_BORDER = -50.0;
    private static final double RIGHT_DOUBLE_BORDER = 50.0;

    //initialization of integer number
    public static int initIntegerNumber(){
        return new Random().nextInt(RIGHT_INT_BORDER - LEFT_INT_BORDER + VALUE_FOR_FORMULA) - VALUE_FOR_FORMULA;
    }

    //initialization of double number(){
    public static double initDoubleNumber(){
        return new Random().nextDouble()*(RIGHT_DOUBLE_BORDER - LEFT_DOUBLE_BORDER + VALUE_FOR_FORMULA)
                - VALUE_FOR_FORMULA;
    }
}
