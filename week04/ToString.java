package week04;

import week03.datetime.CustomDate;
import week03.datetime.CustomTime;
import week03.geometry.Point;
import week03.geometry.Segment;
import week03.invoice.Invoice;
import week03.math.ComplexNumber;

public class ToString {
    public static void main(String[] args) {

        // Invoice
        Invoice invoice = new Invoice("001", "Hammer", 7, 10.70);
        System.out.println("New version of toString: " + invoice.toString());

        // Segment
        Segment seg = new Segment(10, 15, 15, 20);
        System.out.println("Better looking of Segment: " + seg.toString());

        // Point
        Point p1 = new Point(4, 2);
        System.out.println("Better looking of Point: " + p1.toString());

        // Custom Time
        CustomTime time1 = new CustomTime(10, 30, 45);
        System.out.println("Better looking of Custom Time: " + time1.toString());

        // Custom Date
        CustomDate date1 = new CustomDate(12, 31, 2023);
        System.out.println("Better looking of Custom Date: " + date1.toString());

        // Complex Number
        ComplexNumber nmb1 = new ComplexNumber(4, 6);
        System.out.println("Better looking of Complex Number: " + nmb1.toString());

        // StringBuilder consumes less memory , reducing the memory overhead associated with creating and discarding multiple string objects.
        // This memory usage contributes to better performance compared to regular string.
    }
}
