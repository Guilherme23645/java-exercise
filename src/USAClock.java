public class USAClock extends Clock {
    private String period;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    
    public void setHour(int hour) {
        if ((hour > 12) && (hour <= 23)) {
            this.period = "PM";
            hour = hour - 12;
        } 

        if (hour >= 24) {
            this.period = "AM";
            hour = 0;
        } 
    }

    @Override
    public Clock convert(final Clock clock) {
        return null;
    }
}
