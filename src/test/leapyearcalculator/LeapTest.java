package leapyearcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: GA2PASH
 * Date: 03/09/14
 * Time: 12:07
 * To change this template use File | Settings | File Templates.
 */
public class LeapTest {
    @Test
    public void isCommonYearLeapYear() {
        assertEquals("2001 shouldn't be a leap year", false, Leap.isLeapYear(2001));
    }

    @Test
    public void isLeapYearLeapYear() {
        assertEquals("1996 should be a leap year", true, Leap.isLeapYear(1996));
    }

    @Test
    public void aYearDivisibleBy100IsACommonYearExceptIfAlsoDivisibleBy400() {
        assertEquals("A year divisible by 100 should not be a leap year", false, Leap.isLeapYear(1900));
        assertEquals("A year divisible by 100 and 400 should be a leap year", true, Leap.isLeapYear(2000));
    }

/**
 Write a function that returns true or false depending on
 whether its input integer is a leap year or not.

 A leap year is defined as one that is divisible by 4,
 but is not otherwise divisible by 100 unless it is
 also divisible by 400.

 For example, 2001 is a typical common year and 1996
 is a typical leap year, whereas 1900 is an atypical
 common year and 2000 is an atypical leap year.

 */
}

