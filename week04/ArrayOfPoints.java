package week04;

import week03.geometry.Point;

public class ArrayOfPoints {
    public static void main(String[] args) {
        Point[] points = {
                new Point(4, 5),
                new Point(4, 1),
                new Point(1, 1),
                new Point(2, 3),
                new Point(6, 2)
        };

        Point mostNorthern = points[0];
        Point mostSouthern = points[0];
        Point mostWestern = points[0];
        Point mostEastern = points[0];

        for (int i = 1; i < points.length; i++) {
            Point current = points[i];
            if (current.getY() > mostNorthern.getY()) {
                mostNorthern = current;
            }
            if (current.getY() < mostSouthern.getY()) {
                mostSouthern = current;
            }
            if (current.getX() < mostWestern.getX()) {
                mostWestern = current;
            }
            if (current.getX() > mostEastern.getX()) {
                mostEastern = current;
            }
        }

        System.out.println("Most Northern Point: " + mostNorthern);
        System.out.println("Most Southern Point: " + mostSouthern);
        System.out.println("Most Western Point: " + mostWestern);
        System.out.println("Most Eastern Point: " + mostEastern);
    }
}
