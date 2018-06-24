package task_03;

/**
 * Dragon is the class which solves the following task:
 * At a young age, a dragon grows three heads each year, but after he will be 200 years old - only two,
 * and after 300 years - only one. It is assumed that the dragon appears in the light with three heads.
 * The class calculates the number of heads and eyes.
 *
 * 7 June 2018
 * @author Arthur Lyup
 */

public class Dragon {
    private static final int NUMBER_OF_HEADS_FROM_0_TO_200 = 3;
    private static final int NUMBER_OF_HEADS_FROM_200_TO_300 = 2;
    private static final int NUMBER_OF_HEADS_AFTER_300 = 1;
    private static final int NUMBER_OF_EYES = 2;
    //our borders of growing heads
    private static final int BORDER_TWO_HEADS = 200;
    private static final int BORDER_ONE_HEAD = 300;

    //method for calculating heads
    public static int countHeads(double age) throws Exception {
        if (age < 0) {
            throw new Exception("Invalid input parameter! Age of dragon can't be < 0");
        }
        int intAge = (int) age;//type cast because number of heads is integer type
        if (intAge <= BORDER_TWO_HEADS){
            return countHeadsFromZeroTo200(intAge);
        } else if (intAge <= BORDER_ONE_HEAD){
            return countHeadsFrom200To300(intAge);
        } else return countHeadsFrom300ToN(intAge);
    }

    //method for calculating eyes
    public static int countEyes(double age) throws Exception {
        return countHeads(age)*NUMBER_OF_EYES;
    }

    //0 <= n <= 200
    private static int countHeadsFromZeroTo200(int age){
        return NUMBER_OF_HEADS_FROM_0_TO_200*age + NUMBER_OF_HEADS_FROM_0_TO_200;
    }

    //200 < n <= 300
    private static int countHeadsFrom200To300(int age){
        return NUMBER_OF_HEADS_FROM_0_TO_200*BORDER_TWO_HEADS + NUMBER_OF_HEADS_FROM_200_TO_300*(age - BORDER_TWO_HEADS)
                + NUMBER_OF_HEADS_FROM_0_TO_200;
    }

    //300 < n
    private static int countHeadsFrom300ToN(int age){
        return NUMBER_OF_HEADS_FROM_0_TO_200*BORDER_TWO_HEADS + NUMBER_OF_HEADS_FROM_200_TO_300*(BORDER_ONE_HEAD
                - BORDER_TWO_HEADS) + NUMBER_OF_HEADS_AFTER_300*(age - BORDER_ONE_HEAD) + NUMBER_OF_HEADS_FROM_0_TO_200;
    }
}
