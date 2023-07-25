package enumExample;

public enum DayOfWeekEnum {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATUDAY(true),
    SUNDAY(true);

    private boolean isDayOff;

    public boolean isDayOff(){
        return isDayOff;
    }


    DayOfWeekEnum(boolean isDayOff){
        this.isDayOff = isDayOff;
    }
    public static DayOfWeekEnum valueOf( int ordinal){
        if(ordinal >= DayOfWeekEnum.values().length){
            try {
                throw new IllegalAccessException("You ordinal is bigger than enum size");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return DayOfWeekEnum.values()[ordinal];
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "name=" + name() +
                " isDayOff=" + isDayOff +
                '}';
    }
}
