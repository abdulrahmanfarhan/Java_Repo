package Time;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        setTime(System.currentTimeMillis());
    }

    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    public Time(int hour, int minute, int second) {
        setHoure(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHoure() {
        return hour;
    }

    public void setHoure(int hour) {
        if (hour > 23) {
            System.out.println("Erorr input");
        } else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59) {
            System.out.println("Erorr input");
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59) {
            System.out.println("Erorr input");
        } else {
            this.second = second;
        }
    }

    public void setTime(long time) {
        long totalSeconds = time / 1000;
        this.second = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);

        long totalHour = totalMinutes / 60;
        this.hour = (int) (totalHour % 24);
    }

    @Override
    public String toString() {
        return "Time{" + "hour=" + hour + ": minute=" + minute + ": second=" + second + '}';
    }

}
