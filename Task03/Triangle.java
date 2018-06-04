package task_03;

/**
 * Triangle is the class which solves the following task:
 * Checks if 3 points (x,y) of Cartesian plane can make an triangle.
 * If it is true, check if this triangle is rectangular.
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class Triangle {

    //check triangle
    public static boolean checkTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        double length1 = calculateDistance(x1, y1, x2, y2);//calculating distance between two points
        double length2 = calculateDistance(x1, y1, x3, y3);
        double length3 = calculateDistance(x2, y2, x3, y3);
        return checkMainOptionOfTriangles(length1, length2, length3)
                && checkMainOptionOfTriangles(length2, length3, length1)
                && checkMainOptionOfTriangles(length1, length3, length2);
    }

    //check rectangularity of triangle
    public static boolean checkRectangularTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        if (checkTriangle(x1, y1, x2, y2, x3, y3)){
            double length1 = calculateDistance(x1, y1, x2, y2);//calculating distance between two points
            double length2 = calculateDistance(x1, y1, x3, y3);
            double length3 = calculateDistance(x2, y2, x3, y3);
            return checkPythagoreanTheorem(length1, length2, length3)
                    || checkPythagoreanTheorem(length2, length3, length1)
                    || checkPythagoreanTheorem(length1, length3, length2);
        }
        return false;
    }

    //calculating distance between two points
    private static double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    }

    //the main option of triangles: length1 + length2 < length3, length2 + length3 < length1, length1 + length3 <length2
    private static boolean checkMainOptionOfTriangles(double length1, double length2, double length3){
        return length1 < length2 + length3;
    }

    //Pythagorean theorem
    private static boolean checkPythagoreanTheorem(double length1, double length2, double length3){
        return length1*length1 + length2*length2 == length3*length3;
    }
}
