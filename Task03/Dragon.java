package task_03;

/**
 * Dragon is the class which solves the following task:
 * At a young age, a dragon grows three heads each year, but after he will be 200 years old - only two,
 * and after 300 years - only one. It is assumed that the dragon appears in the light with three heads.
 * The class calculates the number of heads and eyes.
 *
 * 29 May 2018
 * @author Arthur Lyup
 */

public class Dragon {
    private static final int numberOfHeads = 3;
    private static final int numberOfEyes = 2;
    //our borders of growing heads
    private static final int threeHeads = 0;
    private static final int twoHeads = 200;
    private static final int oneHead = 300;

    //the empty constructor
    public Dragon(){}

    //method for calculating heads
    public static int countHeads(double age) throws Exception {
        checkCorrectInput(age);
        int intAge = (int) age;//type cast because number of heads is integer type
        if (intAge <= twoHeads){
            return countHeadsFromZeroTo200(intAge);
        } else if (intAge <= oneHead){
            return countHeadsFrom200To300(intAge);
        } else return countHeadsFrom300ToN(intAge);
    }

    //method for calculating eyes
    public static int countEyes(double age) throws Exception {
        return countHeads(age)*numberOfEyes;
    }

    //0 <= n <= 200
    private static int countHeadsFromZeroTo200(int age){
        return numberOfHeads*age + numberOfHeads;
    }

    //200 < n <= 300
    private static int countHeadsFrom200To300(int age){
        return numberOfHeads*twoHeads + (numberOfHeads - 1)*(age - twoHeads) + numberOfHeads;
    }

    //300 < n
    private static int countHeadsFrom300ToN(int age){
        return numberOfHeads*twoHeads + (numberOfHeads - 1)*(oneHead - twoHeads) + (numberOfHeads - 2)*(age - oneHead)
                + numberOfHeads;
    }

    private static void checkCorrectInput(double age) throws Exception {
        if (age < 0) {
            throw new Exception("Invalid input parameter! Age of dragon can't be < 0");
        }
    }


}
