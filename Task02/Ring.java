package task_02;

/**
 * Ring is the class which solves following task:
 * Find the area of the ring whose outer radius is
 * R1, and the inner radius is R2.
 *
 * 30 May 2018
 * @author Arthur Lyup
 */

public class Ring {
    /*
    Algorithm:
    To find the square of ring we need to calculate squares of circles with
    outer radius and inner radius. Big square - Small square = answer.
     */
    public Ring(){}

    public static double findSquare(double R1, double R2) {
        double inSquare = findSquareOfCircle(R2);//Square of small circle
        double outSquare = findSquareOfCircle(R1);//Square of big circle
        return outSquare - inSquare;
    }

    private static double findSquareOfCircle(double R1){
        return Math.PI*R1*R1;
    }
}
