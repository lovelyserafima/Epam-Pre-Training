package task_06;

/**
 * Matrix is the class which solves the following tasks:
 * 1)find max and min elements in the matrix
 * 2)find average arithmetic and geometric of elements of matrix
 * 3)find indexex of local min and max
 * 4)transponse matrix
 * 5)check whether matrix is rectangular or not
 *
 * 9 June 2018
 * @author Arthur Lyup
 */

public class Matrix {
    //our constant values
    private static final int ZERO_LINE = 0;//matr[0][]
    private static final int ZERO_COLUMN = 0;//matr[][0]
    private static final int FIRST_INDEX_OF_ARRAY = 1;
    private static final double DEFAULT_FOR_COMPOSITION = 1.0;//start value for composition
    private static final double ERROR_CASE = -1.0;//error case

    //max element in matrix
    public static double findMaxElement(double[][] matr) throws Exception {
        checkSizesOfArray(matr);//check input
        double max = matr[ZERO_LINE][ZERO_COLUMN];
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
        checkSizesOfArray(matr);//check input
        double min = matr[ZERO_LINE][ZERO_COLUMN];
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
        checkSizesOfArray(matr);//check input
        double sum = 0.0;//start value
        for (double[] line : matr){
            for (double element : line){
                sum += element;
            }
        }
        return sum/(matr.length + matr[ZERO_LINE].length);
    }

    //calculate average geometric
    public static double findAverageGeometric(double[][] matr) throws Exception {
        checkSizesOfArray(matr);//check input
        if (checkPositiveElements(matr)){//if all elements are positive
            double composition = DEFAULT_FOR_COMPOSITION;
            for (double[] line : matr){
                for (double element : line){
                    composition *= element;
                }
            }
            return Math.pow(composition, DEFAULT_FOR_COMPOSITION/(matr.length + matr[ZERO_LINE].length));
        } else {
            return ERROR_CASE;//if there are any negative elements
        }
    }

    //check whether all elements of matrix are positive
    private static boolean checkPositiveElements(double[][] matr) throws Exception {
        for (double[] line : matr){
            for (double element : line){
                if (element <= 0.0){
                    return false;
                }
            }
        }
        return true;
    }

    //find local min of matrix
    public static String findPositionOfLocalMin(double[][] matr) throws Exception {
        checkSizesOfArray(matr);//check input
        for (int i = ZERO_LINE; i < matr.length; i++){
            for (int j = ZERO_COLUMN; j < matr[i].length; j++){
                String answer = "i = " + i + ", j = " + j;//answer with indexex
                if (i == ZERO_LINE){//if we check zero line
                    if (j == ZERO_COLUMN){//if we check matr[0][0]
                        if(checkRightLess(matr,i,j) && checkDownLess(matr, i, j)){
                            return answer;
                        }
                    } else if (j > ZERO_LINE && j < matr[i].length - FIRST_INDEX_OF_ARRAY){//if matr[0][1...m-2]
                        if (checkRightLess(matr, i, j) && checkDownLess(matr, i, j) && checkLeftLess(matr, i, j)){
                            return answer;
                        }
                    } else if (checkLeftLess(matr, i, j) && checkDownLess(matr, i, j)){//if matr[0][m-1]
                        return answer;
                    }
                } else if (i < matr.length - FIRST_INDEX_OF_ARRAY){//if matr[1...n-2]
                    if (j == ZERO_COLUMN){//if matr[1...n-2][0]
                        if (checkUpLess(matr, i, j) && checkRightLess(matr, i, j) && checkDownLess(matr, i, j)){
                            return answer;
                        }
                    } else if (j > ZERO_COLUMN && j < matr[i].length - FIRST_INDEX_OF_ARRAY){//if matr[1...n-2][1...m-2]
                        if (checkUpLess(matr, i, j) && checkRightLess(matr, i, j) && checkDownLess(matr, i, j)
                                && checkLeftLess(matr, i, j)){
                            return answer;
                        }
                    } else if (checkUpLess(matr, i, j) && checkLeftLess(matr, i, j) && checkDownLess(matr, i, j)){
                        return answer;//if matr[1...n-2][m-1]
                    }
                } else {//if matr[n-1][0]
                    if (j == ZERO_COLUMN){
                        if (checkUpLess(matr, i, j) && checkRightLess(matr, i, j)){
                            return answer;
                        }
                    } else if (j > ZERO_COLUMN && j < matr[i].length - FIRST_INDEX_OF_ARRAY){//if matr[n-1][1...m-2]
                        if (checkUpLess(matr, i, j) && checkRightLess(matr, i, j)&& checkLeftLess(matr, i, j)){
                            return answer;
                        }
                    } else if (checkUpLess(matr, i, j) && checkLeftLess(matr, i, j)) {//if matr[n-1][m-1]
                        return answer;
                    }
                }
            }
        }
        return "" + ERROR_CASE;//if we won't find
    }

