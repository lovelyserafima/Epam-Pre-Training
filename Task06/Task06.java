package task_06;

/**
 * Task06 is the class with the main method(String[] args).
 *
 * 9 June 2018
 * @author Arthur Lyup
 */

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) throws Exception {
        //standart tests without hardcode
        int n = 5;
        int m = 5;
        MatrInitializer.checkSizeOfMatrix(n, m);
        double[][] matr = new double[n][m];
        double leftBorder = 0.0;
        double rigthBorder = 10.0;
        MatrInitializer.initializeMatrix(matr, leftBorder, rigthBorder);
        System.out.println("Multidimensional array: " + n + "x" + m);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matr[i]));
        }

        System.out.println("Options of the matrix:");
        System.out.println("1)Max element -> " + Matrix.findMaxElement(matr));
        System.out.println("2)Min element -> " + Matrix.findMinElement(matr));
        System.out.println("3)Average arithmetic -> " + Matrix.findAverageArithmetic(matr));
        System.out.println("4)Average geometric -> " + Matrix.findAverageGeometric(matr));
        System.out.println("5)Indexex of local min-> " + Matrix.findPositionOfLocalMin(matr));
        System.out.println("6)Indexex of local max-> " + Matrix.findPositionOfLocalMax(matr));
        System.out.println("7)Transponse matrix:");
        if (Matrix.checkRectangularity(matr)){
            double [][] transMatr = Matrix.transponseRectangularMatrix(matr);
            for (int i = 0; i < transMatr.length; i++){
                System.out.println(Arrays.toString(transMatr[i]));
            }
        } else {
            Matrix.transponseSquareMatrix(matr);
            for (int i = 0; i < matr.length; i++){
                System.out.println(Arrays.toString(matr[i]));
            }
        }

        //special test1 with hardcode (transponsing rectangular matrix)
        System.out.println("\nSpecial test1:");
        double [][] matr1 = {{2.5, 3.4, 1.75},
                            {4.6, 6.7, 2.28},
                            {3.22, 6.66, 13.77},
                            {14.88, 7.77, 1.23}};
        System.out.println("Multidimensional array: " + matr1.length + "x" + matr1[0].length);
        for (int i = 0; i < matr1.length; i++) {
            System.out.println(Arrays.toString(matr1[i]));
        }
        System.out.println("Matrix after transponsing:");
        if (Matrix.checkRectangularity(matr1)){
            double [][] transMatr = Matrix.transponseRectangularMatrix(matr1);
            for (int i = 0; i < transMatr.length; i++){
                System.out.println(Arrays.toString(transMatr[i]));
            }
        } else {
            Matrix.transponseSquareMatrix(matr1);
            for (int i = 0; i < matr1.length; i++){
                System.out.println(Arrays.toString(matr1[i]));
            }
        }

        //special test2 with hardcode (no local min and max)
        System.out.println("\nSpecial test2:");
        matr1 = new double[][]{{1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0}};
        System.out.println("Multidimensional array: " + matr1.length + "x" + matr1[0].length);
        for (int i = 0; i < matr1.length; i++) {
            System.out.println(Arrays.toString(matr1[i]));
        }
        System.out.println("Indexex of local min -> " + Matrix.findPositionOfLocalMin(matr1));
        System.out.println("Indexex of local max -> " + Matrix.findPositionOfLocalMax(matr1));

        //special test3 with hardcode (negative elements of matrix -> no possibility to calculate average geometric)
        System.out.println("\nSpecial test2:");
        matr1 = new double[][]{{-1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0}};
        System.out.println("Multidimensional array: " + matr1.length + "x" + matr1[0].length);
        for (int i = 0; i < matr1.length; i++) {
            System.out.println(Arrays.toString(matr1[i]));
        }
        System.out.println("Average geometric -> " + Matrix.findAverageGeometric(matr1));
    }
}
