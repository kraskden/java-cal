package cal.calendar;

import cal.decorator.MYTitleDecorator;
import cal.model.container.TableContainer;
import cal.utils.TextFormatter;

import java.time.LocalDate;

public class IntervalCalendar extends TableContainer {
    private final static int DEF_COLS = 3;

    public IntervalCalendar(int monthStart, int yearStart, int monthEnd, int yearEnd) {
        super(DEF_COLS);
        LocalDate date = LocalDate.of(yearStart, monthStart, 1);
        LocalDate finish = LocalDate.of(yearEnd, monthEnd, 1);
        while (date.compareTo(finish) <= 0) {
            add(new MYTitleDecorator(new MonthCalendar(date.getMonthValue(), date.getYear())));
            date = date.plusMonths(1);
        }
    }

    public IntervalCalendar(int monthStart, int yearStart, int count) {
        super(DEF_COLS);
        LocalDate date = LocalDate.of(yearStart, monthStart, 1);
        for (int i = 0; i < count; ++i) {
            add(new MYTitleDecorator(new MonthCalendar(date.getMonthValue(), date.getYear())));
            date = date.plusMonths(1);
        }
    }

    @Override
    public String toString() {
        return TextFormatter.stringListToString(getRawData());
    }
}
