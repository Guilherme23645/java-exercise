public non-sealed class BRLClock extends Clock{
    @Override
    public Clock convert(final Clock clock) {
        switch (clock) {
            case USAClock usaClock -> this.hour = usaClock.getPeriod().equals("PM") ? usaClock.getHour() + 12 : usaClock.getHour() ;

            case BRLClock brlClock -> this.hour = brlClock.getHour();
        }
        return null;
    }
}
