public non-sealed class USAClock extends Clock {
    private String period;

    public String getPeriod() {
        return period;
    }

    public void setAfterMidDay() {
        this.period = "PM";
    }

    public void setBeforeMidDay() {
        this.period = "AM";
    }
    
    public void setHour(int hour) {
        setBeforeMidDay();
        if ((hour > 12) && (hour <= 23)) {
            setAfterMidDay();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            setBeforeMidDay();
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        return null;
    }
}
