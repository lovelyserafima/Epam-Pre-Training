package task_03;

/**
 * Triangle is the class which solves the following task:
 * Checks if 3 points (x,y) of Cartesian plane can make an triangle.
 * If it is true, check if this triangle is rectangular.
 *
 * 29 May 2018
 * @author Arthur Lyup
 */

public class Triangle {
    private static final String NO_TRIANGLE = "These coordinates can't make an triangle.";
    private static final String RECTANGULAR_TRIANGLE = "These coordinates make rectangular triangle.";
    private static final String TRIANGLE = "These coordinates make triangle, but not rectangular.";

    //the empty constructor
    public Triangle(){}

    //the main method of this class
    public static String makeTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        double length1 = calculateDistance(x1, y1, x2, y2);//calculating distance between two points
        if (length1 == 0.0) { //if points coincide
            return NO_TRIANGLE;
        }
        double length2 = calculateDistance(x1, y1, x3, y3);
        if (length2 == 0.0) {
            return NO_TRIANGLE;
        }
        double length3 = calculateDistance(x2, y2, x3, y3);
        if (length3 == 0.0) {
            return NO_TRIANGLE;
        }
        boolean check = ckeckTriangle(length1, length2, length3);//check if points can make an triangle
        if (check){
            check = checkRectangular(length1, length2, length3);//if true, check rectangularity
            if (check){
                return RECTANGULAR_TRIANGLE;
            } else {
                return TRIANGLE;
            }
        }
        return NO_TRIANGLE;
    }

    //calculating distance between two points
    private static double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    }

    //check if points can make an triangle
    //the main option of triangles (a + b < c)
    private static boolean ckeckTriangle(double length1, double length2, double length3){
        return length1 < length2 + length3 && length2 < length1 + length3 && length3 < length1 + length2;
    }

    //check rectangularity of triangle
    //Pythagorean theorem
    private static boolean checkRectangular(double length1, double length2, double length3){
        double max = findMaxLength(length1, length2, length3);
        if (max == length1) {
            return length2*length2 + length3*length3 == length1*length1;
        } else if (max == length2){
            return length1*length1 + length3*length3 == length2*length2;
        } else return length1*length1 + length2*length2 == length3*length3;
    }

    //choose max length (hypotenuse) in triangle
    private static double findMaxLength(double length1, double length2, double length3){
        if (length1 > length2 && length1 > length3) {
            return length1;
        } else if (length2 > length3){
            return length2;
        } else return length3;
    }
}
