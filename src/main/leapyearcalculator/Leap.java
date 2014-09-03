package leapyearcalculator;

/**
 * Created with IntelliJ IDEA.
 * User: GA2PASH
 * Date: 03/09/14
 * Time: 12:05
 * To change this template use File | Settings | File Templates.
 */
public class Leap {

    public static boolean isLeapYear(int year) {
        return isDivisibleBy(year, 4) && !isAtypicalCommonYear(year);
    }

    private static boolean isAtypicalCommonYear(int year) {
        return (isDivisibleBy(year, 100) && !isDivisibleBy(year, 400));
    }

    public static boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }

}

