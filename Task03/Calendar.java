package task_03;

/**
 * Calendar is the class which solves the following task:
 * Returns the next day of entered date.
 *
 * 30 May 2018
 * @author Arthur Lyup
 */

public class Calendar {
    //months
    private static final int january = 1;
    private static final int february = 2;
    private static final int march = 3;
    private static final int april = 4;
    private static final int may = 5;
    private static final int june = 6;
    private static final int july = 7;
    private static final int august = 8;
    private static final int september = 9;
    private static final int october = 10;
    private static final int november = 11;
    private static final int december = 12;

    //days
    private static final int firstDay = 1;
    private static final int lastDayOfFebruaryLeapYear =  29;
    private static final int lastDayOfFebruary = 28;
    private static final int lastDayOf31Month = 31;
    private static final int lastDayOf30Month = 30;

    //the empty constructor
    public Calendar(){}

    //the main method
    public static String identifyNextDay(int day, int month, int year) throws Exception {
        checkDate(day, month, year);//check input

        //February
        if (month == february){
            if (day == lastDayOfFebruaryLeapYear){
                return identifyNewMonth(day, month, year);
            } else if (day == lastDayOfFebruary){
                if (checkLeapYear(year)){
                    return identifyTypicalDay(day, month, year);
                } else return identifyNewMonth(day, month, year);
            } else return identifyTypicalDay(day, month, year);
        }

        //January, March, May, July, August, October
        if (month == january || month == march || month == may || month == july || month == august || month == october){
            if (day == lastDayOf31Month){
                return identifyNewMonth(day, month, year);
            }
            return identifyTypicalDay(day, month, year);
        }

        //April, June, September, November
        if (month == april || month == june || month == september || month == november){
            if (day == lastDayOf30Month){
                return identifyNewMonth(day, month, year);
            }
            return identifyTypicalDay(day, month, year);
        }

        if (day == lastDayOf31Month){
            return identifyNewYear(day, month, year);
        }
        return identifyTypicalDay(day, month, year);
    }

    //calculating next dates depending on situation
    private static String identifyTypicalDay(int day, int month, int year){
        return "Next day is " + ++day + "." + month + "." + year;
    }

    private static String identifyNewMonth(int day, int month, int year){
        return "Next day is " + firstDay + "." + ++month + "." + year;
    }

    private static String identifyNewYear(int day, int month, int year){
        return "Next day is " + firstDay + "." + january + "." + ++year;
    }

    //

    private static void checkDate(int day, int month, int year) throws Exception {
        if (day < firstDay || day > lastDayOf31Month){
            throw new Exception("Wrong input! Day belongs to [1, 31]");
        }

        if (month < january || month > december){
            throw new Exception("Wrong input! Month belongs to [1, 12]");
        }

        if (year < 0){
            throw new Exception("Wrong input! Year > 0");
        }

        if (month == february && day > lastDayOfFebruaryLeapYear){
            throw new Exception("Wrong input! February has 28-29 days");
        }

        if (month == february && day == lastDayOfFebruaryLeapYear){
            if (!checkLeapYear(year)){
                throw new Exception("Wrong input! " + year + " isn't a leap year!");
            }
        }

        if (month == april && day > lastDayOf30Month){
            throw new Exception("Wrong input! April has 30 days");
        }

        if (month == june && day > lastDayOf30Month){
            throw new Exception("Wrong input! June has 30 days");
        }

        if (month == september && day > lastDayOf30Month){
            throw new Exception("Wrong input! September has 30 days");
        }

        if (month == november && day > lastDayOf30Month){
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
