package enumExample;

public class DayOfWeekClass {

    public static final DayOfWeekClass MONDAY = new DayOfWeekClass("MONDAY", false);
    public static final DayOfWeekClass TUESDAY = new DayOfWeekClass("TUESDAY", false);
    public static final DayOfWeekClass WEDNESDAY = new DayOfWeekClass("WEDNESDAY", false);
    public static final DayOfWeekClass THURSDAY = new DayOfWeekClass("THURSDAY", false);
    public static final DayOfWeekClass FRIDAY = new DayOfWeekClass("FRIDAY", false);
    public static final DayOfWeekClass SATURDAY = new DayOfWeekClass("SATURDAY", true);
    public static final DayOfWeekClass SUNDAY = new DayOfWeekClass("SUNDAY", true);

    private final String name;

    private boolean isDayOff;

    private DayOfWeekClass(String name, boolean isDayOff) {
        this.name = name;
        this.isDayOff = isDayOff;
    }

    public static DayOfWeekClass valueOf(String name) {
        if ("SUNDAY".equals(name)) {
            return SUNDAY;
        }
        if ("SATURDAY".equals(name)) {
            return SATURDAY;
        }
        return MONDAY;
    }

    @Override
    public String toString() {
        return "DayOfWeekClass{" +
                "name='" + name + '\'' +
                ", isDayOff=" + isDayOff +
                '}';
    }
}