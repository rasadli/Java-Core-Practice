package week04;

public class Histogram {
    public static void main(String[] args) {

        int[] grades = { 2, 4, 5, 9, 10, 4, 4, 4, 2, 3, 5, 8, 6, 7, 7, 7, 6, 5 };

        int[] histogram = new int[11];

        for (int grade : grades) {

            histogram[grade]++;

        }

        printHistogram(histogram);

        calcuateMean(grades);

        calcuateMode(histogram);

        calcuateMedian(grades);
    }

    public static void printHistogram(int[] histogram) {

        int gradeCount;

        for (int i = 0; i < histogram.length; i++) {

            System.out.print(i + ": ");

            gradeCount = histogram[i];

            for (int j = 0; j < gradeCount; j++) {

                System.out.print("> ");

            }

            System.out.println(gradeCount);

        }

    }

    public static void calcuateMean(int[] grades) {

        int sum = 0;
        double mean;

        for (int grade : grades) {

            sum += grade;

        }

        mean = sum / grades.length;

        System.out.println("Mean: " + mean);

    }

    public static void calcuateMode(int[] histogram) {

        int frequency = 0;
        int mode = 0;

        for (int i = 0; i < histogram.length; i++) {

            if (histogram[i] > frequency) {

                frequency = histogram[i];
                mode = i;

            }

        }

        System.out.println("Mode: " + mode);

    }

    public static void calcuateMedian(int[] grades) {

        int n = grades.length;

        // change the numbers in increasing order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (grades[j] > grades[j + 1]) {
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }

        // Calculate median
        double median;

        if (n % 2 == 0) {

            median = (grades[n / 2 - 1] + grades[n / 2]) / 2.0;

        } else {

            median = grades[n / 2];

        }

        System.out.println("Median: "+median);

    }

}
