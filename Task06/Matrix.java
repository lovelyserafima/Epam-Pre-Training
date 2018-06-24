package task_06;

/**
 * Matrix is the class which solves the following tasks:
 * 1)find max and min elements in the matrix
 * 2)find average arithmetic and geometric of elements of matrix
 * 3)find indexes of local min and max
 * 4)transponse matrix
 * 5)check whether matrix is rectangular or not
 *
 * 24 June 2018
 * @author Arthur Lyup
 */

public class Matrix {
    //our constant values
    private static final int FIRST_INDEX_OF_ARRAY = 1;
    private static final double DEFAULT_FOR_COMPOSITION = 1.0;//start value for composition
    private static final double ERROR_CASE = -1.0;//error case

    //max element in matrix
    public static double findMaxElement(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        double max = matr[0][0];
        for (double[] line : matr){
            for (double element : line){
                if (max < element){
                    max = element;
                }
            }
        }
        return max;
    }

    //min element in matrix
    public static double findMinElement(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        double min = matr[0][0];
        for (double[] line : matr){
            for (double element : line){
                if (min > element){
                    min = element;
                }
            }
        }
        return min;
    }

    //calculate average arithmetic
    public static double findAverageArithmetic(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        double sum = 0.0;//start value
        for (double[] line : matr){
            for (double element : line){
                sum += element;
            }
        }
        return sum/(countNumberOfElementsInMatrix(matr));
    }

    //calculate average geometric
    public static double findAverageGeometric(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        if (arePositiveElements(matr)){//if all elements are positive
            double composition = DEFAULT_FOR_COMPOSITION;
            for (double[] line : matr){
                for (double element : line){
                    composition *= element;
                }
            }
            return Math.pow(composition, DEFAULT_FOR_COMPOSITION/(countNumberOfElementsInMatrix(matr)));
        } else {
            return ERROR_CASE;//if there are any negative elements
        }
    }

    //check whether all elements of matrix are positive
    private static boolean arePositiveElements(double[][] matr) throws Exception {
        for (double[] line : matr){
            for (double element : line){
                if (element <= 0.0){
                    return false;
                }
            }
        }
        return true;
    }

    //count number of elements in matrix
    private static int countNumberOfElementsInMatrix(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        int numberOfElementsInMatrix = 0;
        for (int i = 0; i < matr.length; i++){
            numberOfElementsInMatrix += matr[i].length;
        }
        return numberOfElementsInMatrix;
    }

    //find local min of matrix
    public static String findPositionOfLocalMin(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        int middleLengthOfLine = matr.length - FIRST_INDEX_OF_ARRAY;
        for (int i = FIRST_INDEX_OF_ARRAY; i < middleLengthOfLine; i++){
            int middleLengthOfColumn = matr[i].length - FIRST_INDEX_OF_ARRAY;
            for (int j = FIRST_INDEX_OF_ARRAY; j < middleLengthOfColumn; j++){
                if (isLeftLess(matr, i, j) && isUpLess(matr, i, j) && isRightLess(matr, i, j)
                        && isDownLess(matr, i, j)){
                    return "i = " + i + ", " + "j = " + j;
                }
            }
        }
        return "" + ERROR_CASE;//if we won't find
    }

    //find local max of matrix
    public static String findPositionOfLocalMax(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        int middleLengthOfLine = matr.length - FIRST_INDEX_OF_ARRAY;
        for (int i = FIRST_INDEX_OF_ARRAY; i < middleLengthOfLine; i++){
            int middleLengthOfColumn = matr[i].length - FIRST_INDEX_OF_ARRAY;
            for (int j = FIRST_INDEX_OF_ARRAY; j < middleLengthOfColumn; j++){
                if (isLeftMore(matr, i, j) && isUpMore(matr, i, j) && isRightMore(matr, i, j)
                        && isDownMore(matr, i, j)){
                    return "i = " + i + ", " + "j = " + j;
                }
            }
        }
        return "" + ERROR_CASE;//if we won't find
    }

    //checking left element less
    private static boolean isLeftLess(double[][] element, int i, int j){
        return element[i][j] < element[i][j - FIRST_INDEX_OF_ARRAY];
    }

    //checking right element less
    private static boolean isRightLess(double[][] element, int i, int j) {
        return element[i][j] < element[i][j + FIRST_INDEX_OF_ARRAY];
    }

    //checking upper element less
    private static boolean isUpLess(double[][] element, int i, int j) {
        return element[i][j] < element[i - FIRST_INDEX_OF_ARRAY][j];
    }

    //checking bottom element less
    private static boolean isDownLess(double[][] element, int i, int j) {
        return element[i][j] < element[i + FIRST_INDEX_OF_ARRAY][j];
    }

    //checking left element more
    private static boolean isLeftMore(double[][] element, int i, int j){
        return element[i][j] > element[i][j - FIRST_INDEX_OF_ARRAY];
    }

    //checking right element more
    private static boolean isRightMore(double[][] element, int i, int j) {
        return element[i][j] > element[i][j + FIRST_INDEX_OF_ARRAY];
    }

    //checking upper element more
    private static boolean isUpMore(double[][] element, int i, int j) {
        return element[i][j] > element[i - FIRST_INDEX_OF_ARRAY][j];
    }

    //checking bottom element more
    private static boolean isDownMore(double[][] element, int i, int j) {
        return element[i][j] > element[i + FIRST_INDEX_OF_ARRAY][j];
    }

    //transponse square matrix
    public static void transponseSquareMatrix(double [][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = i + FIRST_INDEX_OF_ARRAY; j < matr[i].length; j++) {
                double tmp = matr[i][j];
                matr[i][j] = matr[j][i];
                matr[j][i] = tmp;
            }
        }
    }

    //transponing rectangular matrix
    public static double[][] transponseRectangularMatrix(double[][] matr) throws Exception {
        if (!areValidSizesOfArray(matr)){
            throw new Exception("Wrong input! Irregular sizes of array");
        }
        double [][] transMatr = new double[matr[0].length][matr.length];
        for (int i = 0; i < matr[0].length; i++){
            for (int j = 0; j < matr.length; j++){
                transMatr[i][j] = matr[j][i];
            }
        }
        return transMatr;
    }

    //check whether matrix is rectangular or not
    public static boolean isRectangular (double [][] matr){
        return matr.length != matr[0].length;
    }

    //check input
    private static boolean areValidSizesOfArray(double[][] matr) {
        if (matr.length == 0) {
            return false;
        } else {
            for (int i = 0; i < matr.length; i++){
                if (matr[i].length == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
