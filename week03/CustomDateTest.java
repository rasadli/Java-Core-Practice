package week03;

import week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {

        CustomDate date1 = new CustomDate(12, 31, 2023);
        // Leap year
        CustomDate date2 = new CustomDate(2, 29, 2020);

        System.out.print("Date 1: ");
        date1.displayDate();
        System.out.print("Date 2: ");
        date2.displayDate();

        System.out.println("Difference in days between Date 1 and Date 2: " + date1.difference(date2));

        int comparisonResult = CustomDate.compare(date1, date2);
        if (comparisonResult == 1) {
            System.out.println("Date 1 is earlier than Date 2");
        } else if (comparisonResult == -1) {
            System.out.println("Date 2 is earlier than Date 1");
        } else {
            System.out.println("Date 1 and Date 2 are the same");
        }

        System.out.print("Formatted Date 1: ");
        date1.displayFormatted();
        System.out.print("Formatted Date 2: ");
        date2.displayFormatted();
    }
}
