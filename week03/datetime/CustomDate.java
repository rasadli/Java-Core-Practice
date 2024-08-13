package week03.datetime;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Invalid date");
            // Default date
            this.month = 1;
            this.day = 1;
            this.year = 1900;
        }
    }

    // Getter and setter for month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }

    // Getter and setter for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDay(day, month, year)) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    // Getter and setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    // Displaying date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    // Calculating difference
    public int difference(CustomDate date) {
        int daysInMonth = 31;
        int diffYears = Math.abs(this.year - date.getYear());
        int diffMonths = Math.abs(this.month - date.getMonth());
        int diffDays = Math.abs(this.day - date.getDay());

        int totalDays = diffYears * 365 + diffMonths * daysInMonth + diffDays;
        return totalDays;
    }

    // Comparing dates
    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.getYear() < date2.getYear()) {
            return 1;
        } else if (date1.getYear() > date2.getYear()) {
            return -1;
        } else {
            if (date1.getMonth() < date2.getMonth()) {
                return 1;
            } else if (date1.getMonth() > date2.getMonth()) {
                return -1;
            } else {
                if (date1.getDay() < date2.getDay()) {
                    return 1;
                } else if (date1.getDay() > date2.getDay()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    // Displaying date in formatted way (12 Jan 2020)
    public void displayFormatted() {
        String monthString = getMonthString();
        System.out.println(day + " " + monthString + " " + year);
    }

    // Helper method to get month string
    private String getMonthString() {
        String[] monthNames = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return monthNames[month];
    }

    // Checking valid dates
    private boolean isValidDate(int month, int day, int year) {
        // Basic validation
        if (month < 1 || month > 12 || day < 1 || day > 31 || year < 0) {
            return false;
        }
        // Specific validation for days in each month
        if (month == 2) {
            // Check for leap year
            if (day > 29 || (day == 29 && !isLeapYear(year))) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return false;
            }
        }
        return true;
    }

    // Leap year checker
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Checking valid days
    private boolean isValidDay(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return false;
        }
        // Specific validation for days in each month
        if (month == 2) {
            // Leap year
            if (day > 29 || (day == 29 && !isLeapYear(year))) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(month).append("/").append(day).append("/").append(year);
        return sb.toString();
    }

}
