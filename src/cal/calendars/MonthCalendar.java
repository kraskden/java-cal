package cal.calendars;

import cal.decorators.MYTitleDecorator;
import cal.models.IModel;
import cal.models.MonthModel;
import cal.utils.TextFormatter;

import java.util.ArrayList;

public class MonthCalendar extends MonthModel {

    public MonthCalendar(int month, int year) {
        super(month, year);
    }

    public String toString() {
        IModel model = new MYTitleDecorator(this);
        ArrayList<String> list = model.getRawData();
        return TextFormatter.stringListToString(list);
    }

}