    //find local max of matrix
    public static String findPositionOfLocalMax(double[][] matr) throws Exception {
        checkSizesOfArray(matr);//check input
        for (int i = ZERO_LINE; i < matr.length; i++){
            for (int j = ZERO_COLUMN; j < matr[i].length; j++){
                String answer = "i = " + i + ", j = " + j;//answer with indexex
                if (i == ZERO_LINE){//if we check zero line
                    if (j == ZERO_COLUMN){//if we check matr[0][0]
                        if(checkRightMore(matr,i,j) && checkDownMore(matr, i, j)){
                            return answer;
                        }
                    } else if (j > ZERO_LINE && j < matr[i].length - FIRST_INDEX_OF_ARRAY){//if matr[0][1...m-2]
                        if (checkRightMore(matr, i, j) && checkDownMore(matr, i, j) && checkLeftMore(matr, i, j)){
                            return answer;
                        }
                    } else if (checkLeftMore(matr, i, j) && checkDownMore(matr, i, j)){//if matr[0][m-1]
                        return answer;
                    }
                } else if (i < matr.length - FIRST_INDEX_OF_ARRAY){//if matr[1...n-2]
                    if (j == ZERO_COLUMN){//if matr[1...n-2][0]
                        if (checkUpMore(matr, i, j) && checkRightMore(matr, i, j) && checkDownMore(matr, i, j)){
                            return answer;
                        }
                    } else if (j > ZERO_COLUMN && j < matr[i].length - FIRST_INDEX_OF_ARRAY){//if matr[1...n-2][1...m-2]
                        if (checkUpMore(matr, i, j) && checkRightMore(matr, i, j) && checkDownMore(matr, i, j)
                                && checkLeftMore(matr, i, j)){
                            return answer;
                        }
                    } else if (checkUpMore(matr, i, j) && checkLeftMore(matr, i, j) && checkDownMore(matr, i, j)){
                        return answer;//if matr[1...n-2][m-1]
                    }
                } else {//if matr[n-1][0]
                    if (j == ZERO_COLUMN){
                        if (checkUpMore(matr, i, j) && checkRightMore(matr, i, j)){
                            return answer;
                        }
                    } else if (j > ZERO_COLUMN && j < matr[i].length - FIRST_INDEX_OF_ARRAY){//if matr[n-1][1...m-2]
                        if (checkUpMore(matr, i, j) && checkRightMore(matr, i, j) && checkLeftMore(matr, i, j)){
                            return answer;
                        }
                    } else if (checkUpMore(matr, i, j) && checkLeftMore(matr, i, j)) {//if matr[n-1][m-1]
                        return answer;
                    }
                }
            }
        }
        return "" + ERROR_CASE;//if we won't find
    }

    //checking left element less
    private static boolean checkLeftLess(double[][] element, int i, int j){
        return element[i][j] < element[i][j - FIRST_INDEX_OF_ARRAY];
    }

    //checking right element less
    private static boolean checkRightLess(double[][] element, int i, int j) {
        return element[i][j] < element[i][j + FIRST_INDEX_OF_ARRAY];
    }

    //checking upper element less
    private static boolean checkUpLess(double[][] element, int i, int j) {
        return element[i][j] < element[i - FIRST_INDEX_OF_ARRAY][j];
    }

    //checking bottom element less
    private static boolean checkDownLess(double[][] element, int i, int j) {
        return element[i][j] < element[i + FIRST_INDEX_OF_ARRAY][j];
    }

    //checking left element more
    private static boolean checkLeftMore(double[][] element, int i, int j){
        return element[i][j] > element[i][j - FIRST_INDEX_OF_ARRAY];
    }

    //checking right element more
    private static boolean checkRightMore(double[][] element, int i, int j) {
        return element[i][j] > element[i][j + FIRST_INDEX_OF_ARRAY];
    }

    //checking upper element more
    private static boolean checkUpMore(double[][] element, int i, int j) {
        return element[i][j] > element[i - FIRST_INDEX_OF_ARRAY][j];
    }

    //checking bottom element more
    private static boolean checkDownMore(double[][] element, int i, int j) {
        return element[i][j] > element[i + FIRST_INDEX_OF_ARRAY][j];
    }

    //transponse square matrix
    public static void transponseSquareMatrix(double [][] matr) throws Exception {
        checkSizesOfArray(matr);//check input
        for (int i = ZERO_LINE; i < matr.length; i++) {
            for (int j = i + FIRST_INDEX_OF_ARRAY; j < matr[i].length; j++) {
                double tmp = matr[i][j];
                matr[i][j] = matr[j][i];
                matr[j][i] = tmp;
            }
        }
    }

    //transponing rectangular matrix
    public static double[][] transponseRectangularMatrix(double[][] matr) throws Exception {
        checkSizesOfArray(matr);//check input
        double [][] transMatr = new double[matr[ZERO_LINE].length][matr.length];
        for (int i = ZERO_LINE; i < matr[ZERO_LINE].length; i++){
            for (int j = ZERO_COLUMN; j < matr.length; j++){
                transMatr[i][j] = matr[j][i];
            }
        }
        return transMatr;
    }

    //check whether matrix is rectangular or not
    public static boolean checkRectangularity (double [][] matr){
        return matr.length != matr[ZERO_LINE].length;
    }

    //check input
    private static void checkSizesOfArray(double[][] matr) throws Exception {
        if (matr.length == ZERO_LINE || matr[ZERO_LINE].length == ZERO_COLUMN){
            throw new Exception("Worng input! Irregular sizes of array");
        }
    }
}
