package Practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if(hour < 0 || hour > 23) {
            throw new IllegalArgumentException("hour must be between 0 and 23");
        }
        if(minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute must be between 0 and 59");
        }
        if(second < 0 || second > 59) {
            throw new IllegalArgumentException("second must be between 0 and 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int display_hour = hour % 12;
        if(display_hour == 0){
            display_hour = 12;
        }
        String amPm = (hour < 12 ) ? "AM" : "PM";

        return String.format("%02d:%02d:%02d", display_hour, minute, second) + amPm;
    }

    public Time add(Time other){
        int totalSeconds = this.second + other.second;
        int totalMinutes = this.minute + other.minute;
        int totalHours = this.hour + other.hour;

        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;

        totalHours += totalMinutes / 60;
        totalMinutes %= 60;

        totalHours %= 24;
        return new Time(totalHours, totalMinutes, totalSeconds);
    }

    public static Time add(Time t, Time t2){
        return t.add(t2);
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4,24,33);
        t.add(t2);
    }
}


