package task_04;

/**
 * NaturalNumber is the class which has the following methods:
 * 1)find max digit in the natural number
 * 2)check whether the natural number is palindrome
 * 3)check whether the natural number is simple
 * 4)find all simple deviders of the natural number
 * 5)find GCD and LCM of two natural numbers
 * 6)find the number of different digits in the natural number
 * 7)check whether the natural number is perfect
 *
 * 18 June 2018
 * @author Arthur Lyup
 */

public class NaturalNumber {
    //static final values for operations
    private static final int NUMBER_OF_DIFFERENT_DIGITS_IN_SINGLE_VALUED_NUMBER = 1;//1, 2, 3, ... , 9 has 1 digit
    private static final int FIRST_DIVIDER_OF_ALL_NUMBERS = 1;//all numbers are divided by 1
    private static final int MIN_NATURAL_NUMBER = 1;//natural number = [1, + inf)
    private static final int FIRST_INDEX_OF_ARRAY = 1;
    private static final int CHECK_PARITY = 2;//by division on 2 we check even number
    private static final int GET_MIDDLE = 2;//by division on 2 we get the middle of number
    private static final int UNIQUE_SIMPLE_EVEN_NUMBER = 2;//2 is the only simple even number
    private static final int FIRST_SIMPLE_ODD_NUMBER = 3;//3, 5, 7, 11, 13, ...
    private static final int MIN_PERFECT_NUMBER = 6;//6 - is the min perfect number
    private static final int GET_DIGIT = 10;//by /10 and %10 we get last number and reduce the number
    private static final int MIN_DOUBLEVALUED_NUMBER = 10;//10, 11, 12, 13

    //find max digit in the number
    public static int findMaxDigit(int number) throws Exception {
        checkNumber(number);//check input
        int max = number % GET_DIGIT;
        number /= GET_DIGIT;
        while (number > 0){
            if (number % GET_DIGIT > max){
                max = number % GET_DIGIT;
            }
            number /= GET_DIGIT;
        }
        return max;
    }

    //check whether the number is palindrome
    public static boolean checkPalindrome(int number) throws Exception {
        checkNumber(number);
        if (number < MIN_DOUBLEVALUED_NUMBER){//1,2,3...9 are palindromes
            return true;
        }
        String s = "" + number;
        boolean flag = true;
        int middleOfNumber = s.length()/GET_MIDDLE;
        int length = s.length();
        for (int i = 0; i < middleOfNumber; i++){
            if (s.indexOf(i) != s.indexOf(length - i - FIRST_INDEX_OF_ARRAY)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    //check whether the number is simple
    public static boolean checkSimplicity(int number) throws Exception {
        checkNumber(number);//check input
        if (number < UNIQUE_SIMPLE_EVEN_NUMBER){
            return false;
        } else if (number == UNIQUE_SIMPLE_EVEN_NUMBER){//2 is the only even simple number
            return true;
        } else if (number % CHECK_PARITY == 0){//even numbers aren't simple except 2
            return false;
        } else {
            int sqrrOfNumber = (int)Math.sqrt(number);
            for (int i = FIRST_SIMPLE_ODD_NUMBER; i <= sqrrOfNumber; i+=CHECK_PARITY){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    //find simple dividers of number
    public static String findSimpleDividers(int number) throws Exception {
        checkNumber(number);//check input
        String dividers = "";//our simple dividers
        if (checkSimplicity(number) == false) {//if number isn't simple
            for (int i = FIRST_INDEX_OF_ARRAY; i <= number / GET_MIDDLE; i++) {
                if (number % i == 0) {
                    if (checkSimplicity(i) == true) {
                        dividers += i + " ";
                    }
                }
            }
        } else {//if number is simple, the only one simple divider is the number
            dividers += number;
        }
        return dividers;
    }

    //find GCD of two numbers
    public static int findGCD(int number1, int number2) throws Exception {
        checkNumber(number1);//check input
        checkNumber(number2);
        while (number1 != 0 && number2 != 0){
            if (number1 > number2){
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }
        return number1 + number2;
    }

    //find LCM of two numbers
    public static int findLCM(int number1, int number2) throws Exception {
        checkNumber(number1);//check input
        checkNumber(number2);
        //number1*number2/findGCD(number1, number2) is worse than this expression because of overflowing int
        return number1/findGCD(number1,number2) * number2;
    }

    //count number of different digits in the number
    public static int countNumberOfDifferentDigits(int number) throws Exception {
        checkNumber(number);//check input
        if (number < MIN_DOUBLEVALUED_NUMBER){//if a single-valued number
            return NUMBER_OF_DIFFERENT_DIGITS_IN_SINGLE_VALUED_NUMBER;//1,2,3,...,9 has 1 digit
        }
        int counterOfDifferentDigits = 0;
        for (int i = 0; i < MIN_DOUBLEVALUED_NUMBER; i++){
            int memory = number;
            while(memory > 0){
                if (memory % GET_DIGIT == i){
                    counterOfDifferentDigits++;
                    break;
                }
                memory /= GET_DIGIT;
            }
        }
        return counterOfDifferentDigits;
    }

    //check whether is the number if perfect
    public static boolean checkPerfection(int number) throws Exception {
        checkNumber(number);//check input
        if (number < MIN_PERFECT_NUMBER || checkSimplicity(number) == true){
            return false;
        }
        int sum = FIRST_DIVIDER_OF_ALL_NUMBERS;
        for (int i = UNIQUE_SIMPLE_EVEN_NUMBER; i <= number/GET_MIDDLE; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return number == sum;
    }

    //check input
    private static void checkNumber(int number) throws Exception {
        if (number < MIN_NATURAL_NUMBER){
            throw new Exception("Wrong Input! " + number + " isn't a natural number");
        }
    }
}
