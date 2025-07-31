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

    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USAClock usaClock -> {
                this.hour = usaClock.getHour();
                this.period = usaClock.getPeriod();
            }

            case BRLClock brlClock -> setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.period;
    }
}
