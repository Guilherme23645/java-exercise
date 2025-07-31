public non-sealed class BRLClock extends Clock{
    @Override
    public Clock convert(final Clock clock) {
        switch (clock) {
            case USAClock usaClock -> {
                this.second = usaClock.getSecond();
                this.minute = usaClock.getMinute();
                this.hour = usaClock.getPeriod().equals("PM") ? usaClock.getHour() + 12 : usaClock.getHour() ;
            }

            case BRLClock brlClock -> {
                this.second = brlClock.getSecond();
                this.minute = brlClock.getMinute();
                this.hour = brlClock.getHour();
            }
        }
        return null;
    }
}
