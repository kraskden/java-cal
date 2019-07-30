package cal.calendars;

import java.time.LocalDate;

public class CurrMonthCalendar extends MonthCalendar {
    public CurrMonthCalendar() {
        super(LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }
}
