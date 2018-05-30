package task_02;

/**
 * Dinosaur is the class which solves following task:
 * Converts weight in kilograms to milligrams, grams and tons.
 *
 * 30 May 2018
 * @Arthur Lyup
 */

public class Dinosaur {
    private static final int MILLIGRAMMS = 1000000;
    private static final int GRAMS = 1000;
    private static final double TONES = 1000.0;
    public Dinosaur(){}

    public static String convertWeight(double weight) {
        return weight +  "kg = " + (weight*MILLIGRAMMS) +
                "mg = " + (weight*GRAMS) + "g = " + weight/TONES +
        " tones";
    }
}
