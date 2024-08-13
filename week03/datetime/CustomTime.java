package week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor with three input parameters
    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor with no input
    public CustomTime() {
        this(0, 0, 0);
    }

    // Constructor with one input parameter
    public CustomTime(int hour) {
        this(hour, 0, 0);
    }

    // Constructor with two input parameters
    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Copy constructor
    public CustomTime(CustomTime time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Method to return time in universal format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to return time in standard format (H:MM:SS AM/PM)
    public String toStandardString() {
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, minute, second, period);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", hour)).append(":")
          .append(String.format("%02d", minute)).append(":")
          .append(String.format("%02d", second));
        return sb.toString();
    }

}
