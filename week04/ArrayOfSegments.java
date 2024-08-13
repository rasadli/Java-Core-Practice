package week04;

import week03.geometry.*;

public class ArrayOfSegments {
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(4, 1);
        Point p3 = new Point(1, 1);

        Segment[] segments = {
                new Segment(p2, p1),
                new Segment(p3, p2),
                new Segment(p3, p1)
        };

        Segment[] minSegments = getMinSegments(segments);

        // Print the segments with the minimum length
        System.out.println("Segments with the minimum length: ");
        for (Segment segment : minSegments) {
            System.out.println(segment);
        }
    }

    static Segment[] getMinSegments(Segment[] segments) {
        if (segments.length == 0) {
            // If the array is empty, return an empty array
            return new Segment[0];
        }

        float min = segments[0].length();
        int count = 0; // Number of segments with minimum length
        Segment[] minSegments = new Segment[segments.length]; // To store segments with minimum length

        // Find the minimum length
        for (Segment segment : segments) {
            float length = segment.length();

            if (length < min) {

                min = length;

                // Reset count since we found a smaller segment
                count = 1;

                // Reset the minSegments array with the new smallest segment
                minSegments[0] = segment;

            } else if (length == min) {

                // If the length is equal to the minimum, add the segment to the minSegments array
                minSegments[count++] = segment;

            }
        }

        // Trim the minSegments array to remove any unused slots
        Segment[] result = new Segment[count];
        
        for (int i = 0; i < count; i++) {

            result[i] = minSegments[i];

        }
        return result;
    }
}
