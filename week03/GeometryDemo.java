package week03;

import week03.geometry.Point;
import week03.geometry.Segment;

public class GeometryDemo {
    public static void main(String[] args) {
        System.out.println("Point:");
        {
            Point p1 = new Point(4, 2);
            System.out.println("x point of the first point: " + p1.getX());
            System.out.println("y point of the first point: " + p1.getY());

            Point p2 = new Point(6, 8);
            System.out.println("x point of the second point: " + p2.getX());
            System.out.println("y point of the second point: " + p2.getY());

            double distance = p1.distance(p2);
            System.out.println("Distance is: " + distance);

            boolean equals = p1.equals(p2);
            System.out.println("Are they equal? " + equals);
        }

        System.out.println("Segment:");

        {

            Point p1 = new Point(3, 1);
            System.out.println("x point of the first point: " + p1.getX());
            System.out.println("y point of the first point: " + p1.getY());

            Point p2 = new Point(9, 5);
            System.out.println("x point of the second point: " + p2.getX());
            System.out.println("y point of the second point: " + p2.getY());

            Segment seg = new Segment(10, 15, 15, 20);

            System.out.println("Length is: " + seg.length());

            System.out.println("Are the points of segment line equal? " + p1.equals(p2));

            System.out.println("Slope is: " + seg.getSlope());

            System.out.println("Intercept is: " + seg.getIntercept());

            Point p = new Point(10, 11);

            System.out.println("Is point on Line: " + seg.isOnLine(p));

            System.out.println("Is point on the Segment? " + seg.isOnSegment(p));
        }
    }
}