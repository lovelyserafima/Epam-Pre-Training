package task_02;

/**
 * Dinosaur is the class which solves following task:
 * Converts weight in kilograms to milligrams, grams and tons.
 *
 * 4 June 2018
 * @Arthur Lyup
 */

public class Dinosaur {
    //constants for converting
    private static final int TO_MILLIGRAMMS = 1000000;
    private static final int TO_GRAMS = 1000;
    private static final double TO_TONES = 1000.0;

    //to mg
    public static double convertWeightToMilligramms(double weight) {
        return weight*TO_MILLIGRAMMS;
    }

    //to g
    public static double convertWeightToGrams(double weight) {
        return weight*TO_GRAMS;
    }

    //to tones
    public static double convertWeightToTones(double weight) {
        return weight/TO_TONES;
    }
}
