public abstract class Clock {
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

    public abstract Clock convert(Clock clock);
}
