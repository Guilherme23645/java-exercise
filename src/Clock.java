public sealed abstract class Clock permits BRLClock, USAClock{
    protected int hour;
    protected int minute;
    protected int second;
    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour > 24 ? 24 : hour ;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute > 60 ? 60 : minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second > 60 ? 60 : second;
    }

    private String format(int value) {
        return value < 10 ? "0"+value : Integer.toString(value) ;
    }

    public String getTime() {
        return format(hour)+":"+format(minute)+":"+format(second);
    }

    public abstract Clock convert(Clock clock);
}
