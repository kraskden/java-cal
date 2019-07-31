package cal.calendar;

import cal.decorator.MYTitleDecorator;
import cal.model.container.HorizontalContainer;
import cal.utils.TextFormatter;

import java.time.LocalDate;
import java.util.ArrayList;

public class ThreeMonthCalendar extends HorizontalContainer {

    public ThreeMonthCalendar() {
        super();
        LocalDate start = LocalDate.now().minusMonths(1);
        for (int i = 0; i < 3; ++i) {
            add(new MYTitleDecorator(new MonthCalendar(start.getMonthValue(), start.getYear())));
            start = start.plusMonths(1);
        }
    }

    @Override
    public String toString() {
        ArrayList<String> raw = getRawData();
        return TextFormatter.stringListToString(raw);
    }
}
