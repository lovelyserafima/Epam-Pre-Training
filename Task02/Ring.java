package task_02;

/**
 * Ring is the class which solves following task:
 * Find the area of the ring whose outer radius is
 * R1, and the inner radius is R2.
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class Ring {
    /*
    Algorithm:
    To find the square of ring we need to calculate squares of circles with
    outer radius and inner radius. Big square - Small square = answer.
     */
    public static double findSquareOfRing(double r1, double r2) {
        return findSquareOfCircle(r1) - findSquareOfCircle(r2);
    }

    private static double findSquareOfCircle(double r1){
        return Math.PI*r1*r1;
    }
}
