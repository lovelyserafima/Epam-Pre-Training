package task_05;

/**
 * ArrayWorker is the class which solves following tasks:
 * 1)find max and min elements of array
 * 2)find average arithmetic and geometric of elements of array
 * 3)check whether elements of array are sorted
 * 4)find indexes of local min and max of array elements
 * 5)reverse array
 *
 * 5 June 2018
 * @author Arthur Lyup
 */

public class ArrayWorker {
    //our constant values
    private static final int ZERO_INDEX_OF_ARRAY = 0;//for array[0]
    private static final int FIRST_INDEX_OF_ARRAY = 1;//for array[1]
    private static final double PRIMARY_VALUE = 1.0;//for 1.0/array,length
    private static final int ERROR_CASE = -1;//error constant
    private static final int GET_MIDDLE = 2;//for array.length/2

    //find max element in array
    public static double findMaxElement(double[] array) throws Exception {
        checkArray(array);//check correct input
        double max = array[ZERO_INDEX_OF_ARRAY];//first element
        for (int i = FIRST_INDEX_OF_ARRAY; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //find min element in array
    public static double findMinElement(double[] array) throws Exception {
        checkArray(array);//check correct input
        double min = array[ZERO_INDEX_OF_ARRAY];//first element
        for (int i = FIRST_INDEX_OF_ARRAY; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //find average arithmetic of elements of array
    public static double findAverageArithmetic(double[] array) throws Exception {
        checkArray(array);//check correct input
        double sum = 0.0;
        for (double element : array){//find numerator
            sum += element;
        }
        return sum/array.length;
    }

    //find average geometric of elements of array
    public static double findAverageGeometric(double[] array) throws Exception {
        checkArray(array);//check correct input
        if (checkPositiveElementsOfArray(array)) {//elements must be > 0
            double composition = PRIMARY_VALUE;//= 1 (default for start value)
            for (double element : array) {//multiplication
                composition *= element;
            }
            return Math.pow(composition, PRIMARY_VALUE / array.length);
        } else {
            return ERROR_CASE;
        }
    }

    //elements for average geometric must be > 0
    private static boolean checkPositiveElementsOfArray(double[] array) {
        for (double element : array){
            if (element <= 0.0){
                return false;
            }
        }
        return true;
    }

    //check whether elements of array are sorted in ascending order
    public static boolean checkIncArray(double[] array) throws Exception {
        checkArray(array);//check correct input
        boolean flag = true;
        for (int i = FIRST_INDEX_OF_ARRAY; i < array.length; i++){
            if (array[i] < array[i - FIRST_INDEX_OF_ARRAY]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    //check whether elements of array are sorted in descending order
    public static boolean checkDecArray(double[] array) throws Exception {
        checkArray(array);//check correct input
        boolean flag = true;
        for (int i = FIRST_INDEX_OF_ARRAY; i < array.length; i++){
            if (array[i] > array[i - FIRST_INDEX_OF_ARRAY]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    //find local minimum of array
    public static int findIndexOfLocalMin(double[] array) throws Exception {
        checkArray(array);//check correct input
        int index = ERROR_CASE;//if we won't find, we return -1
        int length = array.length - FIRST_INDEX_OF_ARRAY;
        for (int i = FIRST_INDEX_OF_ARRAY; i < length; i++){//searc local min
            if (array[i] < array[i - FIRST_INDEX_OF_ARRAY] && array[i] < array[i + FIRST_INDEX_OF_ARRAY]){
                index = i;
                break;
            }
        }
        return index;
    }

    //find local maximim of array
    public static int findIndexOfLocalMax(double[] array) throws Exception {
        checkArray(array);//check correct input
        int index = ERROR_CASE;//if we won't find, we return -1
        int length = array.length - FIRST_INDEX_OF_ARRAY;
        for (int i = FIRST_INDEX_OF_ARRAY; i < length; i++){//searc local max
            if (array[i] > array[i - FIRST_INDEX_OF_ARRAY] && array[i] > array[i + FIRST_INDEX_OF_ARRAY]){
                index = i;
                break;
            }
        }
        return index;
    }

    //reverses array
    public static void reverseArray(double[] array) throws Exception {
        checkArray(array);//check correct input
        int middleOfArray = array.length/GET_MIDDLE;
        for (int i = ZERO_INDEX_OF_ARRAY; i < middleOfArray; i++){
            double tmp = array[i];
            array[i] = array[array.length - i - FIRST_INDEX_OF_ARRAY];
            array[array.length - i - FIRST_INDEX_OF_ARRAY] = tmp;
        }
    }

    //check input
    private static void checkArray(double[] array) throws Exception {
        if (array.length == 0){
            throw new Exception("Wrong Input! Array is empty!");
        }
    }
}

