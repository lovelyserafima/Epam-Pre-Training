package task_03;

/**
 * Calendar is the class which solves the following task:
 * Returns the next day of entered date.
 *
 * 30 May 2018
 * @author lovelyserafima
 */

public class Calendar {
    //months
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    //days
    private static final int FIRST_DAY = 1;
    private static final int LAST_DAY_OF_FEBRUARY_LEAP_YEAR =  29;
    private static final int LAST_DAY_OF_FEBRUARY = 28;
    private static final int LAST_DAY_31_MONTH = 31;
    private static final int LAST_DAY_30_MONTH = 30;

    //the empty constructor
    public Calendar(){}

    //the main method
    public static String identifyNextDay(int day, int month, int year) throws Exception {
        checkDate(day, month, year);//check input

        //February
        if (month == FEBRUARY){
            if (day == LAST_DAY_OF_FEBRUARY_LEAP_YEAR){
                return identifyNewMonth(day, month, year);
            } else if (day == LAST_DAY_OF_FEBRUARY){
                if (checkLeapYear(year)){
                    return identifyTypicalDay(day, month, year);
                } else return identifyNewMonth(day, month, year);
            } else return identifyTypicalDay(day, month, year);
        }

        //January, March, May, July, August, October
        if (month == JANUARY || month == MARCH|| month == MAY || month == JULY || month == AUGUST || month == OCTOBER){
            if (day == LAST_DAY_31_MONTH){
                return identifyNewMonth(day, month, year);
            }
            return identifyTypicalDay(day, month, year);
        }

        //April, June, September, November
        if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER){
            if (day == LAST_DAY_30_MONTH){
                return identifyNewMonth(day, month, year);
            }
            return identifyTypicalDay(day, month, year);
        }

        if (day == LAST_DAY_31_MONTH){
            return identifyNewYear(day, month, year);
        }
        return identifyTypicalDay(day, month, year);
    }

    //calculating next dates depending on situation
    private static String identifyTypicalDay(int day, int month, int year){
        return "Next day is " + ++day + "." + month + "." + year;
    }

    private static String identifyNewMonth(int day, int month, int year){
        return "Next day is " + FIRST_DAY + "." + ++month + "." + year;
    }

    private static String identifyNewYear(int day, int month, int year){
        return "Next day is " + FIRST_DAY + "." + JANUARY + "." + ++year;
    }

    //

    private static void checkDate(int day, int month, int year) throws Exception {
        if (day < FIRST_DAY || day > LAST_DAY_31_MONTH){
            throw new Exception("Wrong input! Day belongs to [1, 31]");
        }

        if (month < JANUARY || month > DECEMBER){
            throw new Exception("Wrong input! Month belongs to [1, 12]");
        }

        if (year < 0){
            throw new Exception("Wrong input! Year > 0");
        }

        if (month == FEBRUARY && day > LAST_DAY_OF_FEBRUARY_LEAP_YEAR){
            throw new Exception("Wrong input! February has 28-29 days");
        }

        if (month == FEBRUARY && day == LAST_DAY_OF_FEBRUARY_LEAP_YEAR){
            if (!checkLeapYear(year)){
                throw new Exception("Wrong input! " + year + " isn't a leap year!");
            }
        }

        if (month == APRIL && day > LAST_DAY_30_MONTH){
            throw new Exception("Wrong input! April has 30 days");
        }

        if (month == JUNE && day > LAST_DAY_30_MONTH){
            throw new Exception("Wrong input! June has 30 days");
        }

        if (month == SEPTEMBER && day > LAST_DAY_30_MONTH){
            throw new Exception("Wrong input! September has 30 days");
        }

        if (month == NOVEMBER && day > LAST_DAY_30_MONTH){
            throw new Exception("Wrong input! November has 30 days");
        }
    }

    //check correct input
    private static boolean checkLeapYear(int year){
        int four = 4;
        int oneHundred = 100;
        int fourHundred = 400;
        return (year % four == 0 && year % oneHundred != 0 && year % fourHundred != 0) || (year % four == 0
                && year % oneHundred == 0 && year % fourHundred == 0);
    }
}
