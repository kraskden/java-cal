package cal.decorator;

import cal.model.IMonthModel;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MYTitleDecorator extends TitleDecorator {

    private IMonthModel monthModel;

    public MYTitleDecorator(IMonthModel model) {
        super(model);
        this.monthModel = model;
    }

    @Override
    protected String getTitle() {
        String month = Month.of(monthModel.getMonth()).getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        String year = String.valueOf(monthModel.getYear());
        return month + " " + year;
    }
}
