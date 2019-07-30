package cal;

import cal.calendars.*;

public class Main {
    public static void main(String[] args) {
        MonthCalendar cal = new CurrMonthCalendar();
        System.out.println(cal);
    }
}
