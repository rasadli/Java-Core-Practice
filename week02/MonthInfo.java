package week02;

import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        int n = 0;
        String month = "";
        int days = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        //Finding correct month and days of this month
        switch (n) {
            case 1:
                month = "January";
                days = 31;
                break;
            case 2:
                month = "Febuary";
                days = 29;
                break;
            case 3:
                month = "Marth";
                days = 31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "July";
                days = 31;
                break;
            case 8:
                month = "August";
                days = 31;
                break;
            case 9:
                month = "September";
                days = 30;
                break;
            case 10:
                month = "Octomber";
                days = 31;
                break;
            case 11:
                month = "Novomber";
                days = 30;
                break;
            case 12:
                month = "December";
                days = 31;
                break;
            default:
                month = "Unknown";
                break;
        }

        System.out.println(month + ": " + days + " days");

        sc.close();
    }
}
