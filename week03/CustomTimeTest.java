package week03;

import week03.datetime.CustomTime;

public class CustomTimeTest {
    public static void main(String[] args) {

        // hour, minute, second
        CustomTime time1 = new CustomTime(10, 30, 45);

        // Default constructor
        CustomTime time2 = new CustomTime();

        // hour only
        CustomTime time3 = new CustomTime(8);

        // hour, minute
        CustomTime time4 = new CustomTime(12, 15);

        // Copy constructor
        CustomTime time5 = new CustomTime(time1);

        System.out.println("Time 1 (Universal): " + time1.toUniversalString());
        System.out.println("Time 2 (Standard): "  + time2.toStandardString());
        System.out.println("Time 3 (Universal): " + time3.toUniversalString());
        System.out.println("Time 4 (Standard): " + time4.toStandardString());
        System.out.println("Time 5 (Universal): " + time5.toUniversalString());
    }
}
