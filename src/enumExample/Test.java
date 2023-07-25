package enumExample;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        DayOfWeekEnum a = DayOfWeekEnum.SUNDAY;
        System.out.println(a.isDayOff());

        DayOfWeekEnum monday = DayOfWeekEnum.valueOf("MONDAY");
        System.out.println("DayOfWeekEnum.valueOf(6) = " + DayOfWeekEnum.valueOf(6));
        System.out.println(monday);

        System.out.println("DayOfWeekClass.valueOf(\"SUNDAY\") = " + DayOfWeekClass.valueOf("SUNDAY"));

        System.out.println("Arrays.toString(DayOfWeekEnum.values()) = " + Arrays.toString(DayOfWeekEnum.values()));

        System.out.println("DayOfWeekEnum.MONDAY == DayOfWeekEnum.FRIDAY = " + (DayOfWeekEnum.FRIDAY == DayOfWeekEnum.FRIDAY));
        System.out.println("DayOfWeekEnum.MONDAY == DayOfWeekEnum.MONDAY = " + (DayOfWeekEnum.MONDAY == DayOfWeekEnum.MONDAY));

        
    }
}
