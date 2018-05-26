package task_02;

/**
 * Dinosaur is the class which solves following task:
 * Converts weight in kilograms to milligrams, grams and tons.
 *
 * 26 May 2018
 * @Arthur Lyup
 */

public class Dinosaur {
    public Dinosaur(){}

    public static void convertWeight(double weight) {
        System.out.println("\n" + weight +  "kg = " + (weight*1000000) +
                "mg = " + (weight*1000) + "g = " + (weight/1000) +
        " tones");
    }
}
