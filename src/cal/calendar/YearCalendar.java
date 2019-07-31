package cal.calendar;

import cal.decorator.MTitleDecorator;
import cal.decorator.YTitleDecorator;
import cal.model.IModel;
import cal.model.IYearModel;
import cal.model.container.TableContainer;
import cal.utils.TextFormatter;

public class YearCalendar extends TableContainer implements IYearModel {

    private final static int DEF_COLS = 3;

    private int year;

    public YearCalendar(int year) {
        super(DEF_COLS);
        this.year = year;
    }

    @Override
    public String toString() {
        for (int i = 1; i <= 12; ++i) {
            add(new MTitleDecorator(new MonthCalendar(i, year)));
        }
        IModel cal = new YTitleDecorator(this);
        return TextFormatter.stringListToString(cal.getRawData());
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

}
